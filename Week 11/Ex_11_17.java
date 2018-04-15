/* Write a program that prompts the user to enter an integer m and find the smallest integer n such that
m * n is a perfect square. (Hint: Store all smallest factors of m into an array list. n is the product of the
factors that appear an odd number of times in the array list. For example, consider m = 90, store the factors
2, 3, 3, 5 in an array list. 2 and 5 appear an odd number of times in the array list. So, n is 10.) */
import java.io.*;

public class Ex_11_17{
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(InputStreamReader(System.in));

        System.out.println("Enter an integer: ");
        int m = br.nextInt();

        int array[] = new int[m];

        br.close();
    }
}