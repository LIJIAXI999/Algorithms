package exercise.chapter1_3;

/**
 * Created by 94760 on 2017/1/25.
 */

import tools.StdIn;
import tools.StdOut;

/**
 *               The API of FixedCapacityStackOfString
 *-----------------------------------------------------------------------------------------------
 *          FixedCapacityStackofString(int cap)  create an empty stack which can hold "cap" strings
 * void     push(String item)                    add a string to the stack
 * String   pop()                                remove the latest string
 * boolean  isEmpty()                            is the stack empty
 * int      size()                               the number of strings in the stack
 */
public class FixedCapacityStackOfString {
    private String[] a; //stack entries
    private int N;      //size
    public FixedCapacityStackOfString(int cap){
        a=new String[cap];
    }
    public boolean isEmpty(){return N==0;}
    public int size(){return N;}
    public void push(String item){
        a[N++]=item;
    }
    public String pop(){
        return a[--N];
    }

    public static void main(String[] args){
        FixedCapacityStackOfString s=new FixedCapacityStackOfString(100);
        while(!StdIn.isEmpty()){
           String item = StdIn.readString();
           if(!item.equals("-"))
               s.push(item);
           else if(!s.isEmpty()) StdOut.print(s.pop()+" ");
        }
        StdOut.println("("+s.size()+" left on stack.");
    }
}
