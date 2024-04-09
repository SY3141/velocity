package org.example;

public class Velocity {
    private Speed speed, speedX, speedY;
    private Direction direction;

    public Velocity(Speed speed, Direction direction) {
        this.speed = speed;
        this.direction = direction;
        this.speedX = getSpeedX();
        this.speedY = getSpeedY();
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
        return new Speed((int) (speed.getValue() * Math.cos(direction.getAngle())));
    }

    public Speed getSpeedY() {
        // vertical component of the velocity
        return new Speed((int) (speed.getValue() * Math.sin(direction.getAngle())));
    }

    public Direction getDirection() {
        return direction;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void reverse() {
        this.direction = direction.oppositeDirection();
        this.reverseX();
        this.reverseY();
    }
    public void reverseX() {
        this.speedX.reverse();
    }
    public void reverseY() {
        this.speedX.reverse();
    }
}
