/***
 */

fun intToRomanNumerals(number: Int): String {
    val romanTable = mutableMapOf<Int, String>(
        1 to "I",
        5 to "V",
        10 to "X",
        50 to "L",
        100 to "C",
        500 to "D",
        1000 to "M"
    )

//   300 --> CCC
//    900 --> CM --> 100 - 1,000
//    11 --> XI --> 10 + 1

    romanTable.keys
    return ""
}

fun romanNumeralsToInt(roman: String): Int {
    val romanTable = mutableMapOf<String, Int>(
        "I" to 1,
        "V" to 5,
        "X" to 10,
        "L" to 50,
        "C" to 100,
        "D" to 500,
        "M" to 1000
    )

    var total = 0

    for (i in roman.indices) {
        val current = romanTable[roman[i].toString()] ?: 0

        if (i < roman.length - 1) {
            val next = romanTable[roman[i + 1].toString()] ?: 0
            if (current < next) {
                total -= current
            } else {
                total += current
            }
        } else {
            total += current
        }
    }
    return total
}

fun main(args: Array<String>) {
    val testcase1 = romanNumeralsToInt("CM")
    println(testcase1)

    val testcase2 = romanNumeralsToInt("MCMLXXXIX")
    println(testcase2)

    val testcase3 = romanNumeralsToInt("MM")
    println(testcase3)
}