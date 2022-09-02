package mower;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InitMowerUseCaseTest {

    @Test
    public void should_read_and_print_text_file_input() throws IOException {
        Path filePath = Path.of("src/test/resources/textFile.txt");
        InitMowerUseCase initMowerUseCase = new InitMowerUseCase(Files.readString(filePath));

        assertEquals("5 5 1 2 N GAGAGAGAA 3 3 E AADAADADDA", initMowerUseCase.getFileContent());
    }


    public void should_print_mower_final_position() {

    }

}
