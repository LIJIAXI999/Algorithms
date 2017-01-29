package exercise.chapter1_3;

import tools.StdIn;
import tools.StdOut;

/**
 * Created by 94760 on 2017/1/29.
 */
public class EX12 {
    public static Stack<String> copy(Stack<String> o) {
        Stack<String> result = new Stack<>();
        for (String s : o)
            result.push(s);
        return result;
    }

    public static void main(String[] args) {
        String s = StdIn.readLine();
        String[] inputs = s.split(" ");
        Stack<String> o = new Stack<>();
        for (String i : inputs)
            o.push(i);
        Stack<String> result = copy(o);
        o.push("jack");
        for (String i : o)
            StdOut.print(i);
        StdOut.println();
        for (String i : result)
            StdOut.print(i);
    }
}
