package mower;

import mower.direction.DirectionEnum;

public class Mower {

    private final MowerDirection direction = new MowerDirection();

    public Object getCoordinates() {
        return new MowerCoordinates();
    }

    public Object getDirection() {
        return this.direction;
    }

    public void turns(String right) {
        if ("RIGHT".equals(right)) {
            direction.updateDirection(DirectionEnum.EAST);
        }
    }
}
