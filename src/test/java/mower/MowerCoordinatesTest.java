package mower;

import mower.coordinates.HorizontalAxis;
import mower.coordinates.VerticalAxis;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MowerCoordinatesTest {

    @Test
    public void should_return_0_0_coordinates_when_horizontal_axis_and_vertical_axis_are_0() {
        MowerCoordinates coordinates = new MowerCoordinates(0, 0);
        HorizontalAxis expectedHorizontalAxis = new HorizontalAxis(0);
        VerticalAxis expectedVerticalAxis = new VerticalAxis(0);

        assertEquals(expectedHorizontalAxis, coordinates.getHorizontalAxis());
        assertEquals(expectedVerticalAxis, coordinates.getVerticalAxis());
    }

    @Test
    public void should_return_1_1_coordinates_when_horizontal_and_vertical_axis_are_0() {
        MowerCoordinates coordinates = new MowerCoordinates(0, 0);
        HorizontalAxis expectedHorizontalAxis = new HorizontalAxis(1);
        VerticalAxis expectedVerticalAxis = new VerticalAxis(1);

        coordinates.updateCoordinates(1,1);

        assertEquals(expectedHorizontalAxis, coordinates.getHorizontalAxis());
        assertEquals(expectedVerticalAxis, coordinates.getVerticalAxis());
    }
}
