package org.example;

public class Speed {
    protected int value;

    // Constructor
    public Speed(int value) {
        this.value = value;
    }

    // Getter
    public int getValue() {
        return value;
    }

    // Setter
    public void setValue(int value) {
        this.value = value;
    }
    public void reverse() {
        this.value = -value;
    }
}
