package mower;

public class Mower {
    public Object getCoordinates() {
        return new MowerCoordinates();
    }

    public Object getDirection() {
        return new MowerDirection();
    }

    public void turns(String right) {

    }
}
