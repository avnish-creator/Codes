import java.util.Scanner;

public class StarPatternRevision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {     // replace (j <= i with j <= a) to make the pattern form square.
                System.out.print("*");
                
            }
            System.out.println("");
        }
        sc.close();
    }
}
