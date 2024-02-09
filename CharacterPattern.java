import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of characters you want to be printed: ");
        int a = sc.nextInt();
        char ch = 'A';

        for (int i = 1; i <= a; i++) {
            System.out.println("");
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            
        }
        sc.close();
    }
}




//                                          *REVISION*

// import java.util.Scanner;

// public class CharacterPattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the number of characteristics you want to be printed out: ");
//         int a = sc.nextInt();
//         char b = 'A';

//         for (int i = 1; i <= a; i++) {
//             System.out.println("");
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(b);
//                 b++;
                
//             }
            
//         }
//         sc.close();
//     }
// }