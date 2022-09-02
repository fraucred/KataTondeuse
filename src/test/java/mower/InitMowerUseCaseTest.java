package mower;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InitMowerUseCaseTest {

    @Test
    public void should_read_and_print_text_file_input() {
        File textFile = new File("textFile.txt");
        InitMowerUseCase initMowerUseCase = new InitMowerUseCase(textFile);

        assertEquals("5 5 1 2 N GAGAGAGAA 3 3 E AADAADADDA", initMowerUseCase.printFile());
    }


    public void should_print_mower_final_position() {

    }

}
