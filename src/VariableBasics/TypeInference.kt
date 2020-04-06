package VariableBasics

// There is no really good way to test if you are using type inference or not
// so basically the goal here is to remove all type declares and still have
// a full score
fun main() {
    case("Declaring random variables") {
        val a: Int = 5
        val b: Int = 10
        val name: String = "CS 199 IKP"
        val gpa: Float = 4.0f
        val score: Double = 99.8

        a == 5 && b == 10 && name == "CS 199 IKP" && gpa == 4.0f && score == 99.8
    }

    case("Declaring lists") {
        val array1: Array<Int> = arrayOf(0, 1, 4, 9, 16)
        val list1: List<Int> = listOf(0, 1, 4, 9, 16)
        val map1: Map<Int, Int> = mapOf(0 to 0, 1 to 1, 2 to 4, 3 to 9, 4 to 16)

        val array2: Array<Int> = Array(5) { it*it }
        val list2: List<Int> = List(5) {it*it}
        val map2: Map<Int, Int> = (Array(5) {it}).associate {it to it*it}

        array1.contentEquals(array2) && list1 == list2 && map1 == map2
    }
}

fun case(name: String, weight: Double = 1.0, code: () -> Boolean): Boolean {
    val result = code()
    val resultDisplay = if (result) "PASSED" else "FAILED"
    println("TEST $name -> $resultDisplay ($weight)")

    return result
}