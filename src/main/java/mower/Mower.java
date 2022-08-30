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
            if (DirectionEnum.EAST.equals(this.direction.getDirection())) {
                direction.updateDirection(DirectionEnum.SOUTH);
            } else if (DirectionEnum.SOUTH.equals(this.direction.getDirection())) {
                direction.updateDirection(DirectionEnum.WEST);
            } else {
                direction.updateDirection(DirectionEnum.EAST);
            }
        }
    }
}
