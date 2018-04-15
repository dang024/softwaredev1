import java.util.Scanner;

public class areaoftriangle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        double base; 
        System.out.println("Enter the base of the traingle: ");
            base = in.nextDouble();
        
        double height;
        System.out.println("Enter the height of the triangle: ");
            height = in.nextDouble();
        
        double area;
        area = ((0.5)*(base)*(height));
        System.out.println("The area of the triangle is: " + area);
    }
}