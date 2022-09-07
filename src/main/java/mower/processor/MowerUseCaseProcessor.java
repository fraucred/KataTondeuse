package mower.processor;

import mower.Mower;
import mower.direction.SideEnum;

public class MowerUseCaseProcessor {    // respo x2 afficher pos finale + stratégies
    public static void execute(Mower newMower, String scenario) {
        String[] scenarioCharacters = scenario.split("");
        for (String character : scenarioCharacters) {
            switch (character) {
                case "A" -> newMower.advances();
                case "G" -> newMower.turns(SideEnum.LEFT);      // DP Strategy
                case "D" -> newMower.turns(SideEnum.RIGHT);
            }
        }
        System.out.print(newMower.toString());
    }
}
