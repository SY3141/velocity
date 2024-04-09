package org.example;

public class Direction {
    private int angle; // Angle in degrees

    public Direction(int angle) {
        this.angle = angle;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }
    public Direction oppositeDirection(){
        this.angle = 360- this.angle;
        return this;
    }
}