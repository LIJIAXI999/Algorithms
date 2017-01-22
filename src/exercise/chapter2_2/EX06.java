package exercise.chapter2_2;

import tools.StdOut;

/**
 * Created by 94760 on 2017/1/20.
 */
public class EX06 {
    public static boolean isCircularRotation(String s,String t){
        if(s.length()==t.length()&&s.concat(s).indexOf(t)!=-1)
            return true;
        return false;
    }
    public static void main(String[] args){
        String s="ACTGACG";
        String t="TGACGAC";
        StdOut.println(isCircularRotation(s,t));
    }
}
