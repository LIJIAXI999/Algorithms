package exercise.chapter1_1;

/**
 * Created by 94760 on 2017/1/15.
 */

/**
 * The result:
 *      Print a two-dimensional boolean array.If the value is true,print "*";otherwise print "#".
 */
public class EX11 {

    public static void printBooleanMatrix(boolean[][] a){
        for (int i=0;i<a.length;i++){
                    for (int j=0;j<a[i].length;j++){
                        if(a[i][j]==true)
                            System.out.print("*");
                        else
                            System.out.print("#");
                        System.out.print("     ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        boolean[][] a={{true,false,true},{true,false,false},{false,false,true}};
        printBooleanMatrix(a);
    }
}
