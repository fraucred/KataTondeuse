package mower;

import mower.grass.Grass;

public class MowerGrass {

    private Grass grass;

    public MowerGrass() {

    }

    public MowerGrass(Integer grassWidth, Integer grassHeight) {
        this.grass = new Grass();
        this.grass.updateSize(grassWidth, grassHeight);
    }

    public Grass getGrass() {
        return this.grass;
    }

    public Integer getWidth() {
        return this.grass.getWidth();
    }

    public Integer getHeight() {
        return this.grass.getHeight();
    }
}
