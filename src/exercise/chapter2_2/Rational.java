package exercise.chapter2_2;

/**
 * Created by 94760 on 2017/1/23.
 */

import tools.StdIn;
import tools.StdOut;

/**
 * The API of Rational class
 * ---------------------------------------------------------------------
 * Rational(int numerator,int denominator)
 * Rational    plus(Rational b)            sum of this and b
 * Rational    minus(Rational b)           difference of this minus b
 * Rational    times(Rational b)           product of this and b
 * Rational    divides(Rational b)         quotient of this over b
 * boolean     equals(Rational that)       judge whether two numbers are equal
 * String      toString()                  string representation of this object.
 */
/*public class Rational {
    private final int numerator;
    private final int denominator;
    private static int MAX = 2147483647;
    private static int MIN = -2147483647;

    public Rational(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0)
            throw new ArithmeticException("Divide by zero");
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        int commonDivisor = gcd(Math.abs(numerator), Math.abs(denominator));
        this.numerator = numerator / commonDivisor;
        this.denominator = denominator / commonDivisor;
    }

    Rational plus(Rational b) {
        assert isPlusOverflow(numerator * b.denominator, b.numerator * denominator) : "Plus overflow";
        assert isTimesOverflow(denominator, b.denominator) : "Times overflow";
        return new Rational(numerator * b.denominator + b.numerator * denominator, denominator * b.denominator);
    }

    public Rational minus(Rational b) {
        return new Rational(numerator * b.denominator - b.numerator * denominator, denominator * b.denominator);
    }

    public Rational times(Rational b) {
        assert isTimesOverflow(numerator, b.numerator) : "Times overflow";
        assert isTimesOverflow(denominator, b.denominator) : "Times overflow";
        return new Rational(numerator * b.numerator, denominator * b.denominator);
    }

    public Rational divides(Rational b) {
        return new Rational(numerator * b.denominator, denominator * b.numerator);
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Rational x = (Rational) o;
        if (this.numerator != x.numerator) return false;
        if (this.denominator != x.denominator) return false;
        return true;
    }

    @Override
    public String toString() {
        if (Math.abs(numerator) % Math.abs(denominator) == 0)
            return String.valueOf(numerator / denominator);
        else
            return numerator + "/" + denominator;
    }


    private boolean isPlusOverflow(int a, int b) {
        return a >= 0 ? a + b < MAX : a + b > MIN;
    }

    private boolean isTimesOverflow(int a, int b) {
        if (a < 0)
            a = -a;
        if (b < 0)
            b = -b;
        if (a == 0 || b == 0)
            return false;
        else {
            return a * b < MAX;
        }
    }


    public static void main(String[] args) {
        System.out.println("Rational a:");
        System.out.print("numerator: ");
        int numerator = StdIn.readInt();
        System.out.print("denominator: ");
        int denominator = StdIn.readInt();
        Rational a = new Rational(numerator, denominator);
        System.out.println("Rational b:");
        System.out.print("numerator: ");
        numerator = StdIn.readInt();
        System.out.print("denominator: ");
        denominator = StdIn.readInt();
        Rational b = new Rational(numerator, denominator);
        System.out.println("a plus b: " + a.plus(b));
        System.out.println("a minus b: " + a.minus(b));
        System.out.println("a times b: " + a.times(b));
        System.out.println("a divides b: " + a.divides(b));
        System.out.println("a equals b: " + a.equals(b));
    }

}*/

// a better implementation
public class Rational implements Comparable<Rational>{
    private static Rational zero = new Rational(0,1);
    private long num; //the numerator
    private long den; //the denominator

    //create and initialize a new Rational object
    public Rational(long numerator,long denominator){

        //deal with x/0
        if(denominator == 0)
            throw new RuntimeException("Denominator is zero");

        //reduce fraction
        long g=gcd(numerator,denominator);
        num=numerator/g;
        den=denominator/g;

        //only needed for negative numbers
        if(den<0){
            den=-den;
            num=-num;
        }
    }

    //return the numerator and denominator of this rational number.
    public long numerator(){
        return num;
    }
    public long denominator(){
        return den;
    }

    //return double precision representation of this rational number
    public double toDouble(){
        return (double)num/den;
    }

    //return string representation of this rational number
    public String toString(){
        if(den==1) return num+" ";
        else return num+"/"+den;
    }

    //return {-1,0,+1} if this < that,this = that,or this > that
    @Override
    public int compareTo(Rational that) {
        long lhs = this.num*that.den;
        long rhs = this.den*that.num;
        if(lhs<rhs) return -1;
        if(lhs>rhs) return +1;
        return 0;
    }

    //is this Rational object equal to y?
    public boolean equals(Object o){
        if (this==o) return true;
        if(o==null) return false;
        if (this.getClass()!=o.getClass()) return false;
        Rational x =(Rational) o;
        return this.compareTo(x)==0;
    }

    //hashCode consistent with equals() and compareTo()
    public int hashCode(){
        return this.toString().hashCode();
    }

    //create and return a new rational (r.num+s.num)/(r.den+s.den)
    public static Rational mediant(Rational r,Rational s){
        return new Rational(r.num+s.num,r.den+s.den);
    }

    //return gcd(|m|,|n|)
    private static long gcd(long m,long n){
        if (m<0) m=-m;
        if (n<0) n=-n;
        if (n==0) return m;
        return gcd(n,m%n);
    }

    //return lcm(|m|,|n|)
    private static long lcm(long m,long n){
        if (m<0) m=-m;
        if(n<0) n=-n;
        return m*(n/gcd(m,n)); //parentheses important to avoid overflow
    }

    //return this * that ,staving off overflow as much as possible by cross-cancellation
    public Rational times(Rational that){
        //reduce p1/q2 and p2/q1,then multiply,where a=p1/q1 and b=p2/q2
        Rational c=new Rational(this.num,that.den);
        Rational d=new Rational(that.num,this.den);

        return new Rational(c.num*d.num,c.den*d.den);
    }

    //return this + that,staving off overflow
    public Rational plus(Rational that){
        //special case
        if(this.compareTo(zero)==0) return that;
        if(that.compareTo(zero)==0) return this;

        //Find gcd of numerators and denominators
        long f = gcd(this.num,that.num);
        long g = gcd(this.den,that.den);

        //add cross-product terms for numerator
        Rational s = new Rational((this.num/f)*(that.den/g)+(that.num/f)*(this.den/g),
                lcm(this.den,that.den));

        //multiply back in
        s.num*=f;
        return s;
    }

    //return -this
    public Rational negat(){
        return new Rational(-num,den);
    }


    //return this - that
    public Rational minus(Rational that){
        return this.plus(that.negat());
    }

    public Rational reciprocal(){
        return new Rational(den,num);
    }

    //return this/that
    public Rational divides(Rational that){
        return this.times(that.reciprocal());
    }

    //test client
    public static void main(String[] args){
        Rational x,y,z;

        // 1/2 + 1/3 = 5/6
        x = new Rational(1, 2);
        y = new Rational(1, 3);
        z = x.plus(y);
        StdOut.println(z);

        // 8/9 + 1/9 = 1
        x = new Rational(8, 9);
        y = new Rational(1, 9);
        z = x.plus(y);
        StdOut.println(z);

        // 1/200000000 + 1/300000000 = 1/120000000
        x = new Rational(1, 200000000);
        y = new Rational(1, 300000000);
        z = x.plus(y);
        StdOut.println(z);

        // 1073741789/20 + 1073741789/30 = 1073741789/12
        x = new Rational(1073741789, 20);
        y = new Rational(1073741789, 30);
        z = x.plus(y);
        StdOut.println(z);

        //  4/17 * 17/4 = 1
        x = new Rational(4, 17);
        y = new Rational(17, 4);
        z = x.times(y);
        StdOut.println(z);

        // 3037141/3247033 * 3037547/3246599 = 841/961
        x = new Rational(3037141, 3247033);
        y = new Rational(3037547, 3246599);
        z = x.times(y);
        StdOut.println(z);

        // 1/6 - -4/-8 = -1/3
        x = new Rational(1, 6);
        y = new Rational(-4, -8);
        z = x.minus(y);
        StdOut.println(z);

    }











}