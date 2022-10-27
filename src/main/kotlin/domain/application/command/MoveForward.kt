package domain.application.command

import domain.rover.Command
import domain.rover.Identifier
import domain.rover.Rover
import domain.rover.RoverRepository

class MoveForward(private val roverRepository: RoverRepository) {

    fun execute(idRover: Identifier, commands: List<Command>): Rover {
        val rover = roverRepository.findById(idRover)
        rover.execute(commands)
        return roverRepository.save(rover)
    }
}
