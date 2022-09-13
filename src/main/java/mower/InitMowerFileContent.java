package mower;

import java.util.Arrays;
import java.util.List;

public class InitMowerFileContent {
    public static void buildInputValuesFromFileContent(List<String> inputValues, String fileContent) {
        inputValues.addAll(Arrays.stream(fileContent.split(" ")).toList());
    }
}
