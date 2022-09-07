public enum Direction {

    NORTH("N") {
        public Direction left() {
            return WEST;
        }
    },
    WEST("W") {
        public Direction left() {
            return SOUTH;
        }
    },
    SOUTH("S") {
        public Direction left() {
            return EAST;
        }
    },
    EAST("E") {
        public Direction left() {
            return NORTH;
        }
    };

    private final String label;

    Direction(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    abstract Direction left();
}
