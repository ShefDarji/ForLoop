import java.util.Scanner;

//WAP to print the numbers between 1 to 100 which can be divided by 3 and 5 separately
public class Division {

    public static void main(Count_A[]args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();


        if (num>2 && num<100){
            for (int i = 1; i <= num; i++) {

                if (i % 3 == 0 && num <= 100) {

                    System.out.println("When divide by 3--> " + i);

                }
            }

            System.out.println();

            for (int i = 1; i <= num; i++) {
                if (i % 5 == 0 && num <= 100) {

                    System.out.println("When divide by 5--> " + i);

                }
            }
        } else{
            System.out.println("Enter valid number");
        }

    }
}

