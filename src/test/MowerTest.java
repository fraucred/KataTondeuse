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
    @Test
    void given_mower_at_0_0_W_position_when_mower_turns_left_then_mower_new_position_is_0_0_S() {
        Mower mower = new Mower(0, 0, "W");
        String expectedPosition = "0 0 S";

        mower.turns("G");

        assertEquals(expectedPosition, mower.getPosition());
    }

    @Test
    void given_mower_at_0_0_N_position_when_mower_advances_then_mower_new_position_is_0_1_N() {
        Mower mower = new Mower(0, 0, "N");
        String expectedPosition = "0 1 N";

        mower.advances();

        assertEquals(expectedPosition, mower.getPosition());
    }

    @Test
    void given_mower_at_0_0_E_position_when_mower_advances_then_mower_new_position_is_1_0_E() {
        Mower mower = new Mower(0, 0, "E");
        String expectedPosition = "1 0 E";

        mower.advances();

        assertEquals(expectedPosition, mower.getPosition());
    }
}
