package mower;

import mower.coordinates.Axis;
import mower.coordinates.HorizontalAxis;
import mower.coordinates.VerticalAxis;

import java.util.Objects;

public class MowerCoordinates {

    private final Axis axis;

    public MowerCoordinates(Integer newHorizontalAxis, Integer newVerticalAxis) {
        this.axis = new Axis(newHorizontalAxis, newVerticalAxis);
    }

    public HorizontalAxis getHorizontalAxis() {
        return this.axis.getHorizontalAxis();
    }

    public Integer getHorizontalAxisValue() {
        return this.axis.getHorizontalAxisValue();
    }

    public VerticalAxis getVerticalAxis() {
        return this.axis.getVerticalAxis();
    }

    public Integer getVerticalAxisValue() {
        return this.axis.getVerticalAxisValue();
    }

    public void updateCoordinates(Integer newHorizontalAxis, Integer newVerticalAxis) {
        this.axis.updateCoordinates(newHorizontalAxis, newVerticalAxis);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MowerCoordinates that = (MowerCoordinates) o;
        return Objects.equals(axis, that.axis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(axis);
    }
}
