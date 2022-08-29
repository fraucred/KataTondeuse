package mower;

import mower.direction.Direction;
import mower.direction.DirectionEnum;

public class MowerDirection {
    private final Direction direction;
    public MowerDirection(DirectionEnum directionCardinal) {
        this.direction = new Direction(directionCardinal);
    }

    public Object getDirection() {
        return this.direction.getDirection();
    }

    public void updateDirection(DirectionEnum directionCardinal) {
        this.direction.updateDirection(directionCardinal);
    }
}
