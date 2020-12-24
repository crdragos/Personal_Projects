package Views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainMenuFrame extends DBFrame {

    private JButton startBtn;
    private JButton closeBtn;
    private final Color culoareFundal = new Color(153, 153, 255);
    private final Color culoareButoane = new Color(255, 255, 179);


    public MainMenuFrame(String title) {
        super(title);
        contentPanel.setLayout(null);
        contentPanel.setBackground(this.culoareFundal);

        startBtn = new JButton("Start Game");
        startBtn.setHorizontalTextPosition(SwingConstants.CENTER);
        startBtn.setBorderPainted(false);
        startBtn.setBackground(culoareButoane);
        startBtn.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
        startBtn.setBounds(210, 147, 180, 63);
        contentPanel.add(startBtn);

        closeBtn = new JButton("Exit");
        closeBtn.setHorizontalTextPosition(SwingConstants.CENTER);
        closeBtn.setBorderPainted(false);
        closeBtn.setBackground(culoareButoane);
        closeBtn.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        closeBtn.setBounds(240, 270, 115, 43);
        contentPanel.add(closeBtn);
    }

    public void setStartBtnActionListener(ActionListener startBtnActionListener) {
        this.startBtn.addActionListener(startBtnActionListener);
    }

    public void setCloseBtnActionListener(ActionListener closeBtnActionListener) {
        this.closeBtn.addActionListener(closeBtnActionListener);
    }
}
