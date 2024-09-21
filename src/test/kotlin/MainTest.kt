import org.example.Main
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MainTest {
    @Test
    fun testGreet() {
        val main = Main()
        assertEquals("Hey, Aykhan Kazimov!", main.name())
    }
}