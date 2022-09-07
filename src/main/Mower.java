public class Mower {
    private Direction direction;
    private int x;
    private int y;

    public Mower(int x, int y, Direction direction) {
        this.direction = direction;
        this.x = x;
        this.y = y;
    }

    public void turns(String move) {
        // Mower is mutable
        MowerStrategy.mowerTurnStrategy(this, move);
        // SELF-BRAINSTORM - immutable
//        return (Mower) mowerTurnStrategy(this, move);
    }

    public void advances() {
        MowerStrategy.mowerAdvance(this);
    }

    public String getPosition() {
        return x + " " + y + " " + direction.getLabel();
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
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

    public Direction getLeftDirection() {
        return this.direction.left();
    }
}
