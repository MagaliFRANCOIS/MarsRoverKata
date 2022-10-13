import Direction.NORTH
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.ValueSource

internal class RoverTest {

    @Test
    fun `should start at default position and direction` () {
        val rover = Rover()

        assertThat(rover.point).isEqualTo(Point(0,0))
        assertThat(rover.direction).isEqualTo(NORTH)
    }


    @Test
    fun `should go forward to north`() {
        val rover = Rover()
        
        rover.receive("F")

        assertThat(rover).isEqualTo(Rover(Point(0, 1), NORTH))
    }
}
