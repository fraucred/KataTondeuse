package mower;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

public class MowerGrassTest {
    @Test
    void should_return_null_grass_when_grass_is_null() {
        MowerGrass grass = new MowerGrass();

        assertNull(grass.getGrass());
    }
}
