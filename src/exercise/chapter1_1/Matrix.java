package exercise.chapter1_1;

/**
 * Created by 94760 on 2017/1/19.
 */

import tools.StdOut;

/**
 *                          The  API of Matrix class's static method
 *----------------------------------------------------------------------------------
 * public class Matrix
 * ---------------------------------------------------------------------------------
 * static   double      dot(double[] x,double[] y)       calculate dot product of vectors multiplication
 * static   double[][]  mult(double[][] a,double[][] b)  calculate product of matrix multiplication
 * static   double[][]  transpose(double[][] a)          transpose the matrix
 * static   double[]    mult(double[][] a,double[] x)    matrix multiply vector
 * static   double[]    mult(double[] x,double[][] a)    vector multiply matrix
 */
public class Matrix {
    /**
     * calculate dot product of two vectors.
     * @param x:vector one.
     * @param y:vector two.
     * @return dot product.
     */
    public static double dot(double[] x,double[] y){
        if (x.length!=y.length)
            throw new IllegalArgumentException("vectors mismatch.");
        double sum=0;
        for(int i=0;i<x.length;i++){
            sum+=x[i]*y[i];
        }
        return sum;
    }

    /**
     * calculate matrix multiplication.
     * @param a:matrix a.
     * @param b:matrix b.
     * @return a*b.
     */
    public static double[][] mult(double[][] a,double[][] b){
        if (a[0].length!=b.length)
            throw new IllegalArgumentException("matrices mismatch.");
        double[][] result=new double[a.length][b[0].length];
        for(int k=0;k<result.length;k++) {
            for (int i = 0; i <result.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    result[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        return result;
    }

    public static double[][] tanspose(double[][] a){
        double[][] result=new double[a[0].length][a.length];
        for (int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++)
                result[i][j]=a[j][i];
        }
        return result;
    }

    public static double[] mult(double[][] a,double[] x){
        if(a[0].length!=x.length)
            throw new IllegalArgumentException("matrix and vector mismatch.");
        double[] result=new double[a.length];
        for (int i=0;i<result.length;i++){
            for(int j=0;j<x.length;j++)
                result[i]+=a[i][j]*x[j];
        }
        return result;
    }

    public static double[] mult(double[] y,double[][] a){
        if(y.length!=a.length)
            throw new IllegalArgumentException("vector and matrix mismatch.");
        double[] result=new double[a[0].length];
        for (int i=0;i<result.length;i++){
            for(int j=0;j<y.length;j++)
                result[i]+=y[j]*a[j][i];
        }
        return result;
    }

    public static void printMatrix(double[][] a){
        for (int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++)
                StdOut.printf("%-10.1f",a[i][j]);
            StdOut.println();
        }
    }
    public static void printVector(double[] v){
        for (int i=0;i<v.length;i++){
            StdOut.printf("%-10.1f",v[i]);
        }
        StdOut.println();
    }
}
