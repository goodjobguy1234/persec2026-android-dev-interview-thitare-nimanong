import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Question2Test {
    @Test
    fun `give input have only prefix then order by unicode first string`() {
//        Given
        val input = arrayOf("TH", "SG", "CH")
//        When
        val result = question2(input)

//        Then
        assertEquals(result.toList(), listOf("CH", "SG", "TH"))
    }

    @Test
    fun `give input have the same prefix then order by number`() {
//        Given
        val input = arrayOf("TH4", "TH2", "TH19")
//        When
        val result = question2(input)

//        Then
        assertEquals(result.toList(), listOf("TH2", "TH4", "TH19"))
    }

    @Test
    fun `give input have them same prefix but some don't have number then item that don't have number return first`() {
//        Given
        val input = arrayOf("TH4", "TH2", "TH", "TH1")
//        When
        val result = question2(input)

//        Then
        assertEquals(result.toList(), listOf("TH", "TH1", "TH2", "TH4"))
    }

    @Test
    fun `give input have them some prefix and some don't have prefix then will show number first due to empty unicode is smaller`() {
//        Given
        val input = arrayOf("4", "TH2", "TH", "TH1")
//        When
        val result = question2(input)

//        Then
        assertEquals(result.toList(), listOf("4", "TH", "TH1", "TH2"))
    }
}