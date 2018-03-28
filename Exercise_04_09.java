import java.util.Scanner;

public class Exercise_04_09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a character: ");
		String letter = input.nextLine();
		char c = letter.charAt(0);

		// Display Unicode of character
		System.out.println((int)c);
	}
}