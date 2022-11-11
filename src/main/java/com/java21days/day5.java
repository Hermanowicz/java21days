package com.java21days;

public class day5 {
    public static void main(String[] args) {
        int[] range;
        day5 lister = new day5();

        range = lister.makeRange(4, 23);

        System.out.print("The array: [ ");
        for (int j : range) {
            System.out.print(j + " ");
        }
        System.out.println("]");
        System.out.println(System.currentTimeMillis());
    }

    int[] makeRange(int lower, int upper) {
        // init array
        int[] range = new int[(upper - lower) + 1];
        // loop over possible indexes
        for (int index = 0; index < range.length; index++) {
            range[index] = lower++;
        }
        return range;

    }
}
