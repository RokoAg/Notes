package l08;

import java.util.Scanner;

/**
 *
 * @author Rakhuzhuwo Sapruna
 */
public class n {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kbd = new Scanner(System.in);
        int n = 0; //this should be from user
        int a[] = new int[n];
        double b[] = new double[n];
        String str[] = new String[n];

        System.out.print("How many array elements do you want to create? ");
        n = kbd.nextInt();

        System.out.println("Enter " + n + " integers: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = kbd.nextInt();
            str[i] = kbd.nextLine();
            System.out.println(i + ": " + a[i]);
        }

        System.out.println("Integers you entered: ");
        for (int i = 1; i <= a.length; i++) {
            System.out.println(i + ": " + a[i]);
        }
        System.out.println("Enter " + n + " doubles: ");
        for (int i = 1; i <= b.length; i++) {
            b[i] = kbd.nextInt();
            str[i] = kbd.nextLine();
            System.out.println(i + ": " + a[i]);
        }
    }
}

        // Variables
        Scanner kbd = new Scanner(System.in);
        int size, count = 1, word;
        double total;

        System.out.print("How many array elements do you want to create? ");
        size = kbd.nextInt();
        kbd.nextLine();
        int[] intArray = new int[size];
        double[] doubleArray = new double[size];
        String[] stringArray = new String[size];

        System.out.println();

        //integer
        System.out.printf("Enter %d integers: ", size);
        for (int i = 0; i < size; i++) {
            intArray[i] = kbd.nextInt();
        }

        System.out.println();

        for (int i = 0; i < size; i++) {
            System.out.printf("%d: %d", count, intArray[i]);
            System.out.println();
            count += 1;
        }

        System.out.println();

        //double
        System.out.printf("Enter %d doubles: ", size);
        for (int i = 0; i < size; i++) {
            doubleArray[i] = kbd.nextDouble();
        }

        System.out.println();

        count = 1;
        for (int i = 0; i < size; i++) {
            System.out.printf("%d: %f", count, doubleArray[i]);
            System.out.println();
            count += 1;
        }

        System.out.println();

        count = 1;
        System.out.println("====== int array x double array ======");
        for (int i = 0; i < size; i++) {
            total = intArray[i] * doubleArray[i];
            System.out.printf("%d: %d * %f = %f", count, intArray[i],
                    doubleArray[i], total);
            System.out.println();
            count += 1;
        }
        count = 1;

        System.out.println();
        System.out.println("======================================");
        System.out.printf("Enter %d words: ", size);
        for (int i = 0; i < size; i++) {
            stringArray[i] = kbd.next();
        }
        System.out.println();
        System.out.println("You entered:");
        for (int i = 0; i < size; i++) {
            System.out.printf("%d: %s", count, stringArray[i]);
            System.out.println();
            count += 1;
        }

        System.out.println();

        System.out.printf("Which word do you want to use (1 to %d): ", size);
        word = kbd.nextInt();
        while (!(1 > word || word <= size)) {
            System.out.print("Your selection is out of range. " +
                    "Please enter another number: ");
            word = kbd.nextInt();
        }

        System.out.println();

        System.out.println("Now I will print \""+ stringArray[word - 1] + "\" "
        + intArray[word - 1] + " times below:");

        System.out.println();

        System.out.print(stringArray[word- 1].repeat(intArray[word - 1]));


    }
}      