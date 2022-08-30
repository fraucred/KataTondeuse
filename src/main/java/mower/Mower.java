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

    public void turns(String direction) {
        if ("RIGHT".equals(direction)) {
            if (DirectionEnum.EAST.equals(this.direction.getDirection())) {
                this.direction.updateDirection(DirectionEnum.SOUTH);
            } else if (DirectionEnum.SOUTH.equals(this.direction.getDirection())) {
                this.direction.updateDirection(DirectionEnum.WEST);
            } else if (DirectionEnum.WEST.equals(this.direction.getDirection())) {
                this.direction.updateDirection(DirectionEnum.NORTH);
            } else {
                this.direction.updateDirection(DirectionEnum.EAST);
            }
        }
        if ("LEFT".equals(direction)) {
            if (DirectionEnum.EAST.equals(this.direction.getDirection())) {
                this.direction.updateDirection(DirectionEnum.NORTH);
            } else if (DirectionEnum.SOUTH.equals(this.direction.getDirection())) {
                this.direction.updateDirection(DirectionEnum.EAST);
            } else if (DirectionEnum.WEST.equals(this.direction.getDirection())) {
                this.direction.updateDirection(DirectionEnum.SOUTH);
            } else {
                this.direction.updateDirection(DirectionEnum.WEST);
            }
        }
    }
}
