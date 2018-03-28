import java.util.Scanner;

public class Exercise_04_24{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //Creates new Scanner object

        System.out.println("Enter first city:"); //Prompts user for first city
            String city = input.next();

        System.out.println("Enter second city:"); //Prompts user for second city
            String input1 = input.next();

        System.out.println("Enter third city:"); //Prompts user for third city
            String input2 = input.next();

        String temp;
        if ((input1.compareTo(city) < 0) && (input1.compareTo(input2) < 0))
        {
            temp = city;
            city = input1;
            input1 = temp;
        }
        else if ((input2.compareTo(city) < 0) && (input2.compareTo(input1) < 0))
        {
            temp = city;
            city = input2;
            input2 = temp;

        }
        if (input2.compareTo(input1) < 0)
        {
            temp = city;
            input1 = input2;
            input2 = temp;
        }

        // Display cities in ascending order
        System.out.println("The three cities in alphabetical order are " + city + " " + input1 + " " + input2);
    }
}