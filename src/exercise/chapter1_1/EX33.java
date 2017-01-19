package exercise.chapter1_1;

import tools.StdIn;

/**
 * Created by 94760 on 2017/1/19.
 */
public class EX33 {
    public static void main(String[] args) {
        double[][] x={{2,3,4},{3,4,5}};
        double[][] y={{3,2,1,5},{1,1,2,2},{1,2,1,3}};
        double[] v1={1,2,3};
        double[] v2={4,6,7};
        Matrix.printVector(v1);
        Matrix.printVector(v2);
        System.out.println(Matrix.dot(v1,v2));
        Matrix.printMatrix(Matrix.mult(x,y));


    }
}
