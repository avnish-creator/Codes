//                                          * MY SOLUTION *
import java.util.Scanner;

public class SumOfOddAndEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evensum = 0;
        int oddsum = 0;

        System.out.println("Enter the count of numbers which you will enter: ");
        int totalnum = sc.nextInt();

        for (int i = 1; i <= totalnum; i++) {
            System.out.print("Enter a number = ");
            int a = sc.nextInt();

            if(a%2==0){
                evensum += a;
            }else{
                oddsum += a;
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Sum of Even numbers: "+evensum);
        System.out.println("Sum of Odd numbers: "+oddsum);
        
        sc.close();
    }
}


//                                          * SOLUTION BY APNI KAKSHA *

// import java.util.Scanner;
// public class SumOfOddAndEvenNumbers {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int number;
// int choice;
// int evenSum = 0;
// int oddSum = 0;
// do {
// System.out.print("Enter the number ");
// number = sc.nextInt();
// if( number % 2 == 0) {
// evenSum += number;
// } else {
// oddSum += number;
// }
// System.out.print("Do you want to continue? Press 1 for yes or 0 for no");
// choice = sc.nextInt();
// } while(choice==1);
// System.out.println("Sum of even numbers: " + evenSum);
// System.out.println("Sum of odd numbers: " + oddSum);
// }
// }