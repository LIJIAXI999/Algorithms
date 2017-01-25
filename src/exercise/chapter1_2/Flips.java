package exercise.chapter1_2;

import tools.Counter;
import tools.StdOut;
import tools.StdRandom;

/**
 * Created by 94760 on 2017/1/17.
 */
public class Flips {
    public static void main(String[] args){
        int T=Integer.parseInt(args[0]);
        Counter heads=new Counter("heads");
        Counter tail=new Counter("tail");
        for(int t=0;t<T;t++) {
            if (StdRandom.bernoulli(0.5))
                heads.increment();
            else
                tail.increment();
        }
        StdOut.println(heads);
        StdOut.println(tail);
        int d =heads.tally()-tail.tally();
        StdOut.println("delta: "+Math.abs(d));
    }
}
