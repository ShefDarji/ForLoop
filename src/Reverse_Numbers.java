import java.util.Scanner;
//Reverse a number using for Loop


public class Reverse_Numbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any 5 digit number");
        int num = scanner.nextInt();

        int reverse = 0;                                //declared and initialized so can use it in formula

       for (int i = 0; i <num; i++){

      reverse = (reverse*10) + (num%10);                    //formula to reverse the numbers
      num = num/10;



    }System.out.println("Reverse number is " + reverse);

}
}