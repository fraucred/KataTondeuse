package mower;

import mower.direction.DirectionEnum;
import mower.direction.SideEnum;

import java.util.Objects;

public class Mower {

    private final MowerDirection direction = new MowerDirection();
    private final MowerCoordinates coordinates = new MowerCoordinates();
    private final MowerGrass grass;

    public Mower(MowerGrass grass) {
        this.grass = grass;
    }

    public Object getCoordinates() {
        return this.coordinates;
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

    public void advances() {
        if (isDirectionNorthOriented()) {
            this.coordinates.updateCoordinates(this.coordinates.getVerticalAxisValue() + 1, this.coordinates.getHorizontalAxisValue());
        } else if (isDirectionSouthOriented()) {
            this.coordinates.updateCoordinates(this.coordinates.getVerticalAxisValue() - 1, this.coordinates.getHorizontalAxisValue());
        } else if (isDirectionWestOriented()) {
            this.coordinates.updateCoordinates(this.coordinates.getVerticalAxisValue(), this.coordinates.getHorizontalAxisValue() - 1);
        } else {
            this.coordinates.updateCoordinates(this.coordinates.getVerticalAxisValue(), this.coordinates.getHorizontalAxisValue() + 1);
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

    private boolean isDirectionNorthOriented() {
        return DirectionEnum.NORTH.equals(this.direction.getDirection());
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mower mower = (Mower) o;
        return Objects.equals(direction, mower.direction) && Objects.equals(coordinates, mower.coordinates) && Objects.equals(grass, mower.grass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direction, coordinates, grass);
    }
}
