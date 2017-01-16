package exercise.chapter1_1;

import tools.StdOut;

/**
 * Created by 94760 on 2017/1/15.
 */

/**
 * The results: it's a Fibonacci sequence.
 *  0
    1
    1
    2
    3
    5
    8
    13
    21
    34
    55
    89
    144
    233
    377
    610
 */

public class EX06 {
    public static void main(String[] args){
        int f=0;
        int g=1;
        for(int i=0;i<=15;i++){
            StdOut.println(f);
            f=f+g;
            g=f-g;
        }
    }
}
