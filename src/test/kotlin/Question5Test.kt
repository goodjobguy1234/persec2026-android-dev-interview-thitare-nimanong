import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.lang.Error
import kotlin.test.assertEquals

class Question5Test {
    @Test
    fun `give number is positive then rearrange by digit order`() {
        val input = 4539

        val result = sortNumber(input)

        assertEquals(9543, result)
    }

    @Test
    fun `give number is positive and same number then return same number`() {
        val input = 8888

        val result = sortNumber(input)

        assertEquals(8888, result)
    }

    @Test
    fun `give number is negative then throw Error`() {
        val input = -8

        assertThrows<Error> {
            sortNumber(input)
        }
    }
}