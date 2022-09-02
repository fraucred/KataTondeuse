package mower;

import mower.grass.Grass;

import java.util.Objects;

public class MowerGrass {

    private final Grass grass = new Grass();

    public MowerGrass(Integer grassWidth, Integer grassHeight) {
        this.grass.updateSize(grassWidth, grassHeight);
    }

    public Integer getWidth() {
        return this.grass.getWidth();
    }

    public Integer getHeight() {
        return this.grass.getHeight();
    }

    public void updateSize(Integer newGrassWidth, Integer newGrassHeight) {
        this.grass.updateSize(newGrassWidth, newGrassHeight);
    }

    public Boolean checkCoordinatesWithinGrassSize(MowerCoordinates coordinates) {
        Integer verticalAxisValue = coordinates.getVerticalAxisValue();
        Integer horizontalAxisValue = coordinates.getHorizontalAxisValue();
        return !checkNegativeCoordinates(horizontalAxisValue, verticalAxisValue) && verticalAxisValue < grass.getHeight() &&
                horizontalAxisValue < grass.getWidth();
    }

    public Boolean checkCoordinatesWithinGrassSize(Integer horizontalAxis, Integer verticalAxis) {
        return !checkNegativeCoordinates(horizontalAxis, verticalAxis) && verticalAxis <= grass.getHeight() && horizontalAxis <= grass.getWidth();
    }

    public Boolean checkNegativeCoordinates(Integer horizontalAxis, Integer verticalAxis) {
        return verticalAxis < 0 || horizontalAxis < 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MowerGrass that = (MowerGrass) o;
        return Objects.equals(grass, that.grass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grass);
    }
}
