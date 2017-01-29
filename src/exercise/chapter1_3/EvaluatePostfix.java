package exercise.chapter1_3;

import tools.StdIn;
import tools.StdOut;

/**
 * Created by 94760 on 2017/1/29.
 */
public class EvaluatePostfix {
    public static void main(String[] args) {
        String s = StdIn.readString();
        String[] inputs = s.split("");

        Stack<Double> vals = new Stack<>();

        for (int i = 0; i < inputs.length; i++) {
            double x = 0;
            switch (inputs[i]) {
                case "+":
                    x = vals.pop();
                    x = vals.pop() + x;
                    vals.push(x);
                    break;
                case "-":
                    x = vals.pop();
                    x = vals.pop() - x;
                    vals.push(x);
                    break;
                case "*":
                    x = vals.pop();
                    x = vals.pop() * x;
                    vals.push(x);
                    break;
                case "/":
                    x = vals.pop();
                    x = vals.pop() / x;
                    vals.push(x);
                    break;
                default:
                    vals.push(Double.parseDouble(inputs[i]));
            }

        }
        StdOut.printf("The result: %f", vals.pop());
    }
}
