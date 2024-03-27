//Java Program to Print Multiplication Table for any Number from 1 to 12

import java.util.Scanner;

public class Multiplication {

    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number from 1 to 12");
    int num = scanner.nextInt();
    int ans;



    if (num>=1 && num<=12){                                     //created if else as wanted to display not accepting anything apart from 1 to 12
        for (int i = 1; i<=12; i++) {
    ans= num*i;                                                 //num is what the user will enter and i is changing based on for loop so that formula
    System.out.println( num +" * "+i + " = "+ ans);
        }

    }
    else {System.out.println("Enter a valid number");           //anythign apart from 1 to 12 is not accepted

    }


 }
}





