package exercise.chapter1_3;

import tools.StdIn;
import tools.StdOut;

import java.util.Scanner;

/**
 * Created by 94760 on 2017/1/29.
 */

/**
 * the result:
 * ----------------------------------
 * 1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) ) x
 * ( ( 1 + 2 ) * ( ( 3 - 4 ) * ( 5 - 6 ) ) )
 */
public class EX09 {
    public static void main(String[] args) {
        Stack<String> ops = new Stack<>();
        Stack<String> vals = new Stack<>();
        Scanner sc = new Scanner(System.in);
        //input x as the end of the input stream
        while (!sc.hasNext("x")) {
            String s = sc.next();

            if (s.equals("(")) ;
            else if (s.equals("+") ||
                    s.equals("-") ||
                    s.equals("*") ||
                    s.equals("/") ||
                    s.equals("sqrt")) ops.push(s);
            else if (s.equals(")")) {
                String op = ops.pop();
                String v = vals.pop();

                if (op.equals("+") ||
                        op.equals("-") ||
                        op.equals("*") ||
                        op.equals("/"))
                    v = String.format("( %s %s %s )", vals.pop(), op, v);
                else if (op.equals("sqrt"))
                    v = String.format("( %s %s )", op, v);

                vals.push(v);
            } else vals.push(s);
        }
        StdOut.println(vals.pop());
    }
}
