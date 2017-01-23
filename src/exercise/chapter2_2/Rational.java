package exercise.chapter2_2;

/**
 * Created by 94760 on 2017/1/23.
 */

import tools.StdIn;

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
public class Rational {
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


}
