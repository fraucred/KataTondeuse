package mower.coordinates;

import java.util.Objects;

public class Axis {
    private final HorizontalAxis horizontalAxis;
    private final VerticalAxis verticalAxis;

    public Axis(Integer horizontalAxis, Integer verticalAxis) {
        this.horizontalAxis = new HorizontalAxis(horizontalAxis);
        this.verticalAxis = new VerticalAxis(verticalAxis);
    }

    public HorizontalAxis getHorizontalAxis() {
        return horizontalAxis;
    }

    public VerticalAxis getVerticalAxis() {
        return verticalAxis;
    }

    public Integer getHorizontalAxisValue() {
        return horizontalAxis.getValue();
    }

    public Integer getVerticalAxisValue() {
        return verticalAxis.getValue();
    }

    public void updateCoordinates(Integer newHorizontalAxis, Integer newVerticalAxis) {
        this.horizontalAxis.updateValue(newHorizontalAxis);
        this.verticalAxis.updateValue(newVerticalAxis);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Axis axis = (Axis) o;
        return Objects.equals(horizontalAxis, axis.horizontalAxis) && Objects.equals(verticalAxis, axis.verticalAxis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(horizontalAxis, verticalAxis);
    }
}
