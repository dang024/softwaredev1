import java.util.Scanner;

public class Exercise_03_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int computer = (int)(Math.random() * 3);

        System.out.print("Pick either scissors(0), rock(1), or paper(2): ");
            int user = input.nextInt();

        System.out.println("The computer is ");
            switch (computer)
        {
            case 0: System.out.print("Scissors."); break;
            case 1: System.out.print("Rock."); break;
            case 2: System.out.print("Paper.");
        }

        System.out.print(" You are ");
        switch (user)
        {
            case 0: System.out.print("Scissors"); break;
            case 1: System.out.print("Rock"); break;
            case 2: System.out.print("Paper ");
        }

        // Display result
        if (computer == user)
            System.out.print(" too. It is a draw.");
        else
        {
            boolean win = (user == 0 && computer == 2) ||
                    (user == 1 && computer == 0) ||
                    (user == 2 && computer == 1);
            if (win)
                System.out.println(". You win!");
            else
                System.out.println(". You lose. :(");
        }
    }
}