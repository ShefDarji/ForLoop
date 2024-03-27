import java.util.Scanner;
//Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number) – limitation is n


public class Fibonacci_Numbers {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");

        int number = scanner.nextInt();

        int first = 0;                       //fibonacci no. starts with zero
        int second = 1;                      //and starts with 1 so declared first two value for the formula of fibonacci to run



        for (int i =1; i<=number; i++) {
            int total = first + second;       //the last value entered is taken and the sum is taken to get next fibonacci number so using those formulas ahead
            first=second;
            second = total;


            System.out.println(total);


        }
    }

}
