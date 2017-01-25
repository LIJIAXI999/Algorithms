package exercise.chapter1_2;

import tools.StdOut;

/**
 * Created by 94760 on 2017/1/20.
 */

/**
 * The result:
 *      world
 *      hello
 *      Hello World
 *
 *      It's a deep copy? No
 *      create a new literal String "world" refer to string1.
 *      A String object is immutable.AlL String methods will return a new String object,but won't alter
 *      the original string.
 */
public class EX0405 {
    public static void main(String[] args){
        String string1="hello";
        String string2=string1;
        string1="world";
        StdOut.println(string1);
        StdOut.println(string2);

        String s="Hello World";
        s.toUpperCase();
        s.substring(6,11);
        StdOut.println(s);
    }

}
