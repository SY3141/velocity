package org.example;

public class Velocity {
    private Speed speed, speedX, speedY;
    private Direction direction;

    public Velocity(Speed speed, Direction direction) {
        this.direction = direction;
        this.setSpeed(speed);
    }

    public Velocity() {
        this.speed = new Speed(0);
        this.direction = new Direction(0);
    }

    public Speed getSpeed() {
        return speed;
    }

    public Speed getSpeedX() {
        //  horizontal component of the velocity
        return this.speedX;
    }

    public Speed getSpeedY() {
        // vertical component of the velocity
        return this.speedY;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
        int x = (int) (Math.abs(speed.getValue()) * Math.cos(Math.toRadians(direction.getAngle())));
        int y = (int) (Math.abs(speed.getValue()) * Math.sin(Math.toRadians(direction.getAngle())));
        this.speedX = new Speed(x);
        this.speedY = new Speed(y);
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void reverse() {
        this.speedX.reverse();
        this.speedY.reverse();
        this.direction.oppositeDirection();
    }
    public void reverseX() {
        this.speedX.reverse();
    }
    public void reverseY() {
        this.speedY.reverse();

    }
}
