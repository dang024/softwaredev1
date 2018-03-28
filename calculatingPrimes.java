// Program that checks whether a user-inputted number is prime
import java.util.Scanner;

public class calculatingPrimes{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int i;
        System.out.println("Please enter a number: ");
        int n = in.nextInt();
        
                
        for(i = 2; i <= n; i++){
            if (n % i == 0){
                System.out.println("False");
            }
            else System.out.println("True");
        }

    }
}