package org.example;

public class Direction {
    private int angle; // Angle in degrees

    // Constructor
    public Direction(int angle) {
        // Normalize the angle to be within [0, 360)
        this.angle = angle;
    }

    // Getter
    public int getAngle() {
        return angle;
    }

    // Setter
    public void setAngle(int angle) {
        this.angle = angle;
    }
    public Direction oppositeDirection(){
        this.angle = 360- this.angle;
        return this;
    }
}