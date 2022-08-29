package mower;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MowerCoordinatesTest {

    @Test
    public void should_return_null_axis_when_there_are_none_axis() {
        MowerCoordinates coordinates = new MowerCoordinates();

        assertNull(coordinates.getAxis());
    }

    @Test
    public void should_return_null_horizontal_axis_when_horizontal_axis_is_null_and_vertical_axis_is_0() {
        MowerCoordinates coordinates = new MowerCoordinates(null, 0);

        assertNull(coordinates.getHorizontalAxis());
    }

    @Test
    public void should_return_null_coordinates_when_horizontal_axis_and_vertical_axis_are_null() {
        MowerCoordinates coordinates = new MowerCoordinates(null, null);

        assertNull(coordinates.getHorizontalAxis());
        assertNull(coordinates.getVerticalAxis());
    }

    @Test
    public void should_return_0_0_coordinates_when_horizontal_axis_and_vertical_axis_are_0() {
        MowerCoordinates coordinates = new MowerCoordinates(0, 0);

        assertEquals(0, coordinates.getHorizontalAxis());
        assertEquals(0, coordinates.getVerticalAxis());
    }

    @Test
    public void should_return_1_1_coordinates_when_horizontal_and_vertical_axis_are_0() {
        MowerCoordinates coordinates = new MowerCoordinates(0, 0);

        coordinates.updateCoordinates(1,1);

        assertEquals(1, coordinates.getHorizontalAxis());
        assertEquals(1, coordinates.getVerticalAxis());
    }
}
