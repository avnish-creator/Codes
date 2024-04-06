import java.util.*;
public class primechecker2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        boolean x = true;
        for(int i = 2; i<=Math.sqrt(a); i++){
            if(a%i==0){
                x = false;
            }
        }
        if(x==true){
            System.out.println(a+" is prime");
        }
        else{
            System.out.println(a+" is not prime");
        }sc.close();
    }
    
}
