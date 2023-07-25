package main.java;



//import com.sun.source.tree.BinaryTree;

//import java.time.Month;
//import java.util.Locale;

//import static java.lang.StringUTF16.charAt;

public class YearVariablesTask {

    public static void main(String[] args) {
        byte allMonthCountButNotWinter = 9;
        short february1996DayCount = 29;
        int halfOfTotalSpringDayCount = 46;
        long yearSecondCount = 31536000l;
        float quarterOfMayDayCount = Math.round(31f / 4 * 10) / 10f;
        double dayCountOfLongMonths = (double) 7 * 31;
        char springLetter = "April".charAt(2);
        boolean isLeap1900 = yearDays(1900);




        System.out.println("allMonthCountButNotWinter = " + allMonthCountButNotWinter);
        System.out.println("february1996DayCount = " + february1996DayCount);
        System.out.println("halfOfTotalSpringDayCount = " + halfOfTotalSpringDayCount);
        System.out.println("yearSecondCount = " + yearSecondCount);
        System.out.println("quarterOfMayDayCount = " + quarterOfMayDayCount);
        System.out.println("dayCountOfLongMonths = " + dayCountOfLongMonths);
        System.out.println("springLetter = " + springLetter);
        System.out.println("isLeap1900 = " + isLeap1900);

    }

    private static boolean yearDays(int year) {
        int res1 = year % 4;
        int res2 = year % 100;
        int res3 = year % 400;
        boolean days;

        if (res1 == 0) {
            if (res2 != 0) {
                boolean days1 = true;
                days = days1;
            } else if (res3 == 0) {
                boolean days1 = true;
                days = days1;
            } else {
                boolean days1 = false;
                days = days1;
            }
        } else {
            boolean days1 = false;
            days = days1;
        }
        return days;
    }

}