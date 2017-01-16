package exercise.chapter1_1;

/**
 * Created by 94760 on 2017/1/15.
 */

/**
 * The results:
 *      1.b:print "char" b.
 *      2.197:"char" actually is 8 bits int,turn "char" to "byte" and add.
 *      3.e:turn "char" to "byte" and add,then cast to "char".
 */
public class EX08 {
    public static void main(String[] args){
        System.out.println('b');
        System.out.println('b'+'c');
        System.out.println((char)('a'+4));
    }
}
