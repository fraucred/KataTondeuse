package mower;

import mower.grass.Grass;

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
        return coordinates.getVerticalAxisValue() < grass.getHeight() &&
                coordinates.getHorizontalAxisValue() < grass.getWidth();
    }
}
