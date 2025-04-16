import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class RockPaperScissorsFrame extends JFrame {
    JPanel mainPnl, titlePnl, statsPnl, cmdPnl, resultPnl;
    JLabel titleLbl;
    JButton rockBtn, paperBtn, scissorsBtn, quitBtn;
    JLabel playerWinsLbl, computerWinsLbl, tiesLbl;
    JTextField playerWinsTxt, computerWinsTxt, tiesTxt;
    JTextArea resultTxtArea;
    JScrollPane scrollPane;

    public RockPaperScissorsFrame(ActionListener gameActionListener, ActionListener quitActionListener) {
        setTitle("Rock Paper Scissors Game");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPnl = new JPanel();
        mainPnl.setLayout(new BorderLayout());

        createTitlePanel();
        createStatsPanel();
        createControlPanel(gameActionListener, quitActionListener);
        createResultPanel();

        add(mainPnl);
        setVisible(true);
    }

    private void createTitlePanel() {
        titlePnl = new JPanel();
        titleLbl = new JLabel("Rock Paper Scissors Game");
        titleLbl.setFont(new Font("Arial", Font.BOLD, 24));
        titlePnl.add(titleLbl);
        mainPnl.add(titlePnl, BorderLayout.NORTH);
    }

    private void createStatsPanel() {
        statsPnl = new JPanel();
        statsPnl.setLayout(new GridLayout(3, 2));
        statsPnl.setBorder(new TitledBorder("Stats"));

        playerWinsLbl = new JLabel("Player Wins: ");
        computerWinsLbl = new JLabel("Computer Wins: ");
        tiesLbl = new JLabel("Ties: ");

        playerWinsTxt = new JTextField("0");
        playerWinsTxt.setEditable(false);
        computerWinsTxt = new JTextField("0");
        computerWinsTxt.setEditable(false);
        tiesTxt = new JTextField("0");
        tiesTxt.setEditable(false);

        statsPnl.add(playerWinsLbl);
        statsPnl.add(playerWinsTxt);
        statsPnl.add(computerWinsLbl);
        statsPnl.add(computerWinsTxt);
        statsPnl.add(tiesLbl);
        statsPnl.add(tiesTxt);

        mainPnl.add(statsPnl, BorderLayout.EAST);
    }

    private void createControlPanel(ActionListener gameActionListener, ActionListener quitActionListener) {
        cmdPnl = new JPanel();
        cmdPnl.setLayout(new GridLayout(4, 1));
        cmdPnl.setBorder(new TitledBorder("Controls"));

        rockBtn = new JButton("Rock");
        paperBtn = new JButton("Paper");
        scissorsBtn = new JButton("Scissors");
        quitBtn = new JButton("Quit");

        rockBtn.addActionListener(gameActionListener);
        paperBtn.addActionListener(gameActionListener);
        scissorsBtn.addActionListener(gameActionListener);
        quitBtn.addActionListener(quitActionListener);

        cmdPnl.add(rockBtn);
        cmdPnl.add(paperBtn);
        cmdPnl.add(scissorsBtn);
        cmdPnl.add(quitBtn);

        mainPnl.add(cmdPnl, BorderLayout.WEST);
    }

    private void createResultPanel() {
        resultPnl = new JPanel();
        resultPnl.setLayout(new BorderLayout());
        resultPnl.setBorder(new TitledBorder("Game Results"));

        resultTxtArea = new JTextArea();
        resultTxtArea.setEditable(false);
        scrollPane = new JScrollPane(resultTxtArea);

        resultPnl.add(scrollPane, BorderLayout.CENTER);

        mainPnl.add(resultPnl, BorderLayout.CENTER);
    }

    public void updateStats(int playerWins, int computerWins, int ties) {
        playerWinsTxt.setText(String.valueOf(playerWins));
        computerWinsTxt.setText(String.valueOf(computerWins));
        tiesTxt.setText(String.valueOf(ties));
    }

    public void appendResult(String result) {
        resultTxtArea.append(result + "\n");
    }
}