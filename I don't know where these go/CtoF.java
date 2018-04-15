import java.util.Scanner;

public class CtoF{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        double x;
        System.out.println("Enter the temperature in Celsius: ");
        x = in.nextDouble();
        
        double y = (9.0/5) * x +32;
        
        System.out.println(+ x +" Celsius is: "+ y +" Fahrenheit.");
    }
}