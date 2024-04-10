package org.example;

import static org.junit.jupiter.api.Assertions.*;

class VelocityTest {

    @org.junit.jupiter.api.Test
    void setSpeedTest() {
        Speed startSpd = new Speed(5);
        Direction startDir = new Direction(45);
        Velocity velocity = new Velocity(startSpd, startDir);
        assertEquals(startSpd, velocity.getSpeed());

        // new speed
        Speed newSpeed = new Speed(100);
        velocity.setSpeed(newSpeed);
        assertEquals(newSpeed, velocity.getSpeed());
    }

    @org.junit.jupiter.api.Test
    void setDirectionTest() { //
        Speed startSpd = new Speed(4);
        Direction startDir = new Direction(45);
        Velocity velocity = new Velocity(startSpd, startDir);
        assertEquals(startDir, velocity.getDirection());

        // new direction
        Direction newDirection = new Direction(90);
        velocity.setDirection(newDirection);
        assertEquals(newDirection, velocity.getDirection());
    }

    @org.junit.jupiter.api.Test
    public void ReverseDirectionTest() {//reversing direction normal case
        Speed startSpeed = new Speed(999);
        Direction startDirection = new Direction(45); 
        Velocity velocity = new Velocity(startSpeed, startDirection);

        velocity.reverse();
        startDirection.oppositeDirection();
        assertEquals(startDirection, velocity.getDirection());
    }

    @org.junit.jupiter.api.Test
    public void ReverseXTest() {//reversing horizontal component
        Speed startSpeed = new Speed(444);
        Direction startDirection = new Direction(45);
        Velocity velocity = new Velocity(startSpeed, startDirection);

        Speed startSpeedX = new Speed(velocity.getSpeedX().getValue());
        velocity.reverseX();

        assertEquals(-startSpeedX.getValue(), velocity.getSpeedX().getValue());
    }

    @org.junit.jupiter.api.Test
    public void ReverseYTest() { // reversing Y component
        Speed startSpeed = new Speed(12312);
        Direction startDirection = new Direction(45);
        Velocity velocity = new Velocity(startSpeed, startDirection);

        Speed startSpeedY = new Speed(velocity.getSpeedY().getValue());
        velocity.reverseY();

        assertEquals(-startSpeedY.getValue(), velocity.getSpeedY().getValue());
    }

    @org.junit.jupiter.api.Test
    public void doubleReverseDirectionTest() {//tests reversing twice restores the original direction
        Speed startSpeed = new Speed(1212);
        Direction startDirection = new Direction(45); 
        Velocity velocity = new Velocity(startSpeed, startDirection);

        velocity.reverse();
        velocity.reverse();

        assertEquals(startDirection, velocity.getDirection());
    }

    @org.junit.jupiter.api.Test
    public void doubleReverseSpeedTest() {//Tests if reversing twice restores original speeds
        Speed startSpeed = new Speed(3242);
        Direction startDirection = new Direction(45); 
        Velocity velocity = new Velocity(startSpeed, startDirection);

        Speed startSpeedX = velocity.getSpeedX();
        Speed startSpeedY = velocity.getSpeedY();

        velocity.reverseX();
        velocity.reverseX();
        velocity.reverseY();
        velocity.reverseY();

        assertEquals(startSpeedX.getValue(), velocity.getSpeedX().getValue());
        assertEquals(startSpeedY.getValue(), velocity.getSpeedY().getValue());
    }

    @org.junit.jupiter.api.Test
    public void ReverseZeroSpdTest() { //tests if reversing with 0 speed works
        Speed zeroSpeed = new Speed(0);
        Direction startDirection = new Direction(45); 
        Velocity velocity = new Velocity(zeroSpeed, startDirection);

        Direction initialDirection = velocity.getDirection();
        velocity.reverse();
        assertEquals(initialDirection, velocity.getDirection());
    }

    @org.junit.jupiter.api.Test
    public void doubleReverseXTest() { //tests reversing x component twice to get original
        Speed startSpeed = new Speed(1532);
        Direction startDirection = new Direction(45); 
        Velocity velocity = new Velocity(startSpeed, startDirection);

        Speed startSpeedX = velocity.getSpeedX();
        velocity.reverseX();
        velocity.reverseX();

        assertEquals(startSpeedX.getValue(), velocity.getSpeedX().getValue());
    }

    @org.junit.jupiter.api.Test
    public void reverseXEffectForYTest() { //tests reversing X effect on Y component
        Speed startSpeed = new Speed(7614);
        Direction startDirection = new Direction(45); 
        Velocity velocity = new Velocity(startSpeed, startDirection);

        Speed startSpeedY = velocity.getSpeedY();
        velocity.reverseX();
        assertEquals(startSpeedY.getValue(), velocity.getSpeedY().getValue());
    }

    @org.junit.jupiter.api.Test
    public void XdirectionAfterDoubleReverse() {//test if double reversing X component restores the original direction
        Speed startSpeed = new Speed(3004);
        Direction startDirection = new Direction(45); 
        Velocity velocity = new Velocity(startSpeed, startDirection);

        Direction startDirectionAfterFirstReverse = velocity.getDirection();

        velocity.reverseX();
        velocity.reverseX();
        assertEquals(startDirectionAfterFirstReverse, velocity.getDirection());
    }

    @org.junit.jupiter.api.Test
    public void speedAfterDoubleXReverseTest() {//tests if reversing X component of velocity twice does not change the speed
        Speed startSpeed = new Speed(2003);
        Direction startDirection = new Direction(45); 
        Velocity velocity = new Velocity(startSpeed, startDirection);
        Speed firstReverseSpd = velocity.getSpeed();

        velocity.reverseX();
        velocity.reverseX();
        assertEquals(firstReverseSpd, velocity.getSpeed());
    }

}