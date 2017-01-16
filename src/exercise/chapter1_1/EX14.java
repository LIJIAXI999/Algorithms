package exercise.chapter1_1;

import tools.StdIn;

/**
 * Created by 94760 on 2017/1/15.
 */

/**
 * The result:
 *      Input an integer,and the function will return a max integer that less than or equal to log2.
 */
public class EX14 {
    public static int lg(int N){
        int x=0;
        int sum=1;
        while(N>=sum)
        {
            sum=sum*2;
            x++;
        }
        return x-1;
    }
    public static void main(String[] args){
        System.out.println("Please input an integer:");
        int a= StdIn.readInt();
        System.out.println(lg(a));
    }
}
