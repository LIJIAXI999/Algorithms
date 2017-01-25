package exercise.chapter1_2;

import tools.Interval1D;
import tools.StdIn;
import tools.StdOut;

/**
 * Created by 94760 on 2017/1/19.
 */
public class EX02 {
    public static void main(String[] args){
        int N=Integer.parseInt(args[0]);
        Interval1D[] a=new Interval1D[N];
        for(int i=0;i<N;i++){
            StdOut.println("Please input the "+(i+1)+" interval.");
            a[i]=new Interval1D(StdIn.readDouble(),StdIn.readDouble());
        }
        if(N<=1){
            System.out.println("There is no intersect.");
            return;
        }

        for (int i = 0; i < N - 1; i++) {
            for (int j = i+1;j<N;j++ )
                if (a[i].intersects(a[j]))
                    StdOut.println(a[i].toString()+" intersects "+a[j].toString());
            }
    }
}
