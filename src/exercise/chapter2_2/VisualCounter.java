package exercise.chapter2_2;

import tools.StdDraw;

/**
 * Created by 94760 on 2017/1/21.
 */
public class VisualCounter {
    private int count;
    int n;
    private int max;
    private int N;

    public VisualCounter(int N,int max){
        count=0;
        n=0;
        this.N=N;
        this.max=max;
        StdDraw.setXscale(0,N);
        StdDraw.setYscale(-max,max);
        StdDraw.setPenRadius(0.01);
        StdDraw.point(0,0);
    }

    public void increment(){
        if(n+1>N){
            System.out.println("Operate too much!");
            return;
        }
        if(count+1>max){
            System.out.println("Exceed the max!");
        }
        count++;
        n++;
        StdDraw.point(n,count);
    }

    public void decrement(){
        if(n+1>N){
            System.out.println("Operate too much!");
            return;
        }
        if(count-1<-max){
            System.out.println("Exceed the min!");
            return;
        }
        count--;
        n++;
        StdDraw.point(n,count);
    }
    public int getCount(){
        return count;
    }
    public static void main(String[] args) {
        VisualCounter counter = new VisualCounter(20, 5);
        for (int i = 0; i < 4; i++) {
            counter.increment();
        }
        for (int i = 0; i < 7; i++) {
            counter.decrement();
        }
        for (int i = 0; i < 2; i++) {
            counter.increment();
        }
        System.out.println(counter.getCount());
    }
}
