package exercise.chapter1_3;

import exercise.chapter1_2.Date;
import exercise.chapter1_2.TransAction;
import tools.In;
import tools.StdOut;

/**
 * Created by 94760 on 2017/1/30.
 */
public class EX17 {
    public static TransAction[] readTransaction(String name) {
        In in = new In(name);
        Queue<TransAction> q = new Queue<>();
        while (!in.isEmpty()) {
            String s = in.readLine();
            TransAction t = new TransAction(s);
            q.enqueue(t);
        }
        int N = q.size();
        TransAction[] transActions = new TransAction[N];
        for (int i = 0; i < N; i++)
            transActions[i] = q.dequeue();
        return transActions;
    }


    public static void main(String[] args) {
        TransAction[] a = readTransaction("Transactions.txt");
        for (int i = 0; i < a.length; i++)
            StdOut.println(a[i]);
    }
}
