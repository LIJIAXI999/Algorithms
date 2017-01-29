package exercise.chapter1_3;

import tools.StdIn;
import tools.StdOut;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by 94760 on 2017/1/29.
 */
public class ResizingArrayQueue<Item> implements Iterable<Item> {
    private Item[] q;            //queue elements
    private int N = 0;           //number of elements of queue
    private int first = 0;       //index of first element of queue
    private int last = 0;        //index of next available slot

    // cast needed since no generic array creation in Java
    public ResizingArrayQueue() {
        q = (Item[]) new Object[2];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    private void resize(int max) {
        assert max >= N;
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++)
            temp[i] = q[(first + i) % q.length];
        q = temp;
        first = 0;
        last = N;
    }

    public void enqueue(Item item) {
        // double size of array if necessary and recopy to front of array
        if (N == q.length)
            resize(q.length * 2);
        q[last++] = item;           // add item
        if (last == q.length)       // wrap-around
            last = 0;
        N++;
    }

    // remove the least recently added item
    public Item dequeue() {
        if (isEmpty())
            throw new RuntimeException("Queue underflow");
        Item item = q[first];
        q[first] = null;          //to avoid loitering
        first++;
        N--;
        if (first == q.length) first = 0;    // wrap-around
        // shirk size of array if necessary
        if (N > 0 && N < q.length / 4)
            resize(q.length / 2);
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new QueueIterator();
    }

    // an iterator,doesn't implement remove() since it's optional
    private class QueueIterator implements Iterator<Item> {
        private int i = 0;

        public boolean hasNext() {
            return i < N;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public Item next() {
            if (!hasNext())
                throw new NoSuchElementException();
            Item item = q[(i + first) % q.length];  //**
            i++;
            return item;
        }
    }

    public static void main(String[] args) {
        ResizingArrayQueue<String> q = new ResizingArrayQueue<String>();
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNext("0")) {
            String item = sc.next();
            if (!item.equals("-")) q.enqueue(item);
            else if (!q.isEmpty()) StdOut.print(q.dequeue() + " ");
        }
        StdOut.println("(" + q.size() + " left on queue)");
        for (String i : q)
            StdOut.println(i);
    }

}
