import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoverTest {

    @Test
    fun `should start with default position` () {
        val rover = Rover()

        assertThat(rover.coordinate).isEqualTo(Coordinate(0,0))
    }
}