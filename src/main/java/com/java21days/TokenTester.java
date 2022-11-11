//day 3
package com.java21days;

import java.util.StringTokenizer;

public class TokenTester {
    public static void main(String[] args) {
        StringTokenizer str1, str2;

        String one = "TWTR 37.14 7.28".trim();
        String two = "RHT@185.98@80".trim();

        str1 = new StringTokenizer(one);
        str2 = new StringTokenizer(two, "@");

        str1.asIterator().forEachRemaining(token -> System.out.printf("token %s from \"%s\"%n", token, one));

        System.out.println("=================================");

        str2.asIterator().forEachRemaining(token -> System.out.printf("token %s from \"%s\"%n", token, two));
    }
}
