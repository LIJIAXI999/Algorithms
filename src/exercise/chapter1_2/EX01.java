package exercise.chapter1_2;

import tools.Point2D;


/**
 * Created by 94760 on 2017/1/19.
 */
public class EX01 {
    public static void main(String[] args){
        int N=Integer.parseInt(args[0]);
        Point2D[] points=new Point2D[N];
        for(int i=0;i<N;i++){
            points[i]=new Point2D(Math.random(),Math.random());
            points[i].draw();
        }
        if(N>1){
            double min = points[0].distanceTo(points[1]);
            for(int i=0;i<N-1;i++){
                for(int j=i+1;j<N;j++){
                    double x=points[i].distanceTo(points[j]);
                    if(x<min)
                        min=x;
                }
            }
            System.out.println("Min distance:"+min);
        }
    }
}
