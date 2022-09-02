package mower;

import java.util.Arrays;
import java.util.Objects;

public class InitMowerUseCase {
    private final String fileContent;
    private final String[] inputValues;
    private final MowerGrass grass;

    public InitMowerUseCase(String fileContent) {
        this.fileContent = fileContent;
        this.inputValues = fileContent.split(" ");
        this.grass = new MowerGrass(Integer.parseInt(inputValues[0]), Integer.parseInt(inputValues[1]));
    }

    public String getFileContent() {
        return fileContent;
    }

    public MowerGrass getGrass() {
        return grass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InitMowerUseCase that = (InitMowerUseCase) o;
        return Objects.equals(fileContent, that.fileContent) && Arrays.equals(inputValues, that.inputValues) && Objects.equals(grass, that.grass);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(fileContent, grass);
        result = 31 * result + Arrays.hashCode(inputValues);
        return result;
    }
}
