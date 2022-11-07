//day 2
package com.java21days;

public class Weather {

    static float convertFtoC(float temp){
        return ((temp - 32) / 9) * 5;
    }

    static void calc14k(){
        float initVal = 14_000f;
        float firstYear = initVal * (float) 1.4;
        float secondYear = firstYear - 1_500f;
        float thirdYear = secondYear * (float) 1.12;

        // Print val to user
        System.out.println(String.format("After 3 years you will have: %.2f $", thirdYear));
    }

    static void divAndModulo(int numOne, int numTwo){
        System.out.println(String.format("Val of division od %d by %d eq: %d", numOne, numTwo, numOne / numTwo));
        System.out.println(String.format("Modulo of %d mod %d eq: %d", numOne, numTwo, numOne % numTwo));
    }

    /**
     * Class will be used to practise arithmetic operations.
     */
    public static void main(String[] args){
        float fah = (float) 86.3;
        System.out.println(String.format("There is: %.2f F outside", fah));

        float cel = ((fah - 32) / 9) * 5;
        System.out.println(String.format("Converted to Celcius equals: %.5f C", cel));

        System.out.println(String.format("Converted using func: %.5f", convertFtoC(66.2f)));

        // ad. 1
        calc14k();

        //ad. 2
        divAndModulo(13, 4);
    }
    /**
     * HOMEWORK
     *
     * To extend your knowledge of the subjects covered in this lesson, try the following exercises:
     *
     * 1. Create a program that calculates how much a $14,000 investment
     * would be worth if it increased in value by 40% during the first year,
     * lost $1,500 in value the second year, and increased 12% in the third year.
     *
     * 2. Write a program that displays two numbers and uses the / and % operators
     * to display the result and remainder after they are divided.
     * Use the \t character escape code to separate the result and remainder in your output with a tab character.
     */
}
