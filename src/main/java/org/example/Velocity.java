package org.example;

public class Velocity implements velocityInterface {
    private Speed speed, speedX, speedY;
    private Direction direction;

    public Velocity() {
        this.speed = new Speed(0); // Default speed initialized to 0
        this.direction = new Direction(0); // Default direction initialized to directly to the right/east
    }

    public Velocity(Speed speed, Direction direction) {
        this.speed = speed;
        this.direction = direction;
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

    @Override
    public Direction getDirection() {
        return direction;
    }

    @Override
    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    @Override
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    @Override
    public void reverse() {
        this.direction = direction.oppositeDirection();
    }

    @Override
    public void reverseX() {
        this.speedX.reverse();
    }

    @Override
    public void reverseY() {
        this.speedX.reverse();
    }
}
