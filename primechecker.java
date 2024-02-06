import java.util.Scanner;
public class primechecker{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for prime check: ");
        int primenum = sc.nextInt();

        boolean num1 = true;
        for(int i=2; i<=primenum-1; i++){
            if(primenum%i==0){
                num1 = false;
            }
        }
        if (num1 == true){
            System.out.println(primenum+" is prime");
        }
        else{
            System.out.println(primenum+" is not prime");
        }sc.close();
    }
}