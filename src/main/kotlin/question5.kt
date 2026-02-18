import java.lang.Error

/***
 * question5:
3008 => 8300
1989 => 9981
2679 => 9762
9163 => 9631
 */

fun sortNumber(positiveInt: Int): Int {
    if (positiveInt < 0) throw Error("this is negative number")
    val arrayOfDigit = positiveInt.toString().map {
        it.digitToInt()
    }.sortedDescending()
    return arrayOfDigit.joinToString("").toInt()
}

fun main(args: Array<String>) {
    val testCase = listOf(
        3008,
        1989,
        2679,
        9163,
//        new test case
        0,
        1168
    )

    testCase.forEach {
        println(sortNumber(it))
    }
}