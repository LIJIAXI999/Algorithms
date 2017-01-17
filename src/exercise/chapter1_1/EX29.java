package exercise.chapter1_1;

import java.util.Arrays;

/**
 * Created by 94760 on 2017/1/17.
 */


public class EX29 {
    /**
     *  Return the index of the specified key in the ordered specified array.
     * @param a:the ordered specified array.
     * @param key:the specified key.
     * @return index of key in array {@code a} if present; {@code -1} otherwise
     */
    public static int indexof(int[] a,int key){
        int lo=0;
        int hi=a.length-1;
        while(lo<hi){
            int mid=(lo+hi)/2;
            if(key>a[mid])
                lo=mid+1;
            else if(key<a[mid])
                hi=mid-1;
            else
                return mid;
        }
        return -1;
    }

    /**
     * The function is poorly named because it doesn't give the rank.Actually,the function counts elements
     * which is less than the key.
     * @param a:the array of integers,must be sorted in ascending order.
     * @param key:the search key.
     * @return number of the elements which are less than the key.
     */
    public static int rank(int[] a,int key){
        int count=0;
        for(int i=0;i<a.length;i++){
            if (key>a[i])
                count++;
            else
                break;
        }
        return count;
    }

    /**
     *The function counts elements in the array{@code a} and which is equal to the key.
     * @param a:the ordered specified array.
     * @param key:the search key.
     * @return number of the elements which are equal to the key.
     */
    public static int count(int[] a,int key) {
        int count = 0;
        int i = indexof(a, key);
        if (i != -1) {
            if (i == 0) {
                while (a[i] == key) {
                    count++;
                    i++;
                }
            }
            else if(i == a.length - 1){
                while (a[i] == key) {
                    count++;
                    i--;
                }

            }
            else{
                int i1=i;
                while (a[i] == key) {
                    count++;
                    i--;
                }
                while (a[i1+1] == key) {
                    count++;
                    i1++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] whitelist = { 7, 1, 5, 1, 9, 5, 7, 7, 5 };
        Arrays.sort(whitelist);
        int key = 7;
        int i = rank(whitelist,key), j = count(whitelist,key);
        System.out.println("The count less than key: " + i);
        System.out.println("The count equals key: " + j);
        if (j > 0) {
            System.out.print("The keys:");
            for (int k = i; k <= i + j - 1; k++) {
                System.out.print(" " + whitelist[k]);
            }
            System.out.println();
        }
    }
}
