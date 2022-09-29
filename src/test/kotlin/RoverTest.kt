import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class RoverTest {

    @Test
    fun `should start with default position` () {
        val rover = Rover()

        Assertions.assertThat(rover.x).isEqualTo(0)
        Assertions.assertThat(rover.y).isEqualTo(0)
    }
}