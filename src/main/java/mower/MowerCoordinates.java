package mower;

import mower.coordinates.Axis;

public class MowerCoordinates {

    private final Axis axis = new Axis();

    public MowerCoordinates() {
    }

    public MowerCoordinates(Integer newHorizontalAxis, Integer newVerticalAxis) {
        this.axis.updateCoordinates(newHorizontalAxis, newVerticalAxis);
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

    }
}
