package exercise.chapter1_3;

import tools.StdIn;

/**
 * Created by 94760 on 2017/1/29.
 */
public class InfixToPostfix {
    public static void main(String[] args) {
        String string = StdIn.readString();
        String[] input = string.split("");
        Stack<String> Postfix = new Stack<>();
        for (int i = 0; i < input.length; i++) {
            switch (input[i]) {
                case "+":
                case "-":
                case "*":
                case "/":
                    Postfix.push(input[i]);
                    break;
                case "(":
                    break;
                case ")":
                    System.out.print(Postfix.pop());
                    break;
                default:
                    System.out.print(input[i]);
            }
        }
        System.out.println();
    }
}
