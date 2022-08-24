package mower;

import mower.coordinates.Axis;

public class MowerCoordinates {
    public MowerCoordinates() {
    }

    public MowerCoordinates(Integer horizontalAxis) {

    }

    public MowerCoordinates(Integer horizontalAxis, Integer verticalAxis) {

    }

    public Object getAxis() {
        return null;
    }

    public Object getHorizontalAxis() {
        return new Axis().getHorizontalAxis();
    }

    public Object getVerticalAxis() {
        return new Axis().getVerticalAxis();
    }
}
