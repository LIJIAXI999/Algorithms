package exercise.chapter2_2;

import tools.Counter;
import tools.StdRandom;

/**
 * Created by 94760 on 2017/1/17.
 */
public class FlipsMax {
    public static Counter max(Counter x, Counter y){
        if(x.tally()>y.tally())
            return x;
        else
            return y;
    }
    public static void main(String[] args){
        int T = Integer.parseInt(args[0]);
        Counter heads =new Counter("heads");
        Counter tail =new Counter("tail");
        for(int t=0;t<T;t++){
            if (StdRandom.bernoulli(0.5))
                heads.increment();
            else tail.increment();
        }
        if(heads.tally()==tail.tally())
            System.out.println("Tie");
        else
            System.out.println(max(heads,tail)+" wins.");
    }
}
