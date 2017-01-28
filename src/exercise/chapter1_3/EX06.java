package exercise.chapter1_3;

import tools.StdIn;
import tools.StdOut;

/**
 * Created by 94760 on 2017/1/28.
 */

/**
 * reverse elements of the queue.
 */
public class EX06 {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();
        String s = StdIn.readString();
        String[] input = s.split("");
        for (String i : input)
            queue.enqueue(i);
        for (String i : queue)
            StdOut.print(i);
        StdOut.println();
        Stack<String> stack = new Stack<>();
        while (!queue.isEmpty())
            stack.push(queue.dequeue());
        while (!stack.isEmpty())
            queue.enqueue(stack.pop());
        for (String i : queue)
            StdOut.print(i);
    }
}
