package com.menu;
import java.util.Scanner;
import java.math.BigInteger;


public class menu {
    public static void main(String[] args){
        /* The base info */
        String name = "Omar";
        BigInteger nationalNumber = new BigInteger("30236099654");

        /* collecting name */
        Scanner userName = new Scanner(System.in);
        System.out.println("Your name: ");
        String username = userName.nextLine();

        /* collecting ID number */

        Scanner userNum = new Scanner(System.in);
        System.out.println("Your national number: ");
        BigInteger usernum = userNum.nextBigInteger();



        /* The starter message */

        System.out.println("The candidates are: Bashar al-Assad(1), Yaman al-Najjar(2), Hassan Gemayel(3)");

        /* Asking */

        Scanner theCand = new Scanner(System.in);
        System.out.println("Select the candidate number you wish to select: ");
        int theWC = theCand.nextInt();


        /* Analyzing the data */

        String theMessage = switch (theWC){
            case 1 -> "You support Bashar al-Assad";
            case 2 -> "You support Yaman al-Najjar";
            case 3 -> "You support Hassan Gemayel";
            default -> "please make sure you have selected one person";
        };

        /* Sending the message */


        System.out.println("Your national number is " + usernum + " and " + theMessage);


    }
}
