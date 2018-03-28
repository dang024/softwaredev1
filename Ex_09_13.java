import java.util.Scanner;

public class Ex_09_13{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the number of rows, then columns in the array: ");
            int rows = input.nextInt();
            int columns = input.nextInt();
        
        double[][] array = new double[rows][columns];
        System.out.println("Please enter the array: ");
            for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextDouble();
            }
          }
        
        Location max = locateLargest(array);
        
        System.out.println("The largest element is: " + max.maxValue + " and can be found at: "
                           + max.row + "," + max.column);
    }
    public static Location locateLargest(double[][] a){
        return new Location(a);
    }
}