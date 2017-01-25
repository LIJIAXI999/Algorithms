package exercise.chapter1_2;

/**
 * Created by 94760 on 2017/1/18.
 */

import tools.StdDraw;
import tools.StdOut;
import tools.StdRandom;

/**
 *           The API of VisualAccumulator Data Type
 *-------------------------------------------------------
 * public class VisualAccumulator
 * ------------------------------------------------------
 *           VisualAccumulator(int trials,double max)
 *                                       create a new visual accumulator
 *   void    addDataValue(double val)    aad a new data to the accumulator
 *   double  mean()                      return the average value
 *   String  toString()                  return the string of the accumulator object
 */
public class VisualAccumulator {
    private double total;
    private int N;

    public VisualAccumulator(int trials,double max){
        StdDraw.setXscale(0,trials);
        StdDraw.setYscale(0,max);
        StdDraw.setPenRadius(0.005);
    }
    public void addDataValue(double val){
        N++;
        total+=val;
        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.point(N,val);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(N,total/N);
    }
    public double mean(){
        return total/N;
    }
    public String toString(){
        return "Mean ("+N+"values):"+String.format("%7.5f",mean());
    }

    public static void main(String[] args){
        int T=Integer.parseInt(args[0]);
        VisualAccumulator a = new VisualAccumulator(T,1.0);
        for(int i=0;i<T;i++)
            a.addDataValue(StdRandom.random());
        StdOut.println(a);
    }
}
