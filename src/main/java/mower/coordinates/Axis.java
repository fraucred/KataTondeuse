package mower.coordinates;

public class Axis {
    private final HorizontalAxis horizontalAxis = new HorizontalAxis(null);
    private final VerticalAxis verticalAxis = new VerticalAxis(null);

    public HorizontalAxis getHorizontalAxis() {
        return horizontalAxis;
    }

    public VerticalAxis getVerticalAxis() {
        return verticalAxis;
    }

    public void updateCoordinates(Integer newHorizontalAxis, Integer newVerticalAxis) {
        this.horizontalAxis.updateValue(newHorizontalAxis);
        this.verticalAxis.updateValue(newVerticalAxis);
    }
}
