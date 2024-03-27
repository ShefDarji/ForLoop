import java.util.Scanner;
//Display Sum of n Natural Number

public class Sum {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = scanner.nextInt();

        int ans = 0;
        //     int a = num*(num+1)/2;                        // can run using this formula

        for (int i=1; i<=num; i++){

            ans = ans+i;                                   // can get same ans using this as well as i is increasing the value


        }
        System.out.println("Sum of numbers is " + ans);
    }

}
