import java.util.Scanner;
public class sumoffirstnnumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i<=n){            //yaha pe check kar rahe hain ki i ki value n se chhoti hai ya equal hai
            sum+=i;             //here, we are adding the value of sum, which is 0 initially
                                //to the i's value, which is 1 intitially, which makes the value of 'sum' 1
            i++;                //Then we increment the i value by 1 and repeats until the loop runs.
        }
        System.out.println("The sum is: "+sum);
        sc.close();
    }
}