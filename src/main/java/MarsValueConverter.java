package main.java;

/*
Module 2 Task 36
*/

//public int changeMoneyAmount(float startAmount, float toRemove). Метод повертає різницю startAmount и toRemove;
//public byte calculateMoneySum(int sum1, int sum2). Метод повертає суму sum1 та sum2;
//public short halfOfMoney(double startMoney). Метод повертає половину від startMoney
//        changeMoneyAmount(100f, 40.5f) повертає 59
//        calculateMoneySum(50, 40) повертає 90
//        halfOfMoney(1000.9999) повертає 500
public class MarsValueConverter {
    public int changeMoneyAmount(float startAmount, float toRemove) {
        return (int) (startAmount - toRemove);
    }
    public byte calculateMoneySum(int sum1, int sum2) {
        return (byte) (sum1 + sum2);
    }
    public short halfOfMoney(double startMoney) {
        return (short) (startMoney / 2);
    }

    public static void main(String[] args) {
        MarsValueConverter varConverter = new MarsValueConverter();

        System.out.println("changeMoneyAmount = " + varConverter.changeMoneyAmount(100f, 40.5f));
        System.out.println("calculateMoneySum = " + varConverter.calculateMoneySum(50, 40));
        System.out.println("halfOfMoney = " + varConverter.halfOfMoney(1000.9999));
    }

}
