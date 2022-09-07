package mower;

import mower.processor.MowerUseCaseProcessor;

import java.util.*;

public class InitMowerUseCase {
    private final String fileContent;
    private final List<String> inputValues;
    private final MowerGrass grass;

    private final Map<Mower, String> mowersByScenario = new HashMap<>();

    public InitMowerUseCase(String fileContent) {   // split parsing fichier, init mower & init grass
        this.fileContent = fileContent;
        this.inputValues = Arrays.stream(fileContent.split(" ")).toList();
        this.grass = new MowerGrass(Integer.parseInt(inputValues.get(0)), Integer.parseInt(inputValues.get(1)));

        for (int i = 2; i < inputValues.size(); i = i + 4) {    // nommer les index i + ..
            Mower newMower = new Mower(
                    new MowerDirection(inputValues.get(i + 2)),
                    new MowerCoordinates(Integer.parseInt(inputValues.get(i)), Integer.parseInt(inputValues.get(i + 1))),
                    this.grass);
            mowersByScenario.put(newMower, inputValues.get(i + 3));
        }
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
