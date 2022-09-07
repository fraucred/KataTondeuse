public enum Direction {

    NORTH("N") {
        @Override
        public Direction left() {
            return WEST;
        }
    },
    WEST("W") {
        @Override
        public Direction left() {
            return SOUTH;
        }
    },
    SOUTH("S") {
        @Override
        public Direction left() {
            return EAST;
        }
    },
    EAST("E") {
        @Override
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
