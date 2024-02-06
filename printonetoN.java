import java.util.Scanner;
public class printonetoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto which you want the count to be done: ");
        int totalnum = sc.nextInt();

        int loop1 = 0;
        while(loop1<=totalnum){
            System.out.print(loop1+" ");
            loop1++;

            sc.close();
        }
    }
}
