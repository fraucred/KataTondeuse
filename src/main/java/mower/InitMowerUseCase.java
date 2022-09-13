package mower;

import mower.processor.MowerUseCaseProcessor;

import java.util.*;

public class InitMowerUseCase {
    private final String fileContent;
    private final List<String> inputValues = new ArrayList<>();
    private final MowerGrass grass;

    private final Map<Mower, String> mowersByScenario = new HashMap<>();

    public InitMowerUseCase(String fileContent) {   // split parsing fichier, init mower & init grass
        this.fileContent = fileContent;
        InitMowerFileContent.buildInputValuesFromFileContent(this.inputValues, fileContent);
        Integer grassWidth = Integer.valueOf(inputValues.get(0));
        Integer grassHeight = Integer.valueOf(inputValues.get(1));
        this.grass = InitMowerGrass.buildGrassFromDimensions(grassWidth, grassHeight);
        InitMowerByScenario.buildMowerWithScenario(this.grass, this.mowersByScenario, this.inputValues);
    }

    public String getFileContent() {
        return fileContent;
    }   // TODO remove method if only used in unit tests

    public MowerGrass getGrass() {
        return grass;
    }

    public Map<Mower, String> getMowersByScenario() {
        return mowersByScenario;
    }

    public void proceed() {
        mowersByScenario.forEach(MowerUseCaseProcessor::execute);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InitMowerUseCase that = (InitMowerUseCase) o;
        return Objects.equals(fileContent, that.fileContent) && Objects.equals(inputValues, that.inputValues)
                && Objects.equals(grass, that.grass) && Objects.equals(mowersByScenario, that.mowersByScenario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileContent, inputValues, grass, mowersByScenario);
    }
}
