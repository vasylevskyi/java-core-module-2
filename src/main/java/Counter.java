package main.java;

/*
Module 2 Task 17
*/
public class Counter {
   // public long current(long number). Повертає це ж число.
   public long current(long number) {
       return number;
   }
   // public long next(long number). Повертає наступне число. Обов'язково використовуй оператор ++. Інші математичні оператори не використовуй.
   public long next(long number) {
       return ++number;
   }
   // public long prev(long number). Повертає попереднє число. Обов'язково використовуй оператор --. Інші математичні оператори не використовуй.
   public long prev(long number) {
       return --number;
   }

    public static void main(String[] args) {
        Counter varAll = new Counter();

        System.out.println("current = " + varAll.current(5l));
        System.out.println("next = " + varAll.next(5l));
        System.out.println("prev = " + varAll.prev(5l));
    }
}

