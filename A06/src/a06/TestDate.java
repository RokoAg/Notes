package a06;

import java.util.Scanner;

/**
 * A program to test the Date data type class.
 *
 * DO NOT MODIFY THE CODE IN THIS FILE.
 *
 * You may delete the lines labeled "DELETE THIS LIEN when ...",
 * but should only do so when you have created all the required methods.
 *
 * @author Mark Young (A00000000)
 */
public class TestDate {

    // there should only be one Scanner connected to System.in
    private static final Scanner KBD = new Scanner(System.in);

    public static void main(String[] args) {
        // create required variables
        int year, month, day, bigDay;
        Date date1, date2;

        // print program title
        System.out.println("Tests for the Date class\n"
                         + "------------------------\n");

/* DELETE THIS LINE when you have a constructor and getters
        // test getters (with constructor for "normal" dates
        System.out.println("Testing Getters:");
        date1 = new Date(2001, 1, 1);
        date2 = new Date(1932, 3, 17);
        testInt("(2001, 1, 1) year should be ", 2001, date1.getYear());
        testInt("(2001, 1, 1) month should be ", 1, date1.getMonth());
        testInt("(2001, 1, 1) day should be ", 1, date1.getDay());
        testInt("(1932, 3, 17) year should be ", 1932, date2.getYear());
        testInt("(1932, 3, 17) month should be ", 3, date2.getMonth());
        testInt("(1932, 3, 17) day should be ", 17, date2.getDay());
        pause();

        // test constructor for weird dates
        System.out.println("Testing Constructor:");
        date2 = new Date(2016, 0, 10);
        testInt("(2016, 0, 10) year should be ", 2001, date2.getYear());
        testInt("(2016, 0, 10) month should be ", 1, date2.getMonth());
        testInt("(2016, 0, 10) day should be ", 1, date2.getDay());
        date2 = new Date(2018, 13, 10);
        testInt("(2018, 13, 10) year should be ", 2001, date2.getYear());
        testInt("(2018, 13, 10) month should be ", 1, date2.getMonth());
        testInt("(2018, 13, 10) day should be ", 1, date2.getDay());
        date2 = new Date(2017, 3, 0);
        testInt("(2017, 3, 0) year should be ", 2001, date2.getYear());
        testInt("(2017, 3, 0) month should be ", 1, date2.getMonth());
        testInt("(2017, 3, 0) day should be ", 1, date2.getDay());
        date2 = new Date(2013, 3, 32);
        testInt("(2013, 3, 32) year should be ", 2001, date2.getYear());
        testInt("(2013, 3, 32) month should be ", 1, date2.getMonth());
        testInt("(2013, 3, 32) day should be ", 1, date2.getDay());
        date2 = new Date(2011, 2, 29);
        testInt("(2011, 2, 29) year should be ", 2001, date2.getYear());
        testInt("(2011, 2, 29) month should be ", 1, date2.getMonth());
        testInt("(2011, 2, 29) day should be ", 1, date2.getDay());
        date2 = new Date(2012, 2, 29);
        testInt("(2012, 2, 29) year should be ", 2012, date2.getYear());
        testInt("(2012, 2, 29) month should be ", 2, date2.getMonth());
        testInt("(2012, 2, 29) day should be ", 29, date2.getDay());
        pause();

/* DELETE THIS LINE when you have setters
        // test setYear
        System.out.println("Testing year setter");
        year = 2010;
        date1.setYear(year);
        testInt("(2010, 1, 1) year should be ", year, date1.getYear());
        year = 1066;
        date1.setYear(year);
        testInt("(1066, 1, 1) year should be ", year, date1.getYear());
        year = -4004;
        date1.setYear(year);
        testInt("(-4004, 1, 1) year should be ", year, date1.getYear());
        date1.setYear(1000);
        pause();

        // test setMonth
        System.out.println("Testing month setter");
        month = 6;
        date1.setMonth(month);
        testInt("(1000, 6, 1) month should be ", month, date1.getMonth());
        date1.setMonth(0);
        testInt("(1000, 0, 1) month should be ", month, date1.getMonth());
        date1.setMonth(13);
        testInt("(1000, 13, 1) month should be ", month, date1.getMonth());
        date1.setMonth(month);
        pause();

        // test setDay
        System.out.println("Testing day setter");
        day = 17;
        date1.setDay(day);
        testInt("(1000, 6, 17) day should be ", day, date1.getDay());
        date1.setDay(32);
        testInt("(1000, 6, 32) day should be ", day, date1.getDay());
        date1.setDay(0);
        testInt("(1000, 6, 0) day should be ", day, date1.getDay());
        date1.setDay(day);
        day = 17;
        bigDay = 31;
        date1.setDay(day);
        date1.setMonth(1);  // January has 31 days
        date1.setDay(bigDay);
        testInt("(1000, 1, 31) day should be ", bigDay, date1.getDay());
        date1.setDay(day);
        date1.setMonth(4);  // April has only 30 days
        date1.setDay(bigDay);
        testInt("(1000, 4, 31) day should be ", day, date1.getDay());
        date1.setDay(day);
        bigDay = 30;
        date1.setDay(bigDay);
        testInt("(1000, 4, 30) day should be ", bigDay, date1.getDay());
        date1.setDay(day);
        date1.setYear(2010);    // not a leap year
        date1.setMonth(2);      // Feb has 28 days
        bigDay = 29;
        date1.setDay(bigDay);
        testInt("(2010, 2, 29) day should be ", day, date1.getDay());
        date1.setDay(day);
        date1.setYear(2040);    // leap year
        date1.setMonth(2);      // Feb has 29 days
        date1.setDay(bigDay);
        testInt("(2040, 2, 29) day should be ", bigDay, date1.getDay());
        pause();

        // test set
        System.out.println("Testing triple setter");
        year = 1961;
        month = 4;
        day = 16;
        date1.set(year, month, day);
        testInt("(1961, 4, 16) year should be ", year, date1.getYear());
        testInt("(1961, 4, 16) month should be ", month, date1.getMonth());
        testInt("(1961, 4, 16) day should be ", day, date1.getDay());
        date1.set(year, 13, day);
        testInt("(1961, 13, 16) year should be ", year, date1.getYear());
        testInt("(1961, 13, 16) month should be ", month, date1.getMonth());
        testInt("(1961, 13, 16) day should be ", day, date1.getDay());
        date1.set(year, month, -7);
        testInt("(1961, 4, -7) year should be ", year, date1.getYear());
        testInt("(1961, 4, -7) month should be ", month, date1.getMonth());
        testInt("(1961, 4, -7) day should be ", day, date1.getDay());
        date1.set(year, month, day);
        pause();

/* DELETE THIS LINE when you have daysThisMonth
        // Test daysThisMonth
        System.out.println("Testing days this month");
        int[] normalDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int m = 1; m <= 12; m++) {
            date1.setMonth(m);
            testInt("(1961, " + m + ", 16) number of days should be ", 
                    normalDays[m], date1.daysThisMonth());
        }
        date1.setYear(4);
        date1.setMonth(2);
        testInt("(4, 2, 16) number of days should be ", 
                29, date1.daysThisMonth());
        pause();

/* DELETE THIS LINE when you have isLeapYear
        // test isLeapYear
        System.out.println("Testing leap years");
        date1.setYear(40);
        testBoolean("isLeapYear(40) should be ", true, date1.isLeapYear());
        date1.setYear(800);
        testBoolean("isLeapYear(800) should be ", true, date1.isLeapYear());
        date1.setYear(123);
        testBoolean("isLeapYear(123) should be ", false, date1.isLeapYear());
        date1.setYear(1700);
        testBoolean("isLeapYear(1700) should be ", false, date1.isLeapYear());
        pause();

/* DELETE THIS LINE (and one below) when you have toString
        // test toString
        System.out.println("Testing toString");
        year = 2010;
        month = 12;
        day = 25;
        date1.set(year, month, day);
        String myString = String.format("%4d-%02d-%02d", year, month, day);
        testString("(2010, 12, 25) should be ", myString, date1.toString());
        month = 6;
        date1.set(year, month, day);
        myString = String.format("%4d-%02d-%02d", year, month, day);
        testString("(2010, 06, 25) should be ", myString, date1.toString());
        month = 10;
        day = 9;
        date1.set(year, month, day);
        myString = String.format("%4d-%02d-%02d", year, month, day);
        testString("(2010, 10, 09) should be ", myString, date1.toString());
        pause();
DELETE THIS LINE when you have toString */
    }

    private static void pause() {
        System.out.println();
        System.out.println("If there are any FAIL messages above ...");
        System.out.println("... then end the program and fix your mistakes.");
        System.out.print("... otherwise, press enter...");
        KBD.nextLine();
        System.out.println();
    }

    private static void testInt(String s, int should, int is) {
        if (should != is) {
            System.out.println(s + should + ", is " + is + " -- FAIL");
        }
    }

    private static void testBoolean(String s, boolean should, boolean is) { 
        if (should != is) {
            System.out.println(s + should + ", is " + is + " -- FAIL");
        }
    }

    private static void testString(String s, String should, String is) { 
        if (!should.equals(is)) {
            System.out.println(s + should + ", is " + is + " -- FAIL");
        }
    }

}

