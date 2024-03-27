//Write a program to calculate the sum of following series where n is input by user. (where n is a positive integer and input by user.) 1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n

import java.util.Scanner;

public class Series {

    public static void main(String[]args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number");
    int num = scanner.nextInt();

        double ans =0;



    for (int i = 1; i<=num; i++)   {
    ans = ans + 1.0/i;                      //instead of 1 we took 1.0 so that formula can run and show the answeer we looking for. with just 1 it is not increasing the value

        } System.out.println("Total is " + ans);


}
}
