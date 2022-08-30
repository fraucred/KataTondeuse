package mower.direction;

import java.util.Objects;

public class Direction {
    private final DirectionEnum directionCardinal;

    public Direction(DirectionEnum directionCardinal) {
        this.directionCardinal = directionCardinal;
    }

    public Object getDirection() {
        return this.directionCardinal;
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
