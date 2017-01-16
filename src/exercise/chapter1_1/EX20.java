package exercise.chapter1_1;

/**
 * Created by 94760 on 2017/1/16.
 */

/**
 * The result:
 *      The static function Ln() can calculate In(N!).
 */
public class EX20 {
    public static double Ln(int N){
        if(N==1)
            return 0;
        return Ln(N-1)+Math.log(N);
    }
    public static void main(String[] args){
        System.out.println(Ln(10));
    }
}
