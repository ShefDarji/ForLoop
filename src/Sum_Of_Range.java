import java.util.Scanner;
//write a program that prints the sum of x ranging from 1 to 20.

public class Sum_Of_Range {                                        //using same concept as sum class

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = scanner.nextInt();

        int ans = 0;
        //     int a = num*(num+1)/2;                        // can run using this formula

        for (int i=1; i<=num; i++){
            ans = ans+i;                                    // can get same ans using this as well as i is increasing the value
        }

        if (num>=1 && num<=20){                             //num should be from 1 to 20 only

            System.out.println("Sum of numbers is " + ans);
        }
        else {

            System.out.println("Enter a valid number" );
        }
    }

}

