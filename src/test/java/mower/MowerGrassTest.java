package mower;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MowerGrassTest {
    @Test
    void should_return_null_grass_when_grass_is_null() {
        MowerGrass grass = new MowerGrass();

        assertNull(grass.getGrass());
    }

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

        assertEquals(expectedGrassWidth, grass.getWidth());
        assertEquals(expectedGrassHeight, grass.getHeight());
    }

}
