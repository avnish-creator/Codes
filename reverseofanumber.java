import java.util.Scanner;
public class reverseofanumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse the digits of it: ");
        int a = sc.nextInt();

        while(a>0){
            int lastdigit = a%10;
            System.out.print(lastdigit+ "");
            a=a/10;
        }
        sc.close();
    }
}
