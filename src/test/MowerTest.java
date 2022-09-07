import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MowerTest {

    @Test
    void given_mower_at_0_0_N_position_when_mower_turns_left_then_mower_new_position_is_0_0_W() {
        Mower mower = new Mower(0, 0, "N");
        String expectedPosition = "0 0 W";

        mower.turns("G");

        assertEquals(expectedPosition, mower.getPosition());
    }
}
