package mower;

import mower.direction.DirectionEnum;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InitMowerUseCaseTest {

    @Test
    public void should_read_and_print_text_file_input() throws IOException {
        Path filePath = Path.of("src/test/resources/textFile.txt");
        InitMowerUseCase initMowerUseCase = new InitMowerUseCase(Files.readString(filePath));

        assertEquals("5 5 1 2 N GAGAGAGAA 3 3 E AADAADADDA", initMowerUseCase.getFileContent());
    }

    @Test
    public void should_read_text_file_and_return_5_by_5_sized_grass() throws IOException {
        Path filePath = Path.of("src/test/resources/textFile.txt");
        InitMowerUseCase initMowerUseCase = new InitMowerUseCase(Files.readString(filePath));
        MowerGrass expectedGrass = new MowerGrass(5, 5);

        assertEquals(expectedGrass, initMowerUseCase.getGrass());
    }

    @Test
    public void should_read_text_file_and_return_first_created_mower_coordinates_and_direction() throws IOException {
        Path filePath = Path.of("src/test/resources/textFile.txt");
        InitMowerUseCase initMowerUseCase = new InitMowerUseCase(Files.readString(filePath));
        MowerCoordinates expectedCoordinates = new MowerCoordinates(1, 2);
        MowerDirection expectedDirection = new MowerDirection(DirectionEnum.NORTH);

        assertTrue(initMowerUseCase.getMowersByScenario().keySet()
                .stream()
                .anyMatch(mower -> expectedCoordinates.equals(mower.getCoordinates())
                        && expectedDirection.equals(mower.getDirection())));
    }

    @Test
    public void should_read_text_file_and_return_second_created_mower_coordinates_and_direction() throws IOException {
        Path filePath = Path.of("src/test/resources/textFile.txt");
        InitMowerUseCase initMowerUseCase = new InitMowerUseCase(Files.readString(filePath));
        MowerCoordinates expectedCoordinates = new MowerCoordinates(3, 3);
        MowerDirection expectedDirection = new MowerDirection(DirectionEnum.EAST);

        assertTrue(initMowerUseCase.getMowersByScenario().keySet()
                .stream()
                .anyMatch(mower -> expectedCoordinates.equals(mower.getCoordinates())
                        && expectedDirection.equals(mower.getDirection())));
    }

    @Test

    public void should_print_mower_final_position() {

    }

}
