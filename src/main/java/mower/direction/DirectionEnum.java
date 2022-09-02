package mower.direction;

import java.util.Objects;

public enum DirectionEnum {
    NORTH, EAST, SOUTH, WEST;

    public static DirectionEnum parseFromCharacter(String character) {
        if (Objects.equals(character, "N")) {
            return NORTH;
        }
        if (Objects.equals(character, "E")) {
            return EAST;
        }
        if (Objects.equals(character, "W")) {
            return WEST;
        }
        if (Objects.equals(character, "S")) {
            return SOUTH;
        }
        return null;
    }
}
