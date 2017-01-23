package exercise.chapter2_2;

import tools.In;

/**
 * Created by 94760 on 2017/1/23.
 */
public class EX15 {
    public static int[] readInts(String name){
        In in=new In(name);
        String input=in.readAll();
        String[] fields=input.split("\\s+");
        int[] result =new int[fields.length];
        for(int i=0;i<result.length;i++){
            result[i]=Integer.parseInt(fields[i]);
        }
        return result;
    }
    public static void main(String[] args){
        int[] ints=readInts("test.txt");
        for(int i=0;i<ints.length;i++)
            System.out.println(ints[i]);
    }
}
