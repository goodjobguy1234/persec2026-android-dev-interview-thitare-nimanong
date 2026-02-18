/***
 * question 3:
 */

fun autoComplete(search: String, items: Array<String>, maxResult: Int): Array<String> {
    return items.toList().filterNot {
        it.indexOf(search, ignoreCase = true) == -1
    }.sortedWith(
        compareBy {
            it.indexOf(search, ignoreCase = true)
        }
    ).take(maxResult).toTypedArray()
}

fun main(args: Array<String>) {
    val testCase = listOf(
        "Mother", "Think", "Worthy", "Apple", "Android"
    ).toTypedArray()
    println(  autoComplete("th", testCase, 2).toList().toString())
}