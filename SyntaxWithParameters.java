import java.util.Scanner;

public class SyntaxWithParameters {
    public static void sumCalculator(int num1, int num2) {
       
        int sum = num1+num2;
        System.out.println("Sum of "+num1+" and "+num2+" is "+sum+".");
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        sc.close();
        sumCalculator(a,b);
    }
}
