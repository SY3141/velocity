package org.example;

public class Main { //good old java boilerplate I'll never write myself
    public static void main(String[] args) {
        Velocity velocity1 = new Velocity();
        Speed speed1 = new Speed(1);
        Direction direction1 = new Direction(90);
        Velocity v2 = new Velocity(speed1, direction1);

    }
}