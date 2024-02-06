import java.util.Scanner;
public class Breakques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Keep entering a number, forget not to enter a number which is a multiple of 10: ");
            int num1 = sc.nextInt();
            if(num1%10 ==0){
                System.out.println("Number is a multiple of 10, break!");
                break;
            }
            System.out.println(num1);
        }while(true);
        sc.close();
    }
}
