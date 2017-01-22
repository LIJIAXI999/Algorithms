package exercise.chapter2_2;

import tools.Counter;
import tools.In;
import tools.StdOut;

import java.util.Arrays;

/**
 * Created by 94760 on 2017/1/21.
 */
public class EX09 {
    public static int rank(int[] a, int key, Counter c){

        return rank(a,key,c,a.length-1,0);
    }
    private static int rank(int[] a,int key,Counter c,int hi,int lo){
        if(hi<lo)
            return -1;
        int mid=lo+(hi-lo)/2;
        c.increment();
        if(key<a[mid])
            return rank(a,key,c,mid-1,lo);
        else if(key>a[mid])
            return rank(a,key,c,hi,mid+1);
        else return mid;
}
    public static void main(String[] args){
        int[] whitelist = In.readInts(args[0]);
        Arrays.sort(whitelist);
        int key=5;
        Counter c=new Counter("x");
        int index=rank(whitelist,key,c);
        StdOut.println("Checked up "+c.tally()+" elements.");
        StdOut.println("index is "+index);
    }
}
