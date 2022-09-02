package mower;

public class InitMowerUseCase {
    private final String fileContent;

    public InitMowerUseCase(String fileContent) {
        this.fileContent = fileContent;
    }

    public String getFileContent() {
        return fileContent;
    }
}
