package exercise.chapter1_1;

/**
 * Created by 94760 on 2017/1/15.
 */

/**
 * The result:
 *      0  3  4  2  0  1  0  1.
 */
public class EX15 {
    public static int[] histogram(int[] a,int M){
        int[] result=new int[M];
        for(int i=0;i<a.length;i++){
            if(a[i]<M && a[i]>=0)
                result[a[i]]++;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] a = { 1, 1, 2, 3, 1, 7, 5, 3, 2, 2, 2 };
        int[] result = histogram(a, 8);
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%3d", result[i]);
        }
    }
}

