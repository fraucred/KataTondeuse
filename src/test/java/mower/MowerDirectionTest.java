package mower;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MowerDirectionTest {

    @Test
    public void should_return_null_direction_when_direction_is_null() {
        MowerDirection direction = new MowerDirection();

        Assertions.assertNull(direction.getDirection());
    }
}
