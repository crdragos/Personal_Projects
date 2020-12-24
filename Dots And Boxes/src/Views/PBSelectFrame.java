package Views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PBSelectFrame extends DBFrame {

    private static JTextField player1TF;
    private static JTextField player2TF;
    private JButton btn3x3;
    private JButton btn4x4;
    private final Color culoareFundal = new Color(135, 135, 255);
    private final Color culoareButoane = new Color(255, 255, 179);

    public PBSelectFrame() {

        super("Dots and Boxes");

        contentPanel.setLayout(null);
        contentPanel.setBackground(this.culoareFundal);

        JPanel panel1 = new JPanel();
        panel1.setBackground(this.culoareFundal);
        panel1.setBounds(10, 11, 564, 169);
        panel1.setLayout(null);
        contentPanel.add(panel1);

        JLabel player1Label = new JLabel("Player 1: ");
        player1Label.setForeground(this.culoareButoane);
        player1Label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        player1Label.setHorizontalTextPosition(SwingConstants.CENTER);
        player1Label.setHorizontalAlignment(SwingConstants.CENTER);
        player1Label.setBounds(10, 64, 86, 23);
        panel1.add(player1Label);

        player1TF = new JTextField();
        player1TF.setForeground(new Color(0, 0, 0));
        player1TF.setCaretColor(new Color(0, 0, 0));
        player1TF.setHorizontalAlignment(SwingConstants.CENTER);
        player1TF.setFont(new Font("Times New Roman", Font.ITALIC, 14));
        player1TF.setBackground(this.culoareButoane);
        player1TF.setBounds(106, 64, 120, 20);
        player1TF.setColumns(10);
        panel1.add(player1TF);

        JLabel player2Label = new JLabel("Player 2: ");
        player2Label.setForeground(this.culoareButoane);
        player2Label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        player2Label.setHorizontalTextPosition(SwingConstants.CENTER);
        player2Label.setHorizontalAlignment(SwingConstants.CENTER);
        player2Label.setBounds(300, 64, 86, 23);
        panel1.add(player2Label);

        player2TF = new JTextField();
        player2TF.setForeground(new Color(0, 0, 0));
        player2TF.setCaretColor(new Color(0, 0, 0));
        player2TF.setHorizontalAlignment(SwingConstants.CENTER);
        player2TF.setFont(new Font("Times New Roman", Font.ITALIC, 14));
        player2TF.setBackground(this.culoareButoane);
        player2TF.setBounds(399, 65, 120, 20);
        player2TF.setColumns(10);
        panel1.add(player2TF);

        JPanel panel2 = new JPanel();
        panel2.setBackground(this.culoareFundal);
        panel2.setBounds(10, 191, 564, 127);
        panel2.setLayout(null);
        contentPanel.add(panel2);

        JLabel textLabel = new JLabel("Alegeti dimensiunea tablei de joc");
        textLabel.setForeground(this.culoareButoane);
        textLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        textLabel.setHorizontalAlignment(SwingConstants.CENTER);
        textLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        textLabel.setBounds(10, 11, 300, 28);
        panel2.add(textLabel);

        btn3x3 = new JButton("3x3");
        btn3x3.setBorderPainted(false);
        btn3x3.setBackground(this.culoareButoane);
        btn3x3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
        btn3x3.setBounds(91, 50, 131, 45);
        panel2.add(btn3x3);

        btn4x4 = new JButton("4x4");
        btn4x4.setBorderPainted(false);
        btn4x4.setBackground(this.culoareButoane);
        btn4x4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
        btn4x4.setBounds(311, 50, 146, 45);
        panel2.add(btn4x4);
    }

    public static String getPlayer1Name() {
        return player1TF.getText();
    }

    public static String  getPlayer2Name() {
        return player2TF.getText();
    }

    public void setBtn3x3ActionListener(ActionListener actionListener) {
        btn3x3.addActionListener(actionListener);
    }

    public void setBtn4x4ActionListener(ActionListener actionListener) {
        btn4x4.addActionListener(actionListener);
    }
}
