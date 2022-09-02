package mower;

import mower.direction.Direction;
import mower.direction.DirectionEnum;

import java.util.Objects;

public class MowerDirection {
    private final Direction direction;
    public MowerDirection(DirectionEnum directionCardinal) {
        this.direction = new Direction(directionCardinal);
    }

    public MowerDirection() {
        this.direction = new Direction(DirectionEnum.NORTH);
    }

    public MowerDirection(String character) {
        this.direction = new Direction(DirectionEnum.parseFromCharacter(character));
    }

    public DirectionEnum getDirection() {
        return this.direction.getDirection();
    }

    public void updateDirection(DirectionEnum newDirection) {
        this.direction.updateDirection(newDirection);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MowerDirection that = (MowerDirection) o;
        return Objects.equals(direction, that.direction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direction);
    }
}
