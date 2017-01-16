package exercise.chapter1_1;

/**
 * Created by 94760 on 2017/1/15.
 */

/**
 *  The results:
 *      a.(1+2.236)/2= 1.618    class java.lang.Double
 *      b.1+2+3+4.0= 10.0       class java.lang.Double
 *      c.4.1>=4= true          class java.lang.Boolean
 *      d.1+2+"3"= 33           class java.lang.String
 */


public class EX02 {
    public static void main(String[] args){
        Object a=(1+2.236)/2;
        System.out.println("a.(1+2.236)/2= "+a.toString()+"  "+a.getClass());
        Object b=1+2+3+4.0;
        System.out.println("b.1+2+3+4.0= "+b.toString()+"  "+b.getClass());
        Object c=4.1>=4;
        System.out.println("c.4.1>=4= "+c.toString()+"  "+c.getClass());
        Object d=1+2+"3";
        System.out.println("d.1+2+\"3\"= "+d.toString()+"  "+d.getClass());
    }
}
