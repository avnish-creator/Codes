import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int iterations = sc.nextInt();

        for (int i = 1; i <= iterations; i++) {
            System.out.println("");
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                
            }
            
        }
        sc.close();
    }
}


//                                             *REVISED*
// import java.util.Scanner;

// public class StarPattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the pyramid value: ");
//         int a = sc.nextInt();

//         for (int i = 1; i <= a; i++) {
//             System.out.println("");
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("X");
//             }
            
//         }
//     sc.close();}
    
// }