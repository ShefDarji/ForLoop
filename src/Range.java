//Print any 10 numbers between given/user input range. For eg. Print numbers between 23-33

import java.util.Random;
import java.util.Scanner;

public class Range {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Starting number");
        int num = scanner.nextInt();


        int number = num + 10;                                   //as we need a range so num which is entered that plus 10

        for (int i = num; i <=number; i++){

        System.out.println(i);

        }

}
}
