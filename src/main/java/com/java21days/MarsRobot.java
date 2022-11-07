//day 1
package com.java21days;

class  MarsRobot{
    String status;
    int speed;
    float temp;

    void checkTemp(){
        if (temp < -80){
            status = "Returning home";
            speed = 5;
        }
    }

    void showAttributes(){
        System.out.println("Status: " + status);
        System.out.println("Speed: " + speed);
        System.out.println("Temperature: " + temp);

    }
}