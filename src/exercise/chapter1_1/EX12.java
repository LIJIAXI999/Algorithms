package exercise.chapter1_1;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Created by 94760 on 2017/1/15.
 */

/**
 * The result:
 *      0 1 2 3 4 4 3 2 1 0 .
 */
public class EX12 {
    public static void main(String[] args){
        int[] a=new int[10];
        for(int i=0;i<10;i++)
            a[i]=9-i;
        for(int i=0;i<10;i++)
            a[i]=a[a[i]];
        for(int i=0;i<10;i++)
            System.out.print(a[i]+" ");
    }
}
