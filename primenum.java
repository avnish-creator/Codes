import java.util.Scanner;

public class primenum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int inputnum = sc.nextInt();
        
        boolean x = true;
        for (int i = 2; i <= inputnum-1; i++) {
            if(inputnum%2==0){
                x = false;
            }
            
        }
        if (x==true) {
            System.out.println("It is a prime number.");
            
        } 
            else {
                System.out.println("It is not a prime number.");
            
        }sc.close();
    }
}