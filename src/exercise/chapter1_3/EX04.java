package exercise.chapter1_3;

/**
 * Created by 94760 on 2017/1/28.
 */

import tools.StdIn;
import tools.StdOut;

import java.util.Scanner;

/**
 * Use Case of Stack: Parentheses
 */
public class EX04 {
    public static void main(String[] args) {
        boolean flag = true;
        Stack<String> left = new Stack<>();
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNext("x")) {
            String s = sc.next();
            if (s.equals("{")) left.push(s);
            else if (s.equals("(")) left.push(s);
            else if (s.equals("[")) left.push(s);
            else {
                if (s.equals(")"))
                    if (!left.pop().equals("(")) {
                        flag = !flag;
                        break;
                    }
                if (s.equals("]"))
                    if (!left.pop().equals("[")) {
                        flag = !flag;
                        break;
                    }
                if (s.equals("}"))
                    if (!left.pop().equals("{")) {
                        flag = !flag;
                        break;
                    }
            }
        }
        StdOut.print(flag);
    }


}
