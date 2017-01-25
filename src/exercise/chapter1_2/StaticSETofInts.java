package exercise.chapter1_2;

import tools.In;
import tools.StdIn;
import tools.StdOut;

import java.util.Arrays;

/**
 * Created by 94760 on 2017/1/18.
 */
public class StaticSETofInts {
    private int[] a;
    public StaticSETofInts(int[] keys){
        a=new int[keys.length];
        for(int i=0;i<a.length;i++)
            a[i]=keys[i];//protective copy.
        Arrays.sort(a);
    }
    public boolean contains(int key){
        return rank(key) !=-1;
    }
    private int rank(int key){
        int lo=0;
        int hi=a.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(key>a[mid])
                lo=mid+1;
            else if(key<a[mid])
                hi=mid-1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args){
        int[] w= In.readInts(args[0]);
        StaticSETofInts set = new StaticSETofInts(w);
        while(!StdIn.isEmpty()){
            int key = StdIn.readInt();
            if(!set.contains(key))
                StdOut.println(key);
        }
    }
}
