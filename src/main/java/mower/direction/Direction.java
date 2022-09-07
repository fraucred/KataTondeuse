package mower.direction;

import java.util.Objects;

public class Direction {    // TODO can be removed
    private DirectionEnum directionCardinal;

    public Direction(DirectionEnum directionCardinal) {
        this.directionCardinal = directionCardinal;
    }

    public DirectionEnum getDirectionCardinal() {
        return this.directionCardinal;
    }

    public void updateDirection(DirectionEnum newDirection) {
        this.directionCardinal = newDirection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Direction direction = (Direction) o;
        return directionCardinal == direction.directionCardinal;
    }

    @Override
    public int hashCode() {
        return Objects.hash(directionCardinal);
    }
}
