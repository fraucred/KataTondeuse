package mower;

public class InitMowerGrass {
    public static MowerGrass buildGrassFromDimensions(Integer grassWidth, Integer grassHeight) {
        return new MowerGrass(grassWidth, grassHeight);
    }
}
