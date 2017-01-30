package exercise.chapter1_3;

import exercise.chapter1_2.Date;
import tools.In;
import tools.StdOut;

/**
 * Created by 94760 on 2017/1/29.
 */
public class EX16 {
    public static Date[] readDates(String name) {
        In in = new In(name);
        Queue<Date> q = new Queue<>();
        while (!in.isEmpty()) {
            String s = in.readString();
            String[] strings = s.split("/");
            int month = Integer.parseInt(strings[0]);
            int day = Integer.parseInt(strings[1]);
            int year = Integer.parseInt(strings[2]);
            Date date = new Date(month, day, year);
            q.enqueue(date);
        }
        int N = q.size();
        Date[] dates = new Date[N];
        for (int i = 0; i < N; i++) {
            dates[i] = q.dequeue();
        }
        return dates;
    }

    public static void main(String[] args) {
        Date[] a = readDates("Dates.txt");
        for (int i = 0; i < a.length; i++)
            StdOut.println(a[i]);
    }
}
