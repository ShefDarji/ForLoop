import java.util.Scanner;

//Finding factorial of a number entered by user

public class Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = scanner.nextInt();

        int ans = 1;                        // declared and initialised the value cz loop needs a value to execute formula


        for (int i = 1; i <= number; i++) {
            ans = ans*i;

        }

        System.out.println("Factorial of the number entered is ---> " + ans);

    }
}
