package exercise.chapter1_1;

/**
 * Created by 94760 on 2017/1/16.
 */

/**
 * The result:
 *      StackOverflowError:because the base case will never be reached.So it's an infinite recursion.
 */
public class EX17 {
    public static String exR2(int n){
        String s =exR2(n-3)+n+exR2(n-2)+n;
        if(n<=0) return"";
        return s;
    }
    public static void main(String[] args){
        //exR2(6);
    }
}
