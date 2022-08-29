package mower.direction;

public class Direction {
    private DirectionEnum directionCardinal;

    public Direction(DirectionEnum directionCardinal) {
        this.directionCardinal = directionCardinal;
    }

    public Object getDirection() {
        return this.directionCardinal;
    }
}
