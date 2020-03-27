package Preliminaries

import TestUtil.Case
import TestUtil.runCases

// Goal: Get all these cases to pass by changing the code
fun main() {
    val cases = listOf(
        Case("Destructing pairs") {
            val pair = Pair("Harsh Deep", "Uncaring") // change
            val (first, second) = pair
            first == "Harsh Deep" && second == "Kind"
        },

        Case("Destructing maps", 2.0) {
            val map = mapOf("one" to 1, "two" to 2)
            val (key, value) = map.entries.last() // change
            key == "one" && value == 1
        },

        Case("Destructing in lambdas", 2.0) {
            var keySum = 0
            var valueSum = 0
            mapOf(1 to 1, 2 to 4, 3 to 9).forEach { (key, value) ->
                // only change inside here
            }
            keySum == 6 && valueSum == 14
        }
    )
    runCases(cases)
}