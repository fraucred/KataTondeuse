package mower;

import mower.grass.Grass;

public class MowerGrass {
    private Integer grassWidth;
    private Integer grassHeight;

    public MowerGrass() {

    }

    public MowerGrass(Integer grassWidth, Integer grassHeight) {
        this.grassWidth = grassWidth;
        this.grassHeight = grassHeight;
    }

    public Object getGrass() {
        return new Grass().getGrass();
    }

    public Integer getWidth() {
        return this.grassWidth;
    }

    public Integer getHeight() {
        return this.grassHeight;
    }
}
