import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RockPaperScissorsRunner {
    private RockPaperScissorsFrame frame;
    private int playerWins = 0;
    private int computerWins = 0;
    private int ties = 0;

    public RockPaperScissorsRunner() {
        frame = new RockPaperScissorsFrame(new GameActionListener(), e -> System.exit(0));
    }

    private class GameActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String playerChoice = e.getActionCommand();
            String[] choices = {"Rock", "Paper", "Scissors"};
            String computerChoice = choices[(int) (Math.random() * 3)];
            String result;

            if (playerChoice.equals(computerChoice)) {
                result = "It's a Tie!";
                ties++;
            } else if ((playerChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
                    (playerChoice.equals("Paper") && computerChoice.equals("Rock")) ||
                    (playerChoice.equals("Scissors") && computerChoice.equals("Paper"))) {
                result = playerChoice + " beats " + computerChoice + " (Player wins)";
                playerWins++;
            } else {
                result = computerChoice + " beats " + playerChoice + " (Computer wins)";
                computerWins++;
            }

            frame.appendResult(result);
            frame.updateStats(playerWins, computerWins, ties);
        }
    }

    public static void main(String[] args) {
        new RockPaperScissorsRunner();
    }
}