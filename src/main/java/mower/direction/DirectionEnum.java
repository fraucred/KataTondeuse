package mower.direction;

public enum DirectionEnum {
    NORTH, EAST, SOUTH, WEST;

    public static DirectionEnum parseFromCharacter(String character) {
        return switch (character) {
            case "N" -> NORTH;
            case "E" -> EAST;
            case "W" -> WEST;
            case "S" -> SOUTH;
            default -> null;
        };
    }

    public static String parseFromEnum(DirectionEnum direction) {
        return switch (direction) {
            case NORTH -> "N";
            case EAST -> "E";
            case WEST -> "W";
            case SOUTH -> "S";
        };
    }
}
