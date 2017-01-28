package exercise.chapter1_3;

import jdk.nashorn.internal.runtime.regexp.joni.constants.StackPopLevel;
import tools.StdIn;
import tools.StdOut;

/**
 * Created by 94760 on 2017/1/28.
 */
public class EX05 {
    public static void main(String[] args) {
        int N = StdIn.readInt();
        Stack<Integer> stack = new Stack<>();
        while (N > 0) {
            stack.push(N % 2);
            N = N / 2;
        }
        for (int d : stack)
            StdOut.print(d);
    }
}
