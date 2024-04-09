package org.example;

public interface velocityInterface {
        //private Speed speed, speedX, speedY;
        //private Direction direction;
        //public Velocity();
        //public Velocity(Speed speed, Direction direction);

        public Speed getSpeed();
        public Speed getSpeedX(); // get speed in X direction
        public Speed getSpeedY(); // get speed in Y direction
        public Direction getDirection();
        public void setSpeed(Speed speed);
        public void setDirection(Direction direction);
        public void reverse(); // reverse the direction of the puck!
        public void reverseX(); // reverse the direction of the puck in x-axis
        public void reverseY(); // reverse direction of the puck in the y-axis
}
