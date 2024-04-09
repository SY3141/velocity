package org.example;

public class Speed {
    protected int value;

    public Speed(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public void reverse() {
        this.value = -value;
    }
}
