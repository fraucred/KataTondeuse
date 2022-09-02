package mower;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MowerGrassTest {

    @Test
    void should_return_3_by_3_sized_grass() {
        MowerGrass grass = new MowerGrass(3, 3);
        Integer expectedGrassWidth = 3;
        Integer expectedGrassHeight = 3;

        assertEquals(expectedGrassWidth, grass.getWidth());
        assertEquals(expectedGrassHeight, grass.getHeight());
    }

    @Test
    void should_return_4_by_4_sized_grass() {
        MowerGrass grass = new MowerGrass(4, 4);
        Integer expectedGrassWidth = 4;
        Integer expectedGrassHeight = 4;

        assertEquals(expectedGrassWidth, grass.getWidth());
        assertEquals(expectedGrassHeight, grass.getHeight());
    }

    @Test
    void should_update_4_by_4_sized_grass_to_5_by_5_sized_grass() {
        MowerGrass grass = new MowerGrass(4, 4);
        Integer expectedGrassWidth = 5;
        Integer expectedGrassHeight = 5;

        grass.updateSize(5,5);

        assertEquals(expectedGrassWidth, grass.getWidth());
        assertEquals(expectedGrassHeight, grass.getHeight());
    }

    @Test
    void should_return_false_valid_coordinates_when_coordinates_are_outside_of_3_by_3_sized_grass() {
        MowerGrass grass = new MowerGrass(3, 3);
        MowerCoordinates coordinatesOutsideGrass = new MowerCoordinates(5, 5);

        Boolean areValidCoordinates = grass.checkCoordinatesWithinGrassSize(coordinatesOutsideGrass);

        assertFalse(areValidCoordinates);
    }

    @Test
    void should_return_true_valid_coordinates_when_coordinates_are_inside_of_3_by_3_sized_grass() {
        MowerGrass grass = new MowerGrass(3, 3);
        MowerCoordinates coordinatesWithinGrass = new MowerCoordinates(2, 2);

        Boolean areValidCoordinates = grass.checkCoordinatesWithinGrassSize(coordinatesWithinGrass);

        assertTrue(areValidCoordinates);
    }
}
