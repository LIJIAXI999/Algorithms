package exercise.chapter1_2;

import tools.In;
import tools.Out;

/**
 * Created by 94760 on 2017/1/17.
 */
public class Cat {
    public static void main(String[] args){
        //copy all input files to the output stream.
        Out out =new Out(args[args.length-1]);
        for(int i=0;i<args.length-1;i++){
            //copy the i th input file into the output stream.
            In in =new In(args[i]);
            String s=in.readAll();
            out.println(s);
            in.close();
        }
        out.close();
    }
}
