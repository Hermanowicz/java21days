//day 1
package com.java21days;

class MarsApplication {
    public static void main(String[] arguments) {
        MarsRobot spirit = new MarsRobot();
        spirit.status = "exploring";
        spirit.speed = 2;
        spirit.temp = -60;

        // opportunity
        MarsRobot opportunity = new MarsRobot();
        opportunity.speed = 5;
        opportunity.temp = (float) -78.9;
        opportunity.status = "searching for signs of life";

        opportunity.showAttributes();

        System.out.println("*************************");

        spirit.showAttributes();
        System.out.println("Increasing speed to 3.");
        spirit.speed = 3;
        spirit.showAttributes();
        System.out.println("Changing temperature to -90.");
        spirit.temp = -90;
        spirit.showAttributes();
        System.out.println("Checking the temperature.");
        spirit.checkTemp();
        spirit.showAttributes();
    }
}