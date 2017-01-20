package exercise.chapter2_2;

import tools.*;

/**
 * Created by 94760 on 2017/1/20.
 */
public class EX03 {
    public static void main(String[] args){
        int N=Integer.parseInt(args[0]);
        double min=Double.parseDouble(args[1]);
        double max=Double.parseDouble(args[2]);
        StdDraw.setXscale(min,max);
        StdDraw.setYscale(min,max);
        Point2D[] leftTopPoints = new Point2D[N];
        Point2D[] rightBottomPoints = new Point2D[N];
        Interval2D[] interval2DS=new Interval2D[N];

        for(int i=0;i<N;i++){
            double left,right,top,bottom;
            Interval1D x,y;
            double a=StdRandom.uniform(min,max);
            double b=StdRandom.uniform(min,max);
            if(a<b){
                left=a;
                right=b;
            }else{
                left=b;
                right=a;
            }
            x=new Interval1D(left,right);
            a=StdRandom.uniform(min,max);
            b=StdRandom.uniform(min,max);
            if(a<b){
                bottom=a;
                top=b;
            }else{
                bottom=b;
                top=a;
            }
            y=new Interval1D(bottom,top);
            leftTopPoints[i]=new Point2D(left,top);
            rightBottomPoints[i]=new Point2D(right,bottom);
            interval2DS[i]=new Interval2D(x,y);
            interval2DS[i].draw();
        }
        int containNum=0,intersectNum=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(j>i&&interval2DS[i].intersects(interval2DS[j]))
                    intersectNum++;
                if(j!=i&&interval2DS[i].contains(leftTopPoints[j])&&interval2DS[i].contains(rightBottomPoints[j]))
                    containNum++;
            }

        }
        System.out.println("Intersects count: "+intersectNum);
        System.out.println("Contain count: "+containNum);
    }

}
