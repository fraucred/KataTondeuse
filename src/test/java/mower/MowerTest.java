package mower;

import mower.direction.DirectionEnum;
import mower.direction.SideEnum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MowerTest {

    @Test
    public void should_return_0_0_coordinates_and_north_direction_when_mower_is_declared_without_any_action() {
        Mower mower = new Mower();
        MowerCoordinates expectedCoordinates = new MowerCoordinates();
        MowerDirection expectedDirection = new MowerDirection();

        assertEquals(expectedCoordinates, mower.getCoordinates());
        assertEquals(expectedDirection, mower.getDirection());
    }

    @Test
    public void should_return_east_direction_when_mower_turns_right_from_north_direction() {
        Mower mower = new Mower();
        MowerDirection expectedDirection = new MowerDirection(DirectionEnum.EAST);

        mower.turns(SideEnum.RIGHT);

        assertEquals(expectedDirection, mower.getDirection());
    }

    @Test
    public void should_return_south_direction_when_mower_turns_right_twice_from_north_direction() {
        Mower mower = new Mower();
        MowerDirection expectedDirection = new MowerDirection(DirectionEnum.SOUTH);

        mower.turns(SideEnum.RIGHT);
        mower.turns(SideEnum.RIGHT);

        assertEquals(expectedDirection, mower.getDirection());
    }

    @Test
    public void should_return_west_direction_when_mower_turns_right_thrice_from_north_direction() {
        Mower mower = new Mower();
        MowerDirection expectedDirection = new MowerDirection(DirectionEnum.WEST);

        mower.turns(SideEnum.RIGHT);
        mower.turns(SideEnum.RIGHT);
        mower.turns(SideEnum.RIGHT);

        assertEquals(expectedDirection, mower.getDirection());
    }

    @Test
    public void should_return_north_direction_when_mower_turns_right_four_times_from_north_direction() {
        Mower mower = new Mower();
        MowerDirection expectedDirection = new MowerDirection(DirectionEnum.NORTH);

        mower.turns(SideEnum.RIGHT);
        mower.turns(SideEnum.RIGHT);
        mower.turns(SideEnum.RIGHT);
        mower.turns(SideEnum.RIGHT);

        assertEquals(expectedDirection, mower.getDirection());
    }

    @Test
    public void should_return_west_direction_when_mower_turns_left_from_north_direction() {
        Mower mower = new Mower();
        MowerDirection expectedDirection = new MowerDirection(DirectionEnum.WEST);

        mower.turns(SideEnum.LEFT);

        assertEquals(expectedDirection, mower.getDirection());
    }

    @Test
    public void should_return_south_direction_when_mower_turns_left_twice_from_north_direction() {
        Mower mower = new Mower();
        MowerDirection expectedDirection = new MowerDirection(DirectionEnum.SOUTH);

        mower.turns(SideEnum.LEFT);
        mower.turns(SideEnum.LEFT);

        assertEquals(expectedDirection, mower.getDirection());
    }

    @Test
    public void should_return_west_direction_when_mower_turns_left_thrice_from_north_direction() {
        Mower mower = new Mower();
        MowerDirection expectedDirection = new MowerDirection(DirectionEnum.EAST);

        mower.turns(SideEnum.LEFT);
        mower.turns(SideEnum.LEFT);
        mower.turns(SideEnum.LEFT);

        assertEquals(expectedDirection, mower.getDirection());
    }

    @Test
    public void should_return_north_direction_when_mower_turns_left_four_times_from_north_direction() {
        Mower mower = new Mower();
        MowerDirection expectedDirection = new MowerDirection(DirectionEnum.NORTH);

        mower.turns(SideEnum.LEFT);
        mower.turns(SideEnum.LEFT);
        mower.turns(SideEnum.LEFT);
        mower.turns(SideEnum.LEFT);

        assertEquals(expectedDirection, mower.getDirection());
    }
}
