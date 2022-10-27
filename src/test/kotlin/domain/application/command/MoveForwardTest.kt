package domain.application.command

import domain.rover.Command.FORWARD
import domain.rover.Direction.NORTH
import domain.rover.Identifier
import domain.rover.Point
import domain.rover.Rover
import domain.rover.RoverRepository
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MoveForwardTest {

    private val roverRepository: RoverRepository = mockk()
    private val moveForward = MoveForward(roverRepository)

    @Test
    fun `should move forward`() {
        every { roverRepository.findById(Identifier("MARS")) } returns Rover()
        every { roverRepository.save(Rover(Point(0, 1), NORTH)) } returns Rover(Point(0, 1), NORTH)
        val commands = listOf(FORWARD)

        val rover = moveForward.execute(Identifier("MARS"), commands)

        assertThat(rover).isEqualTo(Rover(Point(0, 1), NORTH))
        verify {roverRepository.save(rover)}
    }
}
