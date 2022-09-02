package mower;

import mower.direction.DirectionEnum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MowerDirectionTest {

    @Test
    public void should_return_north_direction_when_direction_is_north() {
        MowerDirection direction = new MowerDirection(DirectionEnum.NORTH);

        assertEquals(DirectionEnum.NORTH, direction.getDirection());
    }

    @Test
    public void should_update_north_direction_to_south_direction() {
        MowerDirection direction = new MowerDirection(DirectionEnum.NORTH);

        direction.updateDirection(DirectionEnum.SOUTH);

        assertEquals(DirectionEnum.SOUTH, direction.getDirection());
    }
}
