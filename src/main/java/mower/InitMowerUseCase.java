package mower;

public class InitMowerUseCase {
    private final String fileContent;
    private final MowerGrass grass;

    public InitMowerUseCase(String fileContent) {
        this.fileContent = fileContent;
        this.grass = new MowerGrass(0, 0);
    }

    public String getFileContent() {
        return fileContent;
    }

    public MowerGrass getGrass() {
        return null;
    }
}
