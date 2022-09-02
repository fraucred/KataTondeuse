package mower;

import mower.direction.DirectionEnum;
import mower.direction.SideEnum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MowerTest {

    private final MowerGrass DEFAULT_GRASS = new MowerGrass(0,0);
    private final MowerDirection DEFAULT_DIRECTION = new MowerDirection();
    private final MowerCoordinates DEFAULT_COORDINATES = new MowerCoordinates(0, 0);

    @Test
    public void should_return_0_0_coordinates_and_north_direction_when_mower_is_declared_without_any_action() {
        Mower mower = new Mower(DEFAULT_DIRECTION, DEFAULT_COORDINATES, DEFAULT_GRASS);
        MowerCoordinates expectedCoordinates = new MowerCoordinates(0,0);
        MowerDirection expectedDirection = new MowerDirection();

        assertEquals(expectedCoordinates, mower.getCoordinates());
        assertEquals(expectedDirection, mower.getDirection());
    }

    @Test
    public void should_return_east_direction_when_mower_turns_right_from_north_direction() {
        Mower mower = new Mower(DEFAULT_DIRECTION, DEFAULT_COORDINATES, DEFAULT_GRASS);
        MowerDirection expectedDirection = new MowerDirection(DirectionEnum.EAST);

        mower.turns(SideEnum.RIGHT);

        assertEquals(expectedDirection, mower.getDirection());
    }

    @Test
    public void should_return_south_direction_when_mower_turns_right_twice_from_north_direction() {
        Mower mower = new Mower(DEFAULT_DIRECTION, DEFAULT_COORDINATES, DEFAULT_GRASS);
        MowerDirection expectedDirection = new MowerDirection(DirectionEnum.SOUTH);

        mower.turns(SideEnum.RIGHT);
        mower.turns(SideEnum.RIGHT);

        assertEquals(expectedDirection, mower.getDirection());
    }

    @Test
    public void should_return_west_direction_when_mower_turns_right_thrice_from_north_direction() {
        Mower mower = new Mower(DEFAULT_DIRECTION, DEFAULT_COORDINATES, DEFAULT_GRASS);
        MowerDirection expectedDirection = new MowerDirection(DirectionEnum.WEST);

        mower.turns(SideEnum.RIGHT);
        mower.turns(SideEnum.RIGHT);
        mower.turns(SideEnum.RIGHT);

        assertEquals(expectedDirection, mower.getDirection());
    }

    @Test
    public void should_return_north_direction_when_mower_turns_right_four_times_from_north_direction() {
        Mower mower = new Mower(DEFAULT_DIRECTION, DEFAULT_COORDINATES, DEFAULT_GRASS);
        MowerDirection expectedDirection = new MowerDirection(DirectionEnum.NORTH);

        mower.turns(SideEnum.RIGHT);
        mower.turns(SideEnum.RIGHT);
        mower.turns(SideEnum.RIGHT);
        mower.turns(SideEnum.RIGHT);

        assertEquals(expectedDirection, mower.getDirection());
    }

    @Test
    public void should_return_west_direction_when_mower_turns_left_from_north_direction() {
        Mower mower = new Mower(DEFAULT_DIRECTION, DEFAULT_COORDINATES, DEFAULT_GRASS);
        MowerDirection expectedDirection = new MowerDirection(DirectionEnum.WEST);

        mower.turns(SideEnum.LEFT);

        assertEquals(expectedDirection, mower.getDirection());
    }

    @Test
    public void should_return_south_direction_when_mower_turns_left_twice_from_north_direction() {
        Mower mower = new Mower(DEFAULT_DIRECTION, DEFAULT_COORDINATES, DEFAULT_GRASS);
        MowerDirection expectedDirection = new MowerDirection(DirectionEnum.SOUTH);

        mower.turns(SideEnum.LEFT);
        mower.turns(SideEnum.LEFT);

        assertEquals(expectedDirection, mower.getDirection());
    }

    @Test
    public void should_return_west_direction_when_mower_turns_left_thrice_from_north_direction() {
        Mower mower = new Mower(DEFAULT_DIRECTION, DEFAULT_COORDINATES, DEFAULT_GRASS);
        MowerDirection expectedDirection = new MowerDirection(DirectionEnum.EAST);

        mower.turns(SideEnum.LEFT);
        mower.turns(SideEnum.LEFT);
        mower.turns(SideEnum.LEFT);

        assertEquals(expectedDirection, mower.getDirection());
    }

    @Test
    public void should_return_north_direction_when_mower_turns_left_four_times_from_north_direction() {
        Mower mower = new Mower(DEFAULT_DIRECTION, DEFAULT_COORDINATES, DEFAULT_GRASS);
        MowerDirection expectedDirection = new MowerDirection(DirectionEnum.NORTH);

        mower.turns(SideEnum.LEFT);
        mower.turns(SideEnum.LEFT);
        mower.turns(SideEnum.LEFT);
        mower.turns(SideEnum.LEFT);

        assertEquals(expectedDirection, mower.getDirection());
    }

    @Test
    public void should_return_0_1_coordinates_when_mower_advances_from_0_0_N_and_mower_grass_3_by_3() {
        Mower mower = new Mower(DEFAULT_DIRECTION, DEFAULT_COORDINATES, new MowerGrass(3,3));
        MowerDirection expectedMowerNorthDirection = new MowerDirection(DirectionEnum.NORTH);
        MowerCoordinates expectedMowerCoordinates = new MowerCoordinates(0, 1);

        mower.advances();

        assertEquals(expectedMowerNorthDirection, mower.getDirection());
        assertEquals(expectedMowerCoordinates, mower.getCoordinates());
    }

    @Test
    public void should_return_1_3_N_mower_final_position() {
        MowerGrass grass = new MowerGrass(5, 5);
        MowerCoordinates coordinates = new MowerCoordinates(1, 2);
        MowerDirection direction = new MowerDirection(DirectionEnum.NORTH);
        Mower mower = new Mower(direction, coordinates, grass);
        MowerDirection expectedDirection = new MowerDirection(DirectionEnum.NORTH);
        MowerCoordinates expectedCoordinates = new MowerCoordinates(1, 3);

        mower.turns(SideEnum.LEFT);
        mower.advances();
        mower.turns(SideEnum.LEFT);
        mower.advances();
        mower.turns(SideEnum.LEFT);
        mower.advances();
        mower.turns(SideEnum.LEFT);
        mower.advances();
        mower.advances();

        assertEquals(expectedDirection, mower.getDirection());
        assertEquals(expectedCoordinates, mower.getCoordinates());
    }

    @Test
    public void should_return_5_1_E_mower_final_position() {
        MowerGrass grass = new MowerGrass(5, 5);
        MowerCoordinates coordinates = new MowerCoordinates(3, 3);
        MowerDirection direction = new MowerDirection(DirectionEnum.EAST);
        Mower mower = new Mower(direction, coordinates, grass);
        MowerDirection expectedDirection = new MowerDirection(DirectionEnum.EAST);
        MowerCoordinates expectedCoordinates = new MowerCoordinates(5, 1);

        mower.advances();
        mower.advances();
        mower.turns(SideEnum.RIGHT);
        mower.advances();
        mower.advances();
        mower.turns(SideEnum.RIGHT);
        mower.advances();
        mower.turns(SideEnum.RIGHT);
        mower.turns(SideEnum.RIGHT);
        mower.advances();

        assertEquals(expectedDirection, mower.getDirection());
        assertEquals(expectedCoordinates, mower.getCoordinates());
    }
}
