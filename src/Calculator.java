//Making Calculator using the switch statement
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        int number1 = scanner.nextInt();

        System.out.println("Enter second number");
        int number2 = scanner.nextInt();

        System.out.println("Enter Operator");
        char operator = scanner.next().charAt(0);

        double ans ;

        switch (operator){
        case '+':
        ans = number1 + number2;
            System.out.println(ans);
        break;

        case '-':
        ans = number1 - number2;
        System.out.println( ans);
        break;

        case '*':
        ans=number1 * number2;
        System.out.println(ans);
        break;

        case '/':
        ans = number1 / number2;
        System.out.println(ans);
        break;

        default: System.out.println("Invalid");
        break;
        }

}
}
