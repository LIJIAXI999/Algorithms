package exercise.chapter1_1;

/**
 * Created by 94760 on 2017/1/16.
 */

/**
 * The result:
 *      mystery(2,25):  This is the 0 times recursion	return mystery(4,12)+2
 *                      This is the 1 times recursion	return mystery(8,6)
 *                      This is the 2 times recursion	return mystery(16,3)
 *                      This is the 3 times recursion	return mystery(32,1)+16
 *                      This is the 4 times recursion	return mystery(64,0)+32
 *                      This is the 5 times recursion	return 0
 *                      0+32+16+2=50.
 *      mystery(3,11):  This is the 0 times recursion	return mystery(6,5)+3
 *                      This is the 1 times recursion	return mystery(12,2)+6
 *                      This is the 2 times recursion	return mystery(24,1)
 *                      This is the 3 times recursion	return mystery(48,0)+24
 *                      This is the 4 times recursion	return 0
 *                      0+24+6+3=33.
 *      mystery(a,b)=a*b;
 *
 *      **change the '+' to '*',and "return 0" to "return 1".
 *      mystery(3,11): This is the 0 times recursion	return mystery(9,5)*3
 *                     This is the 1 times recursion	return mystery(81,2)*9
 *                     This is the 2 times recursion	return mystery(6561,1)
 *                     This is the 3 times recursion	return mystery(43046721,0)*6561
 *                     This is the 4 times recursion	return 1
 *                     3**11=177147
 *      mystery(a,b)==a**b;
 *
 */
public class EX18 {
    static int count=0;
    public static int mystery(int a,int b){
        System.out.printf("This is the %d times recursion\t",count);
        count++;
        if(b==0) {
            System.out.println("return 1");
            return 1;
        }
        if(b%2==0) {
            System.out.printf("return mystery(%d,%d)\n",a*a,b/2);
            return mystery(a * a, b / 2);
        }
        System.out.printf("return mystery(%d,%d)*%d\n",a*a,b/2,a);
        return mystery(a*a,b/2)*a;
    }
    public static void main(String[] args){
        System.out.println(mystery(3,11));
    }
}
