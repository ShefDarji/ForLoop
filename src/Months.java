import java.util.Scanner;

//WAP to print month names with 1-12 – other invalid entry by using switch
public class Months {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a months number");

        int month = scanner.nextInt();


        switch (month) {
            case 1:
                System.out.println("Month 1 is January");
                break;
            case 2:
                System.out.println("It is February");
                break;
            case 3:
                System.out.println("It is March");
                break;
            case 4:
                System.out.println("It is April");
                break;
            case 5:
                System.out.println("It is May");
                break;
            case 6:
                System.out.println("It is June");
                break;
            case 7:
                System.out.println("It is July");
                break;
            case 8:
                System.out.println("It is August");
                break;
            case 9:
                System.out.println("It is September");
                break;
            case 10:
                System.out.println("It is October");
                break;
            case 11:
                System.out.println("It is November");
                break;
            case 12:
                System.out.println("It is December");
                break;
            default: System.out.println("Enter valid number");
                break;



        }}}
