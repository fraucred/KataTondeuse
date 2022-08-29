package mower.direction;

public class Direction {
    private final DirectionEnum directionCardinal;

    public Direction(DirectionEnum directionCardinal) {
        this.directionCardinal = directionCardinal;
    }

    public Object getDirection() {
        return this.directionCardinal;
    }

    public void updateDirection(DirectionEnum directionCardinal) {

    }
}
