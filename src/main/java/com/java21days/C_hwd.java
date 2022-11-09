// day 3
package com.java21days;

class hwd {
    int height;
    int width;
    int depth;

     void Print(){
        System.out.printf("Height %d, Depth %d, Width %d\n", height, depth, width);
    }
}

public class C_hwd {
    public static void main(String[] args){
        hwd thing = new hwd();
        thing.depth = 10;
        thing.height = 10;
        thing.width = 10;

        thing.Print();
    }
}
