import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Question3Test {
    @Test
    fun `given have max result 2 and have 3 th then sorted by the index of th`() {
        //        Given
        val input = arrayOf( "Mother", "Think", "Worthy", "Apple", "Android")
//        When
        val result = autoComplete("th", input, 2)

//        Then
        assertEquals(result.toList(), listOf("Think", "Mother"))
    }

    @Test
    fun `given have max result 0 then return empty array`() {
        //        Given
        val input = arrayOf( "Mother", "Think", "Worthy", "Apple", "Android")
//        When
        val result = autoComplete("th", input, 0)

//        Then
        assertEquals(result.toList(), listOf())
    }

    @Test
    fun `given have search not match then return empty array`() {
        //        Given
        val input = arrayOf( "Mother", "Think", "Worthy", "Apple", "Android")
//        When
        val result = autoComplete("hello World", input, 2)

//        Then
        assertEquals(result.toList(), listOf())
    }
}