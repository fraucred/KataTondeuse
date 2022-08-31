package mower;

import mower.direction.DirectionEnum;
import mower.direction.SideEnum;

public class Mower {

    private final MowerDirection direction = new MowerDirection();

    public Object getCoordinates() {
        return new MowerCoordinates();
    }

    public Object getDirection() {
        return this.direction;
    }

    public void turns(SideEnum side) {
        if (SideEnum.RIGHT.equals(side)) {
            if (isDirectionEastOriented()) {
                moveToSouthDirection();
            } else if (isDirectionSouthOriented()) {
                moveToWestDirection();
            } else if (isDirectionWestOriented()) {
                moveToNorthDirection();
            } else {
                moveToEastDirection();
            }
        }
        if (SideEnum.LEFT.equals(side)) {
            if (isDirectionEastOriented()) {
                moveToNorthDirection();
            } else if (isDirectionSouthOriented()) {
                moveToEastDirection();
            } else if (isDirectionWestOriented()) {
                moveToSouthDirection();
            } else {
                moveToWestDirection();
            }
        }
    }

    private void moveToNorthDirection() {
        this.direction.updateDirection(DirectionEnum.NORTH);
    }

    private void moveToWestDirection() {
        this.direction.updateDirection(DirectionEnum.WEST);
    }

    private void moveToSouthDirection() {
        this.direction.updateDirection(DirectionEnum.SOUTH);
    }

    private void moveToEastDirection() {
        this.direction.updateDirection(DirectionEnum.EAST);
    }

    private boolean isDirectionWestOriented() {
        return DirectionEnum.WEST.equals(this.direction.getDirection());
    }

    private boolean isDirectionSouthOriented() {
        return DirectionEnum.SOUTH.equals(this.direction.getDirection());
    }

    private boolean isDirectionEastOriented() {
        return DirectionEnum.EAST.equals(this.direction.getDirection());
    }
}
