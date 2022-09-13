package mower;

import java.util.List;
import java.util.Map;

public class InitMowerByScenario {
    public static void buildMowerWithScenario(MowerGrass grass, Map<Mower, String> mowersByScenario, List<String> inputValues) {
        for (int i = 2; i < inputValues.size(); i = i + 4) {    // nommer les index i + ..
            Mower newMower = new Mower(
                    new MowerDirection(inputValues.get(i + 2)),
                    new MowerCoordinates(Integer.parseInt(inputValues.get(i)), Integer.parseInt(inputValues.get(i + 1))),
                    grass);
            mowersByScenario.put(newMower, inputValues.get(i + 3));
        }
    }
}
