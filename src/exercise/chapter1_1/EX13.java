package exercise.chapter1_1;

/**
 * Created by 94760 on 2017/1/15.
 */

/**
 * The result: Transport the matrix and print.
 * -------------------------------------------
 *   true true false
 *   false false false
 *   true false true
 */
public class EX13 {
    public static Object[][] transportMatrix(Object[][] a) {
        Object[][] r=new Object[a[0].length][a.length];
        for (int i=0;i<r.length;i++){
            for(int j=0;j<r[i].length;j++){
                r[i][j]=a[j][i];
            }
        }
        return r;
    }
    public static void printMatrix(Object[][] a){
        for (int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j].toString());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Object[][] a={{true,false,true},{true,false,false},{false,false,true}};
        printMatrix(transportMatrix(a));
    }
}
