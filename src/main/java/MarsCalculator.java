package main.java;

/*
Module 2 Task 14
*/

public class MarsCalculator {

    public int sum(int a, int b, int c) {
        return a + b + c;
    }
    public int sub(int a, int b, int c) {
        return a - (b + c);
    }
    public int multiply(int a, int b, int c) {
        return sum(a, b, c) * sub(a, b, c);
    }
    public float divide(int a, int b, int c) {
        return sum(a, b, c) / 10f;
    }


    public static void main(String[] args) {
        int varA = 1;
        int varB = 2;
        int varC = 3;

        MarsCalculator marsCalculator = new MarsCalculator();

        System.out.println("sum = " + marsCalculator.sum(varA, varB, varC));
        System.out.println("sub = " + marsCalculator.sub(varA, varB, varC));
        System.out.println("multiply = " + marsCalculator.multiply(varA, varB, varC));
        System.out.println("divide = " + marsCalculator.divide(varA, varB, varC));

    }
}
