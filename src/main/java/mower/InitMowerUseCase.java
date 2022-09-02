package mower;

import java.io.File;

public class InitMowerUseCase {
    private final File file;

    public InitMowerUseCase(File file) {
        this.file = file;
    }

    public String printFile() {
        return file.toString();
    }
}
