// day 2
package com.java21days;

public class Abc {
    // getting started with java21days day 2;
   public static void main(String[] args){
       final char UP = 'U';
       byte initialLevel = 12;
       short location = 13250;
       int score = 3500100;
       boolean newGame = true;
       String s;

       s = String.format("UP: %s, InitLevel: %s, Location: %d, Score: %d, NewGame: %s",
               UP, initialLevel, location, score, newGame);

       System.out.println(s);

       System.out.println(Math.pow(2, 5));
   }

}
