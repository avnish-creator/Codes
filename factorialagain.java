import java.util.Scanner;

public class factorialagain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();                           // To store the number for factorial
        int b = 1;                                      // To initialize the factorial

        for (int i = 1; i <= a; i++) {
            b *=i;
            
        }
        System.out.println("Factorial of the number is "+b);
        sc.close();
    }
}
