package a08;

import java.util.Arrays;
import java.util.Scanner;

/**
 * The driver program to test MonthlyPrecipitation class.
 *
 * @author Somayeh Kafaie (A00000000)
 */
public class PrecipitationDriver {

    public static final Scanner KBD = new Scanner(System.in);

    public static void main(String[] args) {
        //Extracted from https://halifax.weatherstats.ca/charts/precipitation-daily.html
        double[] pctDec = new double[]{20.9, 0, 11.9, 5.1, 0, 0, 2.7, 30.5,
            11.5, 0, 0, 0, 0, 0, 0, 0.2, 28.9, 1.4, 1.7, 0.4, 0, 0, 21.2,
            0.2, 0, 0, 0, 0, 0, 0, 6.4};
        double[] pctJan = new double[]{14.2, 0, 0.4, 3.6, 3.4, 1.1, 3.5, 0,
            2.7, 2.5, 0.2, 0, 13.6, 21.8, 20.9, 24.7, 1.1, 0.2, 0.2, 8.8,
            2.9, 0.6, 50.3, 0.3, Double.NaN, 32.6, 0.2, 0, 4.0, 3.3, 6.9};
        double[] pctFeb = new double[]{0, 0, 2.8, 0, 0.9, 0, 0, 0, 0, 10.7,
            0, 0, 5.6, 0.9, 3.2, 0., 8.7, 1.1, 0, 33.3, 0, 0, 0, 4.5,
            0, 0, 0, 0};
        double[] pctMarch = new double[]{1.3, 9.3, 2.8, 0, 0, 0.7, Double.NaN,
            0, 0.5, 0, 0, 0, 0, 15.4, 18.8, 2.4, 0, 1.6, 0.2, 0, 0.2};

        // Constructors
        MonthlyPrecipitation mDecember = new MonthlyPrecipitation("December",
                pctDec);
        MonthlyPrecipitation mJanuary = new MonthlyPrecipitation("Janary",
                Arrays.copyOf(pctJan, 20));
        MonthlyPrecipitation mFebruary = new MonthlyPrecipitation("February",
                pctFeb);
        MonthlyPrecipitation mMarch = new MonthlyPrecipitation("march");

        int maxDays = MonthlyPrecipitation.DEF_NUM_DAYS;
        //  get name
        System.out.println("\nMonthlyPrecipitation Names:");
        System.out.println(mDecember.getMonthName() + ", "
                + mJanuary.getMonthName() + ", "
                + mFebruary.getMonthName() + ", " + mMarch.getMonthName());
        pause();

        // changing a name
        mJanuary.setMonthName("January");
        mMarch.setMonthName("March");
        System.out.println("\nMonthlyPrecipitation Names:");
        System.out.println(mDecember.getMonthName() + ", "
                + mJanuary.getMonthName() + ", "
                + mFebruary.getMonthName() + ", " + mMarch.getMonthName());
        pause();

        //printing precipitation amount
        System.out.println("\nPrecipitation for some random days: ");
        System.out.println("Dec 2nd: " + mDecember.getPctVal(2));
        System.out.println("Dec 31st: " + mDecember.getPctVal(31));
        System.out.println("Jan 20th: " + mJanuary.getPctVal(20));
        System.out.println("Jan 26th: " + mJanuary.getPctVal(26));
        System.out.println("Feb 17th: " + mFebruary.getPctVal(17));
        System.out.println("Feb 30th: " + mFebruary.getPctVal(30));
        System.out.println("March 10th: " + mMarch.getPctVal(10));
        System.out.println("March -10th: " + mMarch.getPctVal(-10));
        System.out.println("March 32th: " + mMarch.getPctVal(32));
        pause();

        // setter for precipitation
        mDecember.setPctVal(-2, -5);
        for (int i = 21; i <= pctJan.length; i++) {
            mJanuary.setPctVal(i, pctJan[i - 1]);
        }
        mFebruary.setPctVal(32, 12.5);
        for (int i = 1; i <= pctMarch.length; i++) {
            mMarch.setPctVal(i, pctMarch[i - 1]);
        }
        pause();

        //Testing getPctVals
        double[] copy = mJanuary.getPctVals();
        copy[0] = -1000000;
        
        //Calculating Monthly average
        System.out.println("\nThe monthly average precipitation:");
        System.out.println("December: " + mDecember.getMonthlyAverage() + " mm");
        System.out.println("January: " + mJanuary.getMonthlyAverage() + " mm");
        System.out.println("February: "+mFebruary.getMonthlyAverage()+" mm");
        System.out.println("March: "+mMarch.getMonthlyAverage()+" mm");
        pause();

        //Find the wettest day
//        System.out.println("\nFinding the wettest day in each month: ");
//        System.out.println("December "+mDecember.getWettestDayNumber());
//        System.out.println("January "+mJanuary.getWettestDayNumber());
//        System.out.println("Februray "+mFebruary.getWettestDayNumber());
//        System.out.println("March "+mMarch.getWettestDayNumber());
//        pause();

        //toString
        System.out.println("\nDisplaying info:");
        System.out.println("=================================================");
        System.out.println(mDecember);
        System.out.println("=================================================");
        System.out.println(mJanuary);
        System.out.println("=================================================");
        System.out.println(mFebruary);
        System.out.println("=================================================");
        System.out.println(mMarch);
    }

    private static void pause() {
        System.out.print("\n...press enter...");
        KBD.nextLine();
    }

}
