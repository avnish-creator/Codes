import java.util.Scanner;

public class InverseStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int num1 = sc.nextInt();

        for (int i = 1; i <= num1; i++) {
            System.out.println("");
            for (int j = 1; j <= num1-i+1; j++) {
                System.out.print("*");
                
            }

        }
        sc.close();
    }
}
