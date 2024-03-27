//WAP to enter any String and count total number of 'a' in that String.

import java.util.Scanner;

public class Count_A {


public static void main (String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a sentence");
    String line = scanner.nextLine();
    int total = 0;


    for (int i = 0; i <line.length();i ++) { //will go to each letter and line

        if (line.charAt(i)=='a' || line.charAt(i)=='A') {          //char in a line and the char alpha which we looking for
            total++;

        }
    }System.out.println(total);

}
}