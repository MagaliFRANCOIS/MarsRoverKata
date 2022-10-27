import Direction.*

data class Rover (var point : Point = Point(0,0), val direction : Direction = NORTH) {

    fun execute(command: List<Command>) {
        when (direction) {
            EAST -> this.point = Point(1, 0)
            SOUTH -> this.point = Point(0, -1)
            WEST -> this.point = Point(-1, 0)
            else -> this.point = Point(0, 1)
        }
    }
}
