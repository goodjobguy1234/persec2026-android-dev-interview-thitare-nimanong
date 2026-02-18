import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Question4Test {
    @Test
    fun `Given convert roman string into number`() {
        val input = "DCCLXXXIX"

        val result = romanNumeralsToInt(input)

        assertEquals(result, 789)
    }

    @Test
    fun `Given convert roman string into number test case 2`() {
        val input = "XXXIX"

        val result = romanNumeralsToInt(input)

        assertEquals(result, 39)
    }

    @Test
    fun `Given convert roman string into number test case 3`() {
        val input = "CCVII"

        val result = romanNumeralsToInt(input)

        assertEquals(result, 207)
    }
}