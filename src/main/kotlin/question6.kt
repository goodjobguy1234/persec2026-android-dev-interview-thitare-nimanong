
/***
f([1, 3, 5], 5) => [1, 3, 5, 9, 17]
f([2, 2, 2], 3) => [2, 2, 2]
f([10, 10, 10], 4) => [10, 10, 10, 30]

edge case size tribo is less than actual needed value
f([10], 4)  --> shold not do anything, error (assumption)
f([2], 0) --> [2]] ? --> assumption error? result < actual fibo

 I assume that edge case will both return the same list due to can't full filled trobonacci
 */


fun tribonacci(initial: List<Int>, numberFibo: Int): List<Int> {
    val n = numberFibo - initial.size
    val modifiedList = initial.toMutableList()
    if (initial.size < 3) return initial

    if (n > 0) {
        repeat(n) {
            val pivot = modifiedList.size
            val start = pivot - 3
            val newValue = IntRange(start, pivot - 1).sumOf { index ->
                modifiedList[index]
            }
            modifiedList.add(newValue)
        }
    }
    return modifiedList
}

fun main(args: Array<String>) {
    val testCase1 = listOf(1, 3, 5)
    println(tribonacci(testCase1, 5))

    val testCase2 = listOf(2, 2, 2)
    println(tribonacci(testCase2, 3))

    val testCase3 = listOf(10, 10, 10)
    println(tribonacci(testCase3, 4))

    val testCase4 = emptyList<Int>()
    println(tribonacci(testCase4, 4))

    val testCase5 = listOf(10)
    println(tribonacci(testCase5, 4))
}