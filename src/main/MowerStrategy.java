public class MowerStrategy {
    public static void mowerTurnStrategy(Mower mower, String move) {
        mower.setDirection(mower.getLeftDirection());
    }

    public static void mowerAdvance(Mower mower) {
        if (Direction.NORTH.equals(mower.getDirection())) {
            mower.setY(1);
        }
        if (Direction.EAST.equals(mower.getDirection())) {
            mower.setX(1);
        }
    }
}
