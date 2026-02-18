/***
[“TH19”, “SG20” , “TH2”] => [ “SG20” , “TH2”, “TH19”,]
[“TH10”, “TH3Netflix” , “TH1”, “TH7”] => [ “TH1”, “TH3Netflix” , “TH7”, “TH10”]

region vpn -> format <country><number>
 sorted by assumption: <Prefix> : <Int>
 */

fun question2(arrayString: Array<String>): Array<String> {
    return arrayString.toList().sortedWith(
        compareBy<String> { it.takeWhile {
                ch -> ch.isLetter()
        } }.thenBy {
                it.dropWhile { ch -> ch.isLetter() }.takeWhile {
                    it.isDigit()
                }.toIntOrNull() ?: 0
            }
    ).toTypedArray()
}

fun main(args: Array<String>) {
    val testCase = listOf<Array<String>>(
        arrayOf("TH19", "SG20", "TH2"),
        arrayOf("TH10", "TH3Netflix", "TH1", "TH7"),
//        test case another
        arrayOf("TH10", "THNetflix", "TH1", "TH7")
    )

    testCase.forEach {
        println(question2(it).toList().toString())
    }
}