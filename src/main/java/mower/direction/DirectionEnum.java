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

    public static String parseFromEnum(DirectionEnum direction) {
        if (NORTH.equals(direction)) {
            return "N";
        }
        if (SOUTH.equals(direction)) {
            return "S";
        }
        if (WEST.equals(direction)) {
            return "W";
        }
        if (EAST.equals(direction)) {
            return "E";
        }
        return null;
    }
}
