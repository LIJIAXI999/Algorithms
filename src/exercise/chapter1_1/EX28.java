package exercise.chapter1_1;

import tools.BinarySearch;
import tools.StdIn;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by 94760 on 2017/1/16.
 */
public class EX28 {
    public static void main(String[] args){
        // Sort the original whitelist.
        int[] whitelist={7,1,5,1,9,5,7,7,5,1};
        Arrays.sort(whitelist);
        //Use the ArrayList<Integer> to remove duplicate elements.
        //list.add() function needn't index for inserting.
        ArrayList<Integer> list=new ArrayList<>();
        for(int i =0;i<whitelist.length-1;i++){
            if(whitelist[i]!=whitelist[i+1])
                list.add(whitelist[i]);
        }
        list.add(whitelist[whitelist.length-1]);
        //reinsert elements into a new whitelist.
        whitelist=new int[list.size()];
        for(int i=0;i<whitelist.length;i++){
            whitelist[i]=list.get(i);
            System.out.print(whitelist[i]+" ");
        }
        System.out.println();
        System.out.println(BinarySearch.indexOf(whitelist, StdIn.readInt()));
    }
}
