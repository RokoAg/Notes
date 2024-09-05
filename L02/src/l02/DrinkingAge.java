/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l02;

import java.util.Scanner;

/**
 * This program will tell you if you're old enough to drink, depending on where
 * you live in Canada.
 *
 * @author Rakhuzhuwo Sapruna (A00455075)
 */
public class DrinkingAge {

    public static void main(String[] args) {
        // declaring variable
        Scanner kbd = new Scanner(System.in);
        int age;
        String ans;
        boolean veryYoung;

        //starting prompt
        System.out.println("------------------------------------------"
                + "--------");
        System.out.println("This program will tell you if you're old enough\n"
                + "to drink, depending on where you live in Canada.");
        System.out.println("---------------------------------------------" + ""
                + "-----");

        //Asking user for the age
        System.out.println();
        System.out.print("How old are you? ");
        age = kbd.nextInt();
        veryYoung = (age < 16);

        //check if the user's age is less than 16 
        if (veryYoung) {
            System.out.println("\nWow, and you're already at the University! "
                    + "Good for you!!");
        }
        //PROMPT TO ASK IF THE USER IS FROM Quebec, Manitoba, or Alberta?
        System.out.println();
        System.out.print("Do you live in Quebec, Manitoba, or Alberta? ");
        ans = kbd.next().toLowerCase();
        System.out.println();
        if (ans.equals("yes")) {
            System.out.println("\nYou're one of those lucky ones who "
                    + "live there!");
        }
        //Check if legal
        if (age > 18) {
            System.out.println("You are of legal drinking age! Congrats!");

        } else if (age == 18 && ans.contains("yes")) {
            System.out.println("You are of legal drinking age!"
                    + " Congrats!");
        } else {
            System.out.println("But unfortunately, you are still"
                    + " not old enough to drink... :(");
        }
    }

}//end class DrinkingAge
