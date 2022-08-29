package mower;

public abstract class SimpleValue {
    
    Integer value;

    public Integer getValue() {
        return this.value;
    }

    public void updateValue(Integer newValue) {
        this.value = newValue;
    }
}
