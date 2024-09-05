package a05;

import java.util.Scanner;

/**
 * A program to test your MoreMath class.
 *
 * @author Somayeh Kafaie(A00000000)
 */
public class A05 {

    public static void main(String[] args) {
        // create variables
        Scanner kbd = new Scanner(System.in);

        // introduce yourself
        printIntroduction();

        // the log2 function
        showLog2(1);
        showLog2(4);
        showLog2(Math.pow(2, 3.5));
        showLog2(1000);
        System.out.println();

        // the randomInt function
        showRandomInt(6);
        showRandomInt(6);
        showRandomInt(10);
        showRandomInt(12);
        showRandomInt(20);
        showRandomInt(1000);
        System.out.println();

        // the factorial function
        showFactorial(1);
        showFactorial(5);
        showFactorial(10);
        showFactorial(-3);
        System.out.println();

        // the fibonacci function
        showFibonacciSum(1);
        showFibonacciSum(-1);
        showFibonacciSum(5);
        showFibonacciSum(2);
        showFibonacciSum(10);
        showFibonacciSum(20);
        showFibonacciSum(34);

        System.out.println();
    }

    /**
     * Print the introduction for this program, including the author information
     * for the MoreMath utility class.
     */
    private static void printIntroduction() {
        System.out.print("\n"
                + "More Math Functions\n"
                + "-------------------\n\n"
                + "by Somayeh Kafaie (A00000000)\n\n"
                + "This program tests the methods in MoreMath\n"
                + "written by " + MoreMath.authorName()
                + " (" + MoreMath.authorNumber() + ")\n\n"
                + "CSCI 1226 -- Winter 2023\n"
                + "Assignment A05\n\n");
    }

    /**
     * Print the log2 expression and its value.
     *
     * @param n the number to calculate log of.
     */
    private static void showLog2(double n) {
        System.out.println("MoreMath.log2(" + n + ") == " + MoreMath.log2(n));
    }

    /**
     * Print the randomInt expression and its value.
     *
     * @param n the upper bound of the random integer.
     */
    private static void showRandomInt(int n) {
        System.out.println("MoreMath.randomInt(" + n + ") == "
                + MoreMath.randomInt(n));
    }

    /**
     * Print the factorial expression and its value.
     *
     * @param n the number to calculate factorial of.
     */
    private static void showFactorial(int n) {
        System.out.println("MoreMath.factorial(" + n + ") == "
                + MoreMath.factorial(n));
    }

    /**
     * Print the sum of a sequence of Fibonacci numbers.
     *
     * @param count the number of requested Fibonacci numbers
     */
    private static void showFibonacciSum(int count) {
        System.out.println("MoreMath.FibonacciSum(" + count + ") == "
                + MoreMath.fibonacciSum(count));
    }

}
