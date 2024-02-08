import java.util.Scanner;

public class TableOfAnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for which you want the table: ");
        int num1 = sc.nextInt();

        for (int i = 1; i <=10; i++) {
            System.out.println(num1+" x "+i+ " = " +num1*i);
        }
        sc.close();
    }
}
