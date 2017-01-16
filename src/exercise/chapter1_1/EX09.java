package exercise.chapter1_1;

import tools.StdIn;

/**
 * Created by 94760 on 2017/1/15.
 */

/**
 * The results:
 *      Use the Java built-in function Integer.toBinaryString(N).
 *      Use the local function EX09.intToBinary(N).
 *      You can change an integer value to a binary string.
 */
public class EX09 {

    private static String intToBinary(int N){
        String s="";
        for(int n=N;n>0;n/=2)
            s=(n%2)+s;
        return s;
    }
    public static void main(String[] args){
        System.out.println("Please input an integer.");
        int N= StdIn.readInt();
        System.out.println("Use the Java built-in function Integer.toBinaryString(N):");
        System.out.println(Integer.toBinaryString(N));
        System.out.println("Use the local function EX09.intToBinary(N):");
        System.out.println(EX09.intToBinary(N));
    }
}
