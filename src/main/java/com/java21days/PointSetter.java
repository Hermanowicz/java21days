package com.java21days;

import java.awt.Point;

public class PointSetter {
    public static void main(String[] arguments){
        Point location = new Point(4, 13);

        System.out.println("Starting location of the point:");
        System.out.printf("X equals %d \n", location.x);
        System.out.printf("Y equels %d \n", location.y);

        System.out.println("Moving to (7, 6)");
        location.x = 7;
        location.y = 6;

        System.out.println(location);

        // static for class variable and methods


    }
}
