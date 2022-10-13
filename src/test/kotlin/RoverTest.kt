import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoverTest {

    @Test
    fun `should start at default position and direction` () {
        val rover = Rover()

        assertThat(rover.point).isEqualTo(Point(0,0))
        assertThat(rover.direction).isEqualTo(Direction.NORTH)
    }

    @Test
    fun `should go forward to north` () {
        val rover = Rover()
        
        val roverCompare = Rover()


    }
}