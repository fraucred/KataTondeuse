import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MowerTest {

    @ParameterizedTest
    @CsvSource(textBlock = """
            NORTH, W
            WEST, S
            SOUTH, E
            EAST, N
            """)
    void should_turn_left_with_every_direction(Direction direction, String expectedDirection) {
        Mower mower = new Mower(0, 0, direction);
        String expectedPosition = "0 0 " + expectedDirection;

        mower.turns("G");

        assertEquals(expectedPosition, mower.getPosition());
    }

    @Test
    void should_move_forward_north_direction() {
        Mower mower = new Mower(0, 0, Direction.NORTH);
        String expectedPosition = "0 1 N";

        mower.advances();

        assertEquals(expectedPosition, mower.getPosition());
    }

    @Test
    void should_move_forward_east_direction() {
        Mower mower = new Mower(0, 0, Direction.EAST);
        String expectedPosition = "1 0 E";

        mower.advances();

        assertEquals(expectedPosition, mower.getPosition());
    }
}
