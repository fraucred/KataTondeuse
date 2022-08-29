package mower;

import mower.direction.Direction;
import mower.direction.DirectionEnum;

public class MowerDirection {
    private Direction direction;
    public MowerDirection(DirectionEnum directionCardinal) {
        this.direction = new Direction(directionCardinal);
    }

    public Object getDirection() {
        return this.direction.getDirection();
    }

    public void updateDirection(Direction newDirection) {
        this.direction = newDirection;
    }
}
