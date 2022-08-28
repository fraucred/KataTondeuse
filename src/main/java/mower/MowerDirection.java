package mower;

import mower.direction.Direction;
import mower.direction.DirectionEnum;

public class MowerDirection {
    public MowerDirection(DirectionEnum direction) {

    }

    public Object getDirection() {
        return new Direction().getDirection();
    }
}
