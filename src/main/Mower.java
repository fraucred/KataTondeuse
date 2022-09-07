public class Mower {
    private String direction;
    private int x;
    private int y;

    public Mower(int x, int y, String direction) {
        this.direction = direction;
        this.x = x;
        this.y = y;
    }

    public void turns(String move) {
//        if ("N".equals(this.direction)) {
//            this.direction = "W";
//        } else {
//            this.direction = "S";
//        }

        // SELF-BRAINSTORM
        MowerStrategy.mowerTurnStrategy(this, move);
        // SELF-BRAINSTORM - immutable
//        return (Mower) mowerTurnStrategy(this, move);
    }

    public void advances() {
        MowerStrategy.mowerAdvance(this);
    }

    public String getPosition() {
        return x + " " + y + " " + direction;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
