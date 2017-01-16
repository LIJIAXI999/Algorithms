package exercise.chapter1_1;

/**
 * Created by 94760 on 2017/1/16.
 */

/**
 * The result:
 *      p:105 q:24
        p:24 q:9
        p:9 q:6
        p:6 q:3
        p:3 q:0
        Result:3

        p:1111111 q:1234567
        p:1234567 q:1111111
        p:1111111 q:123456
        p:123456 q:7
        p:7 q:4
        p:4 q:3
        p:3 q:1
        p:1 q:0
        Result:1
 */
public class EX24 {
    public static int Euclid(int p,int q){
        System.out.println("p:"+p+" "+"q:"+q);
        if(q==0) return p;
        int r=p%q;
        return Euclid(q,r);
    }
    public static void main(String[] args){
        System.out.println("Result:"+Euclid(105,24));
        System.out.println("Result:"+Euclid(1111111,1234567));
    }
}
