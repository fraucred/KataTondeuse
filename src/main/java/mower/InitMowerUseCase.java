package mower;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class InitMowerUseCase {
    private final String fileContent;
    private final List<String> inputValues;
    private final MowerGrass grass;

    private final List<Mower> mowers = new ArrayList<>();

    private final Integer mowerIndex = 2;

    public InitMowerUseCase(String fileContent) {
        this.fileContent = fileContent;
        this.inputValues = Arrays.stream(fileContent.split(" ")).toList();
        this.grass = new MowerGrass(Integer.parseInt(inputValues.get(0)), Integer.parseInt(inputValues.get(1)));
        this.mowers.add(
                new Mower(new MowerDirection(inputValues.get(4)),
                    new MowerCoordinates(Integer.parseInt(inputValues.get(2)), Integer.parseInt(inputValues.get(3))),
                    this.grass)
        );
    }

    public String getFileContent() {
        return fileContent;
    }

    public MowerGrass getGrass() {
        return grass;
    }

    public List<Mower> getMowers() {
        return mowers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InitMowerUseCase that = (InitMowerUseCase) o;
        return Objects.equals(fileContent, that.fileContent) && Objects.equals(inputValues, that.inputValues)
                && Objects.equals(grass, that.grass) && Objects.equals(mowers, that.mowers)
                && Objects.equals(mowerIndex, that.mowerIndex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileContent, inputValues, grass, mowers, mowerIndex);
    }
}
