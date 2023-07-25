package main.java;

/*
Module 2 Task 24
*/

//Напиши клас ProfShop, у якого будуть наступні методи:
//
//public boolean isPriceOk(int price). Чи допустима ціна товару. Ціна вважаються допустимими у всіх випадках, крім числа 1000;
//public float calculateRegularDiscountPrice(float price). Повертається 90% від ціни товару. Результат не округляється;
//public boolean isDiscount50(int price). Чи треба давати на цей товар 50% знижки. 50% знижки дається у тому випадку, якщо 4 одиниці товару коштують 1000 одиниць грошей;
//public boolean isPriceHappy(int price, int year, int day). Чи щаслива ціна. Якщо ціна товару дорівнює добутку поточного року та дати - значить, ціна щаслива. Таки товари дуже активно розкуповують, вони приносять щастя.
//        isPriceOk(1500) повертає true
//        calculateRegularDiscountPrice(1500) повертає 1350
//        isDiscount50(256) повертає false
//        isPriceHappy(23700, 3950, 6) повертає true

public class ProfShop {
    boolean isPriceOk(int price) {
        return price != 1000;

    }
    public float calculateRegularDiscountPrice(float price) {
        return price * 0.9f;

    }
    public boolean isDiscount50(int price) {
        return price * 4 == 1000;

    }
    public boolean isPriceHappy(int price, int year, int day) {
        return price == (year * day);
    }

    public static void main(String[] args) {
        ProfShop comparePrice = new ProfShop();

        System.out.println("isPriceOk = " + comparePrice.isPriceOk(1500));
        System.out.println("calculateRegularDiscountPrice = " + comparePrice.calculateRegularDiscountPrice(1500f));
        System.out.println("isDiscount50 = " + comparePrice.isDiscount50(256));
        System.out.println("isPriceHappy = " + comparePrice.isPriceHappy(23700, 3950, 6));


    }

}
