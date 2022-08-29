package mower;

import mower.direction.Direction;
import mower.direction.DirectionEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MowerDirectionTest {

    private static final Direction SOUTH = new Direction(DirectionEnum.SOUTH);

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

    @Test
    public void should_update_north_direction_to_south_direction() {
        MowerDirection direction = new MowerDirection(DirectionEnum.NORTH);

        direction.updateDirection(SOUTH);

        Assertions.assertEquals(DirectionEnum.SOUTH, direction.getDirection());
    }
}
