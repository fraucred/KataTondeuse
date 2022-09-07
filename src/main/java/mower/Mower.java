package mower;

import mower.direction.DirectionEnum;
import mower.direction.SideEnum;

import java.util.Objects;

public class Mower {

    private final MowerDirection direction;
    private final MowerCoordinates coordinates;
    private final MowerGrass grass;

    public Mower(MowerDirection direction, MowerCoordinates coordinates, MowerGrass grass) {
        this.direction = direction;
        this.coordinates = coordinates;
        this.grass = grass;
    }

    public MowerCoordinates getCoordinates() {
        return this.coordinates;
    }

    public MowerDirection getDirection() {
        return this.direction;
    }

    public void turns(SideEnum side) {      // DP strategy ? Responsability of DirectionEnum
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

    public void advances() {            // DP strategy ? Responsability of DirectionEnum
        Integer coordinateVerticalAxisValue = this.coordinates.getVerticalAxisValue();
        Integer coordinateHorizontalAxisValue = this.coordinates.getHorizontalAxisValue();

        if (isDirectionNorthOriented() && this.grass.checkCoordinatesWithinGrassSize(coordinateHorizontalAxisValue, coordinateVerticalAxisValue + 1)) {
            this.coordinates.updateCoordinates(coordinateHorizontalAxisValue, coordinateVerticalAxisValue + 1);
        } else if (isDirectionSouthOriented() && this.grass.checkCoordinatesWithinGrassSize(coordinateHorizontalAxisValue, coordinateVerticalAxisValue - 1)) {
            this.coordinates.updateCoordinates(coordinateHorizontalAxisValue, coordinateVerticalAxisValue - 1);
        } else if (isDirectionWestOriented() && this.grass.checkCoordinatesWithinGrassSize(coordinateHorizontalAxisValue - 1, coordinateVerticalAxisValue)) {
            this.coordinates.updateCoordinates(coordinateHorizontalAxisValue - 1, coordinateVerticalAxisValue);
        } else if (isDirectionEastOriented() && this.grass.checkCoordinatesWithinGrassSize(coordinateHorizontalAxisValue + 1, coordinateVerticalAxisValue)) {
            this.coordinates.updateCoordinates(coordinateHorizontalAxisValue + 1, coordinateVerticalAxisValue);
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

    @Override
    public String toString() {
        return coordinates.toString() + " " + direction.toString() + " ";
    }
}
