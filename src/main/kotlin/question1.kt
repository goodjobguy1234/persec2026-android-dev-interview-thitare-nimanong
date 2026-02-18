/***
 * question1:
'(', '[', '{', '}', ']', ')'

expected: counted parenthesis must be even number
edge case: ""
edge case: "("
edge case "(]"

question test case:
"()" => true
"([]]" => false
"([{}])" => true
"([[{}]]]" => false
")" => false
"(]}])" => false
"([)]" => false
"{" => false
 */

//todo write test and handle edge case if number is negative
fun correctParenthesis(stringParenthesis: String): Boolean {
    // if not even then it not possible
    if ((stringParenthesis.length % 2) != 0) {
        return false
    }

    val stringMapTable = mapOf<String, String>(
        "(" to ")",
        "[" to "]",
        "{" to "}"
    )

    val middleStartString = stringParenthesis.subSequence(0, (stringParenthesis.count() / 2))
    val middleEndString = stringParenthesis.subSequence(stringParenthesis.count() / 2, stringParenthesis.count()).map {
        it.toString()
    }.reversed()
    val neededCouple = middleStartString.map {
        stringMapTable.getValue(it.toString()).toString()
    }

    return neededCouple == middleEndString
}

fun main(args: Array<String>) {
    val happyCase = listOf(
        "()",
        "([]]",
        "([{}])",
        "([[{}]]]",
        ")",
        "(]}])",
        "([)]",
        "{"
    )
    happyCase.forEach {
        println(correctParenthesis(it))
    }
}