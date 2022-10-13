import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoverTest {

    @Test
    fun `should start with default position` () {
        val rover = Rover()

        assertThat(rover.point).isEqualTo(Point(0,0))
    }
}