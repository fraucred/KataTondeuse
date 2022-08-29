package mower;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MowerCoordinatesTest {

    @Test
    public void should_return_null_axis_when_there_are_none_axis() {
        MowerCoordinates coordinates = new MowerCoordinates();

        Assertions.assertNull(coordinates.getAxis());
    }

    @Test
    public void should_return_null_horizontal_axis_when_horizontal_axis_is_null() {
        MowerCoordinates coordinates = new MowerCoordinates(null, 0);

        Assertions.assertNull(coordinates.getHorizontalAxis());
    }

    @Test
    public void should_return_null_coordinates_when_horizontal_axis_and_vertical_axis_are_null() {
        MowerCoordinates coordinates = new MowerCoordinates(null, null);

        Assertions.assertNull(coordinates.getHorizontalAxis());
        Assertions.assertNull(coordinates.getVerticalAxis());
    }

    @Test
    public void should_return_0_0_coordinates_when_horizontal_axis_and_vertical_axis_are_0() {
        MowerCoordinates coordinates = new MowerCoordinates(0, 0);

        Assertions.assertEquals(0, coordinates.getHorizontalAxis());
        Assertions.assertEquals(0, coordinates.getVerticalAxis());
    }


}
