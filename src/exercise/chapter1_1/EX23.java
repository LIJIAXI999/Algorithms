package exercise.chapter1_1;

import tools.StdIn;

/**
 * Created by 94760 on 2017/1/16.
 */
public class EX23 {
    public static int rank(int key,int[] a){
        return rank(key,a,0,a.length-1,0);
    }
    public static int rank(int key,int[] a,int lo,int hi,int depth){

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
        System.out.printf("+ or - ? ");
        char arg = StdIn.readChar();
        StdIn.readLine();
        System.out.println("Input keys:");
        String[] keys=StdIn.readLine().split(" ");
        for(int i=0;i<keys.length;i++){
            if(rank(Integer.parseInt(keys[i]),a)!=-1&&arg=='-'){
                System.out.printf("%s",keys[i]);
            }
            else if (rank(Integer.parseInt(keys[i]), a) == -1 && arg == '+'){
                System.out.printf("%s",keys[i]);
            }
        }
    }
}
