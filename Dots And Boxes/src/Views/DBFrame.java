package Views;

import Models.DBFrame_I;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class DBFrame extends JFrame implements DBFrame_I {

    protected JPanel contentPanel;
    private final Color culoareFundal = new Color(135, 135, 255);
    private final Color culoareButoane = new Color(255, 255, 179);

    public DBFrame(String title) {
        FrameStack.getInstance().push(this);
        setTitle(title);
        setSize(600, 400);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        contentPanel = new JPanel();
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPanel.setBackground(this.culoareFundal);
        add(contentPanel, BorderLayout.CENTER);
    }

    public void setBackButtonActionListener(ActionListener actionListener) {
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(this.culoareFundal);
        buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        JButton backButton = new JButton("Back");
        backButton.setBackground(this.culoareButoane);
        backButton.setHorizontalTextPosition(SwingConstants.CENTER);
        backButton.setBorderPainted(false);
        backButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
        buttonPanel.add(backButton);
        this.add(buttonPanel, BorderLayout.SOUTH);
        backButton.addActionListener(actionListener);
    }

    @Override
    public void goBack() {

    }
}
