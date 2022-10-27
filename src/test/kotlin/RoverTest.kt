import Command.FORWARD
import Direction.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoverTest {

    @Test
    fun `should start at default position and direction`() {
        val rover = Rover()

        assertThat(rover.point).isEqualTo(Point(0, 0))
        assertThat(rover.direction).isEqualTo(NORTH)
    }

    @Test
    fun `should go forward to north`() {
        val rover = Rover()

        rover.execute(listOf(FORWARD))

        assertThat(rover).isEqualTo(Rover(Point(0, 1), NORTH))
    }

    @Test
    fun `should go forward to east`() {
        val rover = Rover(direction = EAST)

        rover.execute(listOf(FORWARD))

        assertThat(rover).isEqualTo(Rover(Point(1, 0), EAST))
    }

    @Test
    fun `should go forward to south`() {
        val rover = Rover(direction = SOUTH)

        rover.execute(listOf(FORWARD))

        assertThat(rover).isEqualTo(Rover(Point(0, -1), SOUTH))
    }

    @Test
    fun `should go forward to west`() {
        val rover = Rover(direction = WEST)

        rover.execute(listOf(FORWARD))

        assertThat(rover).isEqualTo(Rover(Point(-1, 0), WEST))
    }
}
