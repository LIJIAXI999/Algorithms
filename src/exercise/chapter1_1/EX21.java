package exercise.chapter1_1;

import tools.StdIn;
import tools.StdOut;

/**
 * Created by 94760 on 2017/1/16.
 */
public class EX21 {
    public static void main(String[] args){
        System.out.println("Please input count:");
        int n= StdIn.readInt();
        System.out.println("Please input data:");
        String[] nameArray = new String[n];
        int[] integerArray1=new int[n];
        int[] integerArray2=new int[n];
        for(int i=0;i<n;i++){
            nameArray[i]=StdIn.readString();
            integerArray1[i]=StdIn.readInt();
            integerArray2[i]=StdIn.readInt();
        }
        System.out.flush();
        for (int i=0;i<n;i++){
            System.out.printf("|%4s|%4d|%4d|%6.3f|\n",nameArray[i],integerArray1[i],integerArray2[i],
                    (float)integerArray1[i]/integerArray2[i]);
        }

    }
}
