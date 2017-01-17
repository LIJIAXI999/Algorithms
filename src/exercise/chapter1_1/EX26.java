package exercise.chapter1_1;

/**
 * Created by 94760 on 2017/1/16.
 */

/**
 * The result:
 *      It's a simplified bubble sort.
 */
public class EX26 {
    public static void threeNumbersSort(int a,int b,int c){
        int t;
        System.out.printf("The original sequence: a:%d b:%d c:%d\n",a,b,c);
        if(a>b){
            t=a;
            a=b;
            b=t;
            System.out.printf("a:%d b:%d c:%d\n",a,b,c);
        }
        if(a>c){
            t=a;
            a=c;
            c=t;
            System.out.printf("a:%d b:%d c:%d\n",a,b,c);
        }
        if(b>c){
            t=b;
            b=c;
            c=t;
            System.out.printf("a:%d b:%d c:%d\n",a,b,c);
        }
    }
    public static void main(String[] args){
        threeNumbersSort(9,2,1);
    }
}
