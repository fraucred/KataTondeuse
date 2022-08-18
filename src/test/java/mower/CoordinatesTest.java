package mower;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoordinatesTest {

    @Test
    public void should_return_null_coordinates_when_there_are_none_axis() {
        MowerCoordinates coordinates = new MowerCoordinates();
        Assertions.assertNull(coordinates.getAxis());
    }
}
