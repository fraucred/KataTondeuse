package mower.grass;

import mower.dimensions.Height;
import mower.dimensions.Width;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grass grass = (Grass) o;
        return Objects.equals(width, grass.width) && Objects.equals(height, grass.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }
}
