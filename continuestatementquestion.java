//Here, we have to display all the numbers entered by user except multiples of zero
import java.util.Scanner;
public class continuestatementquestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.print("Keep entering the number: ");
            int num1 = sc.nextInt();
            

            if(num1%10==0){
                System.out.println("Invalid Input");
                continue;
            }
            System.out.println("Returned number: "+num1);
            
        }
        while(true);
        
    }
}

