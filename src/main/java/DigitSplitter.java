package main.java;

/*
Module 2 Task 27
*/

//Напиши клас з ім'ям DigitSplitter. У класа мають бути такі методи:
//
//public int getFirstDigit(int number). Цей метод повертає першу цифру переданого числа
//public int getSecondDigit(int number). Цей метод повертає другу цифру переданого числа
//        виклик getFirstDigit(15) повертає 1
//        виклик getSecondDigit(15) повертає 5
public class DigitSplitter {
    public int getFirstDigit(int number){
        return (int) number / 10;
    }
    public int getSecondDigit(int number){
        return (int) number % 10;
    }

    public static void main(String[] args) {
        DigitSplitter getDigit = new DigitSplitter();

        System.out.println("first digit = " + getDigit.getFirstDigit(15));
        System.out.println("second digit = " + getDigit.getSecondDigit(15));
    }

}
