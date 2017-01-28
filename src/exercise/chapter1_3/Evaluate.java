package exercise.chapter1_3;

import tools.StdIn;
import tools.StdOut;

import java.util.Scanner;

/**
 * Created by 94760 on 2017/1/28.
 */
public class Evaluate {
    public static void evaluate() {
        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNext("x")) {
            String s = sc.next();
            if (s.equals("(")) ;
            else if (s.equals("+")) ops.push(s);
            else if (s.equals("-")) ops.push(s);
            else if (s.equals("*")) ops.push(s);
            else if (s.equals("/")) ops.push(s);
            else if (s.equals("sqrt")) ops.push(s);
            else if (s.equals(")")) {
                String op = ops.pop();
                double val = vals.pop();
                if (op.equals("+")) val = vals.pop() + val;
                else if (op.equals("-")) val = vals.pop() - val;
                else if (op.equals("*")) val = vals.pop() * val;
                else if (op.equals("/")) val = vals.pop() / val;
                else if (op.equals("sqrt")) val = Math.sqrt(val);
                vals.push(val);
            } else vals.push(Double.parseDouble(s));
        }
        StdOut.println(vals.pop());
    }

    public static void main(String[] args) {
        evaluate();
    }
}