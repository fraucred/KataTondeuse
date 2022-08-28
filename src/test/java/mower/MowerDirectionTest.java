package mower;

import mower.direction.DirectionEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MowerDirectionTest {

    @Test
    public void should_return_null_direction_when_direction_is_null() {
        MowerDirection direction = new MowerDirection(null);

        Assertions.assertNull(direction.getDirection());
    }

    @Test
    public void should_return_north_direction_when_direction_is_north() {
        MowerDirection direction = new MowerDirection(DirectionEnum.NORTH);

        Assertions.assertEquals(DirectionEnum.NORTH, direction.getDirection());
    }
}
