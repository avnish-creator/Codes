import java.util.Scanner;

public class FactorialOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int factoriall=1;
        System.out.println("Enter a number for getting the factorial: ");
        int factnum = sc.nextInt();
        
        for (int i = 1; i <= factnum; i++) {
            factoriall *= i;
        }
        System.out.println("Factorial of "+factnum+" is "+factoriall);
        sc.close();
    }
    
}



//                                     *REVISING AGAIN*
// import java.util.Scanner;

// public class FactorialOfANumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int fact = 1;
//         int num;

//         System.out.print("Enter the number to obtain its factorial: ");
//         num = sc.nextInt();

//         for (int i = 1; i <= num; i++) {
//             fact *= i;
            
//         }
//         System.out.println("Factorial is: "+fact);
//         sc.close();
//     }
// }