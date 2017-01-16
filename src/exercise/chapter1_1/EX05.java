package exercise.chapter1_1;

/**
 * Created by 94760 on 2017/1/15.
 */

/**
 *  The result:
 *      Input two double values,if they both between zero and one,return true;otherwise return false.
 */


import tools.StdIn;

public class EX05 {
    public static void main(String[] args){
        System.out.println("Please input two double values:");
        double a=StdIn.readDouble();
        double b=StdIn.readDouble();
        System.out.println("The result is "+(a<1&&a>0&&b<1&&b>0));
    }
}
