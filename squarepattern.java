import java.util.Scanner;
public class squarepattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the grid size of square: ");
        int a = sc.nextInt();

        for(int i=1; i<=a; i++){
            System.out.println();
            for (int j=1; j<=a; j++){
                System.out.print("*");
            }
        }
        
    sc.close();
    }
    
}
