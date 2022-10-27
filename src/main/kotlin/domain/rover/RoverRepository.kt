package domain.rover

interface RoverRepository {
    fun findById(identifier: Identifier): Rover
    fun save(rover: Rover): Rover
}
