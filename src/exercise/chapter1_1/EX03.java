package exercise.chapter1_1;

/**
 * Created by 94760 on 2017/1/15.
 */

/**
 *  The results:
 *      Input 3 integers,if they are all equal,print "equal",otherwise print "not equal".
 */

import tools.StdIn;

public class EX03 {
    public static void main(String[] args){
        System.out.println("Please input there integers:");
        int a =StdIn.readInt();
        int b =StdIn.readInt();
        int c =StdIn.readInt();
        if (a==b&&b==c)
            System.out.println("Equal!");
        else
            System.out.println("Not equal!");
    }
}
