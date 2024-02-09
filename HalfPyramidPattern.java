import java.util.Scanner;

public class HalfPyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            System.out.println("");
            for (int j = 1; j <= i; j++) {
                
                System.out.print(j);
            }
            
        }
        sc.close();
    }
}

//                                                  **REVISING AGAIN*

// import java.util.Scanner;
// public class HalfPyramidPattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter any number: ");
//         int a = sc.nextInt();

//         for (int i = 1; i <= a; i++) {
//             System.err.println("");
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j);
                
//             }
            
//         }
//         sc.close();
//     }
// }