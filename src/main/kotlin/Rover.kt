import Direction.EAST
import Direction.NORTH

class Rover (var point : Point = Point(0,0), val direction : Direction = NORTH) {

    fun execute(command: String) {
        if (direction == EAST)
            this.point = Point(1, 0)
        else
            this.point = Point(0, 1)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Rover

        if (point != other.point) return false
        if (direction != other.direction) return false

        return true
    }

    override fun hashCode(): Int {
        var result = point.hashCode()
        result = 31 * result + direction.hashCode()
        return result
    }
}
