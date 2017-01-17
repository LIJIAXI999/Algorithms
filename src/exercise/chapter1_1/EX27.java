package exercise.chapter1_1;

/**
 * Created by 94760 on 2017/1/16.
 */
public class EX27 {
    static int count=0;
    public static double binomial(int N,int k,double p){
        System.out.printf("This is the %d times recursion.\n",count++);
        if(N==0 && k==0)
            return 1.0;
        if(N<0 || k<0)
            return 0.0;
        return (1.0-p)*binomial(N-1,k,p)+p*binomial(N-1,k-1,p);
    }
    public static void main(String[] args){
        System.out.println(binomial(10,5,0.25));
    }

}
