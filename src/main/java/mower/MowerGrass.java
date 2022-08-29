package mower;

import mower.grass.Grass;

public class MowerGrass {
    public MowerGrass() {

    }

    public MowerGrass(Integer grassWidth, Integer grassHeight) {

    }

    public Object getGrass() {
        return new Grass().getGrass();
    }

    public Integer getWidth() {
        return null;
    }

    public Integer getHeight() {
        return null;
    }
}
