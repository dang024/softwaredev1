import java.util.Scanner;

public class PasswordValidation{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        String pwd1;
        System.out.println("Please enter your password.");
        pwd1 = in.nextLine();
        
        String pwd2;
        System.out.println("Please re-enter your password.");
        pwd2 = in.nextLine();
        
        if (pwd1.equals(pwd2)){
            System.out.println("Your passwords match!");
        }
            else {
                System.out.println("Your passwords do not match.");
            }
    }
}