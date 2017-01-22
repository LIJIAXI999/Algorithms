package exercise.chapter2_2;

import tools.StdOut;

/**
 * Created by 94760 on 2017/1/20.
 */

/**
 * The result: dlroWolleH
 * ----------------------------------------------------
 *                  HelloWorld
 *              a:Hello    b:World
 *           a:He  b:llo   a:Wo  b:rld
 *          H e     l lo    W o   r ld
 *                    l o          l d
 *
 */
public class EX07 {
    public static String mystery(String s){
        int N=s.length();
        if(N<=1)
            return s;
        String a=s.substring(0,N/2);
        String b=s.substring(N/2,N);
        System.out.println("a:"+a+" b:"+b);
        return mystery(b)+mystery(a);
    }
    public static void main(String[] args){
        String s="HelloWorld";
        StdOut.print(mystery(s));
    }
}
