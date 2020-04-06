package Preliminaries

// Goal: Get all these cases to pass by changing the code
fun main() {
    case("Destructing pairs") {
        val pair = Pair("Harsh Deep", "Uncaring") // change
        val (first, second) = pair
        first == "Harsh Deep" && second == "Kind"
    }

    case("Destructing maps", 2.0) {
        val map = mapOf("one" to 1, "two" to 2)
        val (key, value) = map.entries.last() // change
        key == "one" && value == 1
    }

    case("Destructing in lambdas", 2.0) {
        var keySum = 0
        var valueSum = 0
        mapOf(1 to 1, 2 to 4, 3 to 9).forEach { (key, value) ->
            // only change inside here
        }
        keySum == 6 && valueSum == 14
    }

}

fun case(name: String, weight: Double = 1.0, code: () -> Boolean): Boolean {
    val result = code()
    val resultDisplay = if (result) "PASSED" else "FAILED"
    println("TEST $name -> $resultDisplay ($weight)")

    return result
}