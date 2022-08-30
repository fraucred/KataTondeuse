package mower;

import mower.coordinates.Axis;

import java.util.Objects;

public class MowerCoordinates {

    private final Axis axis = new Axis();

    public MowerCoordinates() {
    }

    public MowerCoordinates(Integer newHorizontalAxis, Integer newVerticalAxis) {
        updateCoordinates(newHorizontalAxis, newVerticalAxis);
    }

    public Object getAxis() {
        return null;
    }

    public Object getHorizontalAxis() {
        return this.axis.getHorizontalAxis();
    }

    public Object getVerticalAxis() {
        return this.axis.getVerticalAxis();
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
