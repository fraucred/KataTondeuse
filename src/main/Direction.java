public enum Direction {

    NORTH("N"), WEST("W"), SOUTH("S"), EAST("E");

    private final String label;

    Direction(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
