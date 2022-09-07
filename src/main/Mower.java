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
        this.direction = "W";
    }

    public String getPosition() {
        return x + " " + y + " " + direction;
    }
}
