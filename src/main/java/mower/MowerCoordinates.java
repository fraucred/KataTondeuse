package mower;

import mower.coordinates.Axis;

import java.util.Objects;

public class MowerCoordinates {

    private final Axis axis = new Axis();

    public MowerCoordinates() {
    }

    public MowerCoordinates(Integer newHorizontalAxis, Integer newVerticalAxis) {
        updateCoordinates(newVerticalAxis, newHorizontalAxis);
    }

    public Object getHorizontalAxis() {
        return this.axis.getHorizontalAxis();
    }

    public Integer getHorizontalAxisValue() {
        return this.axis.getHorizontalAxisValue();
    }

    public Object getVerticalAxis() {
        return this.axis.getVerticalAxis();
    }

    public Integer getVerticalAxisValue() {
        return this.axis.getVerticalAxisValue();
    }

    public void updateCoordinates(Integer newVerticalAxis, Integer newHorizontalAxis) {
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
