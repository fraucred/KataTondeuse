package mower.coordinates;

public class Axis {
    private Integer horizontalAxis;
    private Integer verticalAxis;

    public Integer getHorizontalAxis() {
        return horizontalAxis;
    }

    public Integer getVerticalAxis() {
        return verticalAxis;
    }

    public void updateCoordinates(Integer newHorizontalAxis, Integer newVerticalAxis) {
        this.horizontalAxis = newHorizontalAxis;
        this.verticalAxis = newVerticalAxis;
    }
}
