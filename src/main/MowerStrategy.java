public class MowerStrategy {
    public static void mowerTurnStrategy(Mower mower, String move) {
        if ("N".equals(mower.getDirection())) {
            mower.setDirection("W");
        } else {
            mower.setDirection("S");
        }
    }
}
