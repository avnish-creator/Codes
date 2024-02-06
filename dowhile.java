import java.util.Scanner;
public class dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of statements you want 'Hello world to be printed': " );
        int a = sc.nextInt();
        int n=1;

        do{
            System.out.println("Hello World");
            n++;
        }while(n<=a);
        sc.close();
    }
}
