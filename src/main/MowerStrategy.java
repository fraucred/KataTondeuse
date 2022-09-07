public class MowerStrategy {
    public static void mowerTurnStrategy(Mower mower, String move) {
        if ("N".equals(mower.getDirection())) {
            mower.setDirection("W");
        } else {
            mower.setDirection("S");
        }
    }

    public static void mowerAdvance(Mower mower) {
        if ("N".equals(mower.getDirection())) {
            mower.setY(1);
        }
        if ("E".equals(mower.getDirection())) {
            mower.setX(1);
        }
    }
}
