package org.example;

public class Main { //good old java boilerplate I'll never write myself
    public static void main(String[] args) {/*
        Velocity velocity1 = new Velocity();
        Speed speed1 = new Speed(1);
        Direction direction1 = new Direction(90);
        Velocity v2 = new Velocity(speed1, direction1);
        */
        Speed startSpeed = new Speed(10); // Change the value as needed
        Direction startDirection = new Direction(45); // Change the angle as needed
        Velocity velocity = new Velocity(startSpeed, startDirection);

        Speed startSpeedY = new Speed(velocity.getSpeedY().getValue());

        velocity.reverseY();
        System.out.println(-startSpeedY.getValue());
        System.out.println(velocity.getSpeedY().getValue());


    }
}