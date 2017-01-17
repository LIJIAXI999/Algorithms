package exercise.chapter2_2;

import tools.StdOut;
import tools.StdRandom;

/**
 * Created by 94760 on 2017/1/17.
 */
public class Counter implements Comparable<Counter> {
    private final String name;
    private int count = 0;

    public Counter(String id){
        name=id;
    }

    public void increment(){
        count++;
    }
    public int tally(){
        return count;
    }
    public String toString(){
        return count + " " +name;
    }
    @Override
    public int compareTo(Counter that){
        if(this.count<that.count)
            return -1;
        else if(this.count>that.count)
            return 1;
        else
            return 0;
    }
    /**
     * Reads two command-line integers n and trials; creates n counters;
     * increments trials counters at random; and prints results.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args){
        int n=Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        //create n counters
        Counter[] hits = new Counter[n];
        for(int i=0;i<n;i++){
            hits[i]=new Counter("counter"+i);
        }

        //increment trials counters at random
        for(int t=0;t<trials;t++){
            hits[StdRandom.uniform(n)].increment();
        }

        //print results
        for(int i=0;i<n;i++){
            StdOut.println(hits[i].toString());
        }
    }
}
