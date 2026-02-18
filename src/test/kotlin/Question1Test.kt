import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Question1Test {

    @Test
    fun `test with input have evenly and correct order parenthesis then return true`() {
//        Given
        val input = "[{()}]"

//       When
        val result = correctParenthesis(input)

//        Then
        assertEquals(result, true)
    }

    @Test
    fun `test with input have evenly but incorrect order parenthesis then return false`() {
//        Given
        val input = "[{(}])"

//       When
        val result = correctParenthesis(input)

//        Then
        assertEquals(result, false)
    }

    @Test
    fun `test with input have odd count then return false`() {
//        Given
        val input = "["

//       When
        val result = correctParenthesis(input)

//        Then
        assertEquals(result, false)
    }

    @Test
    fun `test with input empty then return false`() {
//        Given
        val input = ""

//       When
        val result = correctParenthesis(input)

//        Then
        assertEquals(result, false)
    }
}