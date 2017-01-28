package exercise.chapter1_3;

/**
 * Created by 94760 on 2017/1/25.
 */
public class FixedCapacityStack<Item> {
    private Item[] a;  //stack entries
    private int N;     //stack size

    public FixedCapacityStack(int cap) {
        a = (Item[]) new Object[cap];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    /**
     * EX01
     */
    public boolean isFull() {
        return N == a.length;
    }

    public int size() {
        return N;
    }

    public void push(Item item) {
        a[N++] = item;
    }

    public Item pop() {
        return a[--N];
    }


}
