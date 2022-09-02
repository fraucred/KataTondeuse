package mower.processor;

import mower.Mower;
import mower.direction.SideEnum;

import java.util.Objects;

public class MowerUseCaseProcessor {
    public static void execute(Mower newMower, String scenario) {
        String[] scenarioCharacters = scenario.split("");
        for (String character : scenarioCharacters) {
            if (Objects.equals(character, "A")) {
                newMower.advances();
            } else if (Objects.equals(character, "G")) {
                newMower.turns(SideEnum.LEFT);
            } else if (Objects.equals(character, "D")) {
                newMower.turns(SideEnum.RIGHT);
            }
        }
        System.out.print(newMower.toString());
    }
}
