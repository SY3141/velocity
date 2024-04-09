package org.example;

public class Direction {
    private int angle; // Angle in degrees

    public Direction(int angle) {
        this.angle = angle;
    }

    public int getAngle() {
        return angle;
    }

    public void calcAngle(int x, int y){
        this.angle = (int) Math.toDegrees(Math.atan2(y, x));
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }
    public void oppositeDirection(){
        this.angle = (this.angle + 180) % 360;
    }
}