package exercise.chapter1_1;

/**
 * Created by 94760 on 2017/1/16.
 */

/**
 * The result:
 *      lo=0, hi=8
 *          lo=0, hi=3
 *              lo=2, hi=3
 *                  lo=3, hi=3
 *      position=3
 */
public class EX22 {
    public static int rank(int key,int[] a){
        return rank(key,a,0,a.length-1,0);
    }
    public static int rank(int key,int[] a,int lo,int hi,int depth){
        for(int i=0;i<depth;i++)
            System.out.print("  ");
        System.out.println("lo="+lo+", hi="+hi);
        if(lo>hi)
            return -1;
        int mid=lo+(hi-lo)/2;
        if(key<a[mid])
            return rank(key,a,lo,mid-1,depth+1);
        else if(key>a[mid])
            return rank(key,a,mid+1,hi,depth+1);
        else
            return mid;
    }
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 5, 6, 7, 8, 9, 12 };
        int key = 5;
        int pos = rank(key, a);
        if (pos == -1) {
            System.out.println("not found!");
        } else {
            System.out.println("position=" + pos);
        }
    }
}
