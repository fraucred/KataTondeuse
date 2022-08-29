package mower.grass;

import mower.dimensions.Height;
import mower.dimensions.Width;

public class Grass {
    private final Width width;

    private final Height height;

    public Grass() {
        this.width = new Width();
        this.height = new Height();
    }

    public void updateSize(Integer newWidth, Integer newHeight) {
        this.width.updateValue(newWidth);
        this.height.updateValue(newHeight);
    }

    public Integer getHeight() {
        return this.height.getValue();
    }

    public Integer getWidth() {
        return this.width.getValue();
    }
}
