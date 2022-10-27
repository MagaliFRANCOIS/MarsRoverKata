package infrastructure.repositories

import domain.rover.Identifier
import domain.rover.Rover
import domain.rover.RoverRepository
import java.io.FileWriter

class RoverFileRepository(val fileName : FileWriter) : RoverRepository {
    override fun findById(identifier: Identifier): Rover {
        TODO("Not yet implemented")
    }

    override fun save(rover: Rover): Rover {
        TODO("Not yet implemented")
    }

}