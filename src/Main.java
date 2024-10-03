import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String play1 = "";
        String play2 = "";
        String confirmYN = "";

        boolean done = false;

        do {
            System.out.println("Player 1, enter your move [RPS]: ");
            play1 = in.nextLine();
            System.out.println("Player 2, enter your move [RPS]: ");
            play2 = in.nextLine();


            if (play1.equalsIgnoreCase("R"))
                if (play2.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock vs Rock... Game is a tie!");
                }
                else if (play2.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper beats Rock... Player 2 wins!");
                }
                else if (play2.equalsIgnoreCase("S"))
                {
                    System.out.println("Rock beats Scissors... Player 1 wins");
                }

            if (play1.equalsIgnoreCase("P"))
                if (play2.equalsIgnoreCase("R"))
                {
                    System.out.println("Paper beats Rock... Player 1 wins!");
                }
                 else if (play2.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper vs Paper... Game is a tie!");
                }
                 else if (play2.equalsIgnoreCase("S"))
                {
                    System.out.println("Scissors beats Paper... Player 2 wins");
                }

            if (play1.equalsIgnoreCase("S"))
                if (play2.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock beats Scissors... Player 2 wins!");
                }
                 else if (play2.equalsIgnoreCase("P"))
                 {
                    System.out.println("Scissors beats Paper... Player 1 wins!");
                 }
                 else if (play2.equalsIgnoreCase("S"))
                {
                    System.out.println("Scissors vs Scissors... Game is a tie!");
                }
            else
                    System.out.println("Invalid move! Run the program again!");


            do {
                System.out.println("Do you want to continue the game? [Y/N]: ");
                confirmYN = in.nextLine();
                if (confirmYN.equalsIgnoreCase("Y"))
                {
                    done = false;
                }
                else if (confirmYN.equalsIgnoreCase("N"))
                {
                    done = true;
                }
                else
                {
                    System.out.println("Invalid input! Please enter Y or N.");
                }
            } while (!confirmYN.equalsIgnoreCase("Y") && !confirmYN.equalsIgnoreCase("N"));

        } while (!done);

    }
}
