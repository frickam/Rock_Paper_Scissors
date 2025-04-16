public class RockPaperScissorsRunner {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
//import java.util.Scanner;
//public class RockPaperScissors
//{
//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        String moveA = "";
//        String moveB = "";
//        String play = "";
//        boolean done = false;
//        do
//        {
//            System.out.print("Player 1: Enter your move [R, P, S]: ");
//            moveA = in.nextLine();
//            if (moveA.equalsIgnoreCase("R"))
//            {
//                System.out.print("Player 2: Enter your move [R, P, S]: ");
//                moveB = in.nextLine();
//                if (moveB.equalsIgnoreCase("R"))
//                {
//                    System.out.println("Rock vs. Rock! Its a Tie!");
//                    System.out.print("Would you like to play again? [Y, N]: ");
//                    play = in.nextLine();
//                    if (play.equalsIgnoreCase("N"))
//                    {
//                        done = true;
//                    }
//                }
//                else if (moveB.equalsIgnoreCase("P"))
//                {
//                    System.out.println("Paper covers Rock! Player 2 Wins!");
//                    System.out.print("Would you like to play again? [Y, N]: ");
//                    play = in.nextLine();
//                    if (play.equalsIgnoreCase("N"))
//                    {
//                        done = true;
//                    }
//                }
//                else if (moveB.equalsIgnoreCase("S"))
//                {
//                    System.out.println("Rock breaks Scissors! Player 1 Wins!");
//                    System.out.print("Would you like to play again? [Y, N]: ");
//                    play = in.nextLine();
//                    if (play.equalsIgnoreCase("N"))
//                    {
//                        done = true;
//                    }
//                }
//                else
//                {
//                    System.out.println("Please enter a valid input!");
//                    System.out.println("Player 2: Please enter R, P, or S not: " + moveB);
//                }
//            }
//            else if (moveA.equalsIgnoreCase("P"))
//            {
//                System.out.print("Player 2: Enter your move [R, P, S]: ");
//                moveB = in.nextLine();
//                if (moveB.equalsIgnoreCase("R"))
//                {
//                    System.out.println("Paper covers Rock! Player 1 Wins!");
//                    System.out.print("Would you like to play again? [Y, N]: ");
//                    play = in.nextLine();
//                    if (play.equalsIgnoreCase("N"))
//                    {
//                        done = true;
//                    }
//                }
//                else if (moveB.equalsIgnoreCase("P"))
//                {
//                    System.out.println("Paper vs Paper! It's a Tie!");
//                    System.out.print("Would you like to play again? [Y, N]: ");
//                    play = in.nextLine();
//                    if (play.equalsIgnoreCase("N"))
//                    {
//                        done = true;
//                    }
//                }
//                else if (moveB.equalsIgnoreCase("S"))
//                {
//                    System.out.println("Scissors cuts Paper! Player 2 Wins!");
//                    System.out.print("Would you like to play again? [Y, N]: ");
//                    play = in.nextLine();
//                    if (play.equalsIgnoreCase("N"))
//                    {
//                        done = true;
//                    }
//                }
//                else
//                {
//                    System.out.println("Please enter a valid input!");
//                    System.out.println("Player 2: Please enter R, P, or S not: " + moveB);
//                }
//            }
//            else if (moveA.equalsIgnoreCase("S"))
//            {
//                System.out.print("Player 2: Enter your move [R, P, S]: ");
//                moveB = in.nextLine();
//                if (moveB.equalsIgnoreCase("R"))
//                {
//                    System.out.println("Rock breaks Scissors! Player 2 Wins!");
//                    System.out.print("Would you like to play again? [Y, N]: ");
//                    play = in.nextLine();
//                    if (play.equalsIgnoreCase("N"))
//                    {
//                        done = true;
//                    }
//                }
//                else if (moveB.equalsIgnoreCase("P"))
//                {
//                    System.out.println("Scissors cuts Paper! Player 1 Wins!");
//                    System.out.print("Would you like to play again? [Y, N]: ");
//                    play = in.nextLine();
//                    if (play.equalsIgnoreCase("N"))
//                    {
//                        done = true;
//                    }
//                }
//                else if (moveB.equalsIgnoreCase("S"))
//                {
//                    System.out.println("Scissors vs. Scissors! It's a Tie!");
//                    System.out.print("Would you like to play again? [Y, N]: ");
//                    play = in.nextLine();
//                    if (play.equalsIgnoreCase("N"))
//                    {
//                        done = true;
//                    }
//                }
//                else
//                {
//                    System.out.println("Please enter a valid input!");
//                    System.out.println("Player 2: Please enter R, P, or S not: " + moveB);
//                }
//            }
//            else
//            {
//                System.out.println("Please enter a valid input!");
//                System.out.println("Player 1: Please enter R,P, or S not: " + moveA);
//            }
//        }
//        while(!done);
//    }
//}