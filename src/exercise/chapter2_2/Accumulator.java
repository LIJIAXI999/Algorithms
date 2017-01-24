package exercise.chapter2_2;

/**
 * Created by 94760 on 2017/1/18.
 */

import tools.StdOut;
import tools.StdRandom;

/**
 *           The API of Accumulator Data Type
 *-------------------------------------------------------
 * public class Accumulator
 * ------------------------------------------------------
 *           Accumulator()               create a new accumulator
 *   void    addDataValue(double val)    aad a new data to the accumulator
 *   double  mean()                      return the average value
 *   String  toString()                  return the string of the accumulator object
 */
public class Accumulator {
    private double total;
    private double m;
    private double s;
    private int N;
    public void addDataValue(double val){
        N++;
        s=s+1.0*(N-1)/N*(val-m)*(val-m);
        m=m+(val-m)/N;
        total+=val;
    }
    public double var(){
        return s/(N-1);
    }
    public double stddev(){
        return Math.sqrt(this.var());
    }

    public double mean(){
        return total/N;
    }
    public String toString(){
        return "Mean ("+N+"values):"+String.format("%7.5f",mean())+"" +"\n"+
                "var:"+var()+"\n"+"stddev:"+stddev();
    }

    public static void main(String[] args){
        int T=Integer.parseInt(args[0]);
        Accumulator a = new Accumulator();
        for(int i=0;i<T;i++)
            a.addDataValue(StdRandom.random());
        StdOut.println(a);
    }
}
