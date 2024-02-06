import java.util.Scanner;
public class forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of times you want to print the input: ");
        int a = sc.nextInt();

        for(int i=1; i<=a; i++){
            System.out.println("Printed!");
        }
        sc.close();
    }
}
