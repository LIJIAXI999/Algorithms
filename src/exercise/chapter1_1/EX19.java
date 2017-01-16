package exercise.chapter1_1;

import tools.StdOut;

/**
 * Created by 94760 on 2017/1/16.
 */

/**
 * The result:
 *      It's a Fibonacci Sequence.
 */
public class EX19 {
    public static long F(int N){
        if(N==0)    return 0;
        if(N==1)    return 1;
        return F(N-1)+F(N-2);
    }
    public static void main(String[] args){
        long[] result=new long[100];
        for(int N=0;N<100;N++) {
            long x=F(N);
            result[N]=x;
            StdOut.println(N + " " + x);
        }
    }
}
