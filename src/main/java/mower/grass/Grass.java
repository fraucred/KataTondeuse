package mower.grass;

import mower.dimensions.Height;
import mower.dimensions.Width;

public class Grass {
    private final Width width = new Width(null);

    private final Height height = new Height(null);

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
