package com.java21days;

public class day5avg {
    public static void main(String[] args) {
        int sum = 0;

        if (args.length > 0) {
            for (String arg : args) {
                sum += Integer.parseInt(arg);
            }
            System.out.println("Sum is: " + sum);
            System.out.println("Avg is: " + (float) sum / args.length);
        }
    }
}
