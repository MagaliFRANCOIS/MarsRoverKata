import Direction.EAST
import Direction.NORTH
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

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
        
        rover.execute("F")

        assertThat(rover).isEqualTo(Rover(Point(0, 1), NORTH))
    }

    @Test
    fun `should go forward to east`() {
        val rover = Rover(direction = EAST)

        rover.execute("F")

        assertThat(rover).isEqualTo(Rover(Point(1, 0), EAST))
    }
}
