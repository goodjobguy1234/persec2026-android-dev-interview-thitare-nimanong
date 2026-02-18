import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Question6Test {
    @Test
    fun `give have 3 inital value and larger tribonucci then create tribonucci`() {
        val input = arrayOf(4,8,10)
        val fiboNum = 5

        val result = tribonacci(input, fiboNum)

        assertEquals(result.toList(), arrayOf(4, 8, 10, 22, 40).toList())
    }

    @Test
    fun `give have 3 inital value and less than initialSize FiboNum then return inital value`() {
        val input = arrayOf(4,8,10)
        val fiboNum = 2

        val result = tribonacci(input, fiboNum)

        assertEquals(result.toList(), arrayOf(4,8,10).toList())
    }

    @Test
    fun `give have 3 inital value and the same than initialSize FiboNum then return inital value`() {
        val input = arrayOf(4,8,10)
        val fiboNum = 3

        val result = tribonacci(input, fiboNum)

        assertEquals(result.toList(), arrayOf(4,8,10).toList())
    }
}