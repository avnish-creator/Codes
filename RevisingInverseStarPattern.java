import java.util.Scanner;

public class RevisingInverseStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a-i+1; j++) {
                System.out.print("*");
                
            }
            System.out.println("");
            
        }
        sc.close();
    }
}
