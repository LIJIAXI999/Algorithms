package exercise.chapter1_1;

import tools.StdDraw;
import tools.StdRandom;

import java.awt.*;

/**
 * Created by 94760 on 2017/1/17.
 */
public class EX31 {
    static class Point{
        double x;
        double y;

        public Point(double x,double y){
            super();
            this.x=x;
            this.y=y;
        }
    }

    public static void main(String[] args){
        int N = Integer.parseInt(args[0]);
        double p= Double.parseDouble(args[1]);
        if(p<0||p>1){
            System.out.println("p is not valid!");
            return;
        }
        //initialize N points.
        Point[] points =new Point[N];
        //each radian 360/N.
        double angle=360.0/N;
        StdDraw.circle(0.5,0.5,0.5);
        StdDraw.setPenRadius(0.05);
        for(int i=0;i<N;i++){
            points[i] =new Point(0.5+0.5*Math.cos(angle*i*Math.PI/180),
                    0.5+0.5*Math.sin(angle*i*Math.PI/180));
            StdDraw.point(points[i].x,points[i].y);
        }
        StdDraw.setPenRadius(0.01);
        StdDraw.setPenColor(Color.gray);
        for(int i=0;i<N-1;i++){
            for(int j=i+1;j<N;j++)
                if (StdRandom.bernoulli(p))
                    StdDraw.line(points[i].x,points[i].y,points[j].x,points[j].y);
        }



    }

}
