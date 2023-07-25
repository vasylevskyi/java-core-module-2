package main.java;

public class BrokenKeyboardCalculator {
    public int add(int a, int b) {
        a += b;
        return a;
    }
    public int sub(int a, int b) {
        a -= b;
        return a;
    }
    public int multiply(int a, int b) {
        a *= b;
        return a;
    }
    public int divide(int a, int b) {
        a /= b;
        return a;
    }

    public static void main(String[] args) {
        BrokenKeyboardCalculator brokenCalculator = new BrokenKeyboardCalculator();

        System.out.println("brokenCalculator add = " + brokenCalculator.add(5 ,3));
        System.out.println("brokenCalculator sub = " + brokenCalculator.sub(8 ,7));
        System.out.println("brokenCalculator multiply = " + brokenCalculator.multiply(1 ,100));
        System.out.println("brokenCalculator divide = " + brokenCalculator.divide(8 ,4));

    }
}
