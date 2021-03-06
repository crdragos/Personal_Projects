package Views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BoardFrame3x3 extends DBFrame {

    private final Color culoareFundal = new Color(135, 135, 255);
    private final Color culoareButoane = new Color(255, 255, 179);
    private final Color culoareBoxPlayer1 = new Color(128, 191, 255);
    private final Color culoareBoxPlayer2 = new Color(255, 128, 179);
    private final Color culoareHighlight = new Color(255, 204, 153);
    private final Color culoareScris = new Color(220, 215, 0);

    private JButton btn11, btn12, btn13, btn14, btn15, btn16, btn17;
    private JButton btn21, btn22, btn23, btn24, btn25, btn26, btn27;
    private JButton btn31, btn32, btn33, btn34, btn35, btn36, btn37;
    private JButton btn41, btn42, btn43, btn44, btn45, btn46, btn47;
    private JButton btn51, btn52, btn53, btn54, btn55, btn56, btn57;
    private JButton btn61, btn62, btn63, btn64, btn65, btn66, btn67;
    private JButton btn71, btn72, btn73, btn74, btn75, btn76, btn77;
    private JButton btnRestart;

    private JLabel turn;
    private JLabel valueOfScore1;

    private int contorTura;
    private Integer scorPlayer1;
    private Integer scorPlayer2;

    public BoardFrame3x3(String title) {
        super(title);

        this.contorTura = 0;
        this.scorPlayer1 = 0;
        this.scorPlayer2 = 0;

        this.setSize(600, 550);

        contentPanel.setBackground(this.culoareFundal);
        contentPanel.setLayout(null);

        JPanel panel1 = new JPanel();
        panel1.setBackground(this.culoareFundal);
        panel1.setBounds(10, 11, 564, 78);
        panel1.setLayout(null);
        contentPanel.add(panel1);

        JLabel player1LB = new JLabel("Player 1: ");
        player1LB.setHorizontalTextPosition(SwingConstants.CENTER);
        player1LB.setHorizontalAlignment(SwingConstants.CENTER);
        player1LB.setForeground(culoareScris);
        player1LB.setFont(new Font("Times New Roman", Font.BOLD, 15));
        player1LB.setBounds(10, 11, 70, 20);
        panel1.add(player1LB);

        JLabel payer1NameLB = new JLabel(PBSelectFrame.getPlayer1Name());
        payer1NameLB.setHorizontalTextPosition(SwingConstants.CENTER);
        payer1NameLB.setHorizontalAlignment(SwingConstants.CENTER);
        payer1NameLB.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
        payer1NameLB.setForeground(culoareScris);
        payer1NameLB.setBounds(94, 11, 96, 20);
        panel1.add(payer1NameLB);

        JLabel score1 = new JLabel("Score:");
        score1.setForeground(culoareScris);
        score1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
        score1.setHorizontalTextPosition(SwingConstants.CENTER);
        score1.setHorizontalAlignment(SwingConstants.CENTER);
        score1.setBounds(36, 42, 58, 25);
        panel1.add(score1);

        valueOfScore1 = new JLabel(this.scorPlayer1.toString());
        valueOfScore1.setHorizontalTextPosition(SwingConstants.CENTER);
        valueOfScore1.setHorizontalAlignment(SwingConstants.CENTER);
        valueOfScore1.setForeground(culoareScris);
        valueOfScore1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
        valueOfScore1.setBounds(104, 42, 30, 25);
        panel1.add(valueOfScore1);

        JLabel player2LB = new JLabel("Player 2: ");
        player2LB.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
        player2LB.setHorizontalTextPosition(SwingConstants.CENTER);
        player2LB.setHorizontalAlignment(SwingConstants.CENTER);
        player2LB.setForeground(culoareScris);
        player2LB.setBounds(329, 11, 96, 20);
        panel1.add(player2LB);

        JLabel player2NameLB = new JLabel(PBSelectFrame.getPlayer2Name());
        player2NameLB.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
        player2NameLB.setHorizontalTextPosition(SwingConstants.CENTER);
        player2NameLB.setHorizontalAlignment(SwingConstants.CENTER);
        player2NameLB.setForeground(culoareScris);
        player2NameLB.setBounds(409, 11, 96, 20);
        panel1.add(player2NameLB);

        JLabel score2 = new JLabel("Score: ");
        score2.setForeground(culoareScris);
        score2.setFont(new Font("Times New Roman", Font.BOLD, 16));
        score2.setHorizontalTextPosition(SwingConstants.CENTER);
        score2.setHorizontalAlignment(SwingConstants.CENTER);
        score2.setBounds(371, 42, 58, 25);
        panel1.add(score2);

        JLabel valueOfScore2 = new JLabel("0");
        valueOfScore2.setHorizontalTextPosition(SwingConstants.CENTER);
        valueOfScore2.setHorizontalAlignment(SwingConstants.CENTER);
        valueOfScore2.setForeground(culoareScris);
        valueOfScore2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
        valueOfScore2.setBounds(439, 42, 30, 25);
        panel1.add(valueOfScore2);

        JPanel panel2 = new JPanel();
        panel2.setBackground(this.culoareFundal);
        panel2.setBounds(10, 100, 564, 353);
        panel2.setLayout(null);
        contentPanel.add(panel2);

        btn11 = new JButton();
        btn11.setBorderPainted(false);
        btn11.setBackground(Color.BLACK);
        btn11.setBounds(102, 15, 20, 20);
        panel2.add(btn11);

        btn12 = new JButton();
        btn12.setBorderPainted(false);
        btn12.setBackground(this.culoareFundal);
        btn12.setBounds(121, 15, 75, 20);
        panel2.add(btn12);

        btn12.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (btn12.getBackground().equals(culoareFundal) || btn12.getBackground().equals(culoareHighlight)) {
                    if (contorTura % 2 == 0) {
                        btn12.setBackground(culoareButoane);
                        if (btn21.getBackground().equals(culoareFundal) == false && btn23.getBackground().equals(culoareFundal) == false && btn32.getBackground().equals(culoareFundal) == false) {
                            scorPlayer1 += 1;
                            valueOfScore1.setText(String.valueOf(scorPlayer1));
                            btn22.setBackground(culoareBoxPlayer1);
                            contorTura -= 1;
                        }
                        switchTurn(turn);
                    } else {
                        btn12.setBackground(culoareButoane);
                        if (btn21.getBackground().equals(culoareFundal) == false && btn23.getBackground().equals(culoareFundal) == false && btn32.getBackground().equals(culoareFundal) == false) {
                            scorPlayer2 += 1;
                            valueOfScore2.setText(String.valueOf(scorPlayer2));
                            btn22.setBackground(culoareBoxPlayer2);
                            contorTura -= 1;
                        }
                        switchTurn(turn);
                    }
                    contorTura++;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (btn12.getBackground().equals(culoareFundal)) {
                    btn12.setBackground(culoareHighlight);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (btn12.getBackground().equals(culoareHighlight)) {
                    btn12.setBackground(culoareFundal);
                }
            }
        });

        btn13 = new JButton();
        btn13.setBorderPainted(false);
        btn13.setBackground(Color.BLACK);
        btn13.setBounds(195, 15, 20, 20);
        panel2.add(btn13);

        btn14 = new JButton();
        btn14.setBorderPainted(false);
        btn14.setBackground(this.culoareFundal);
        btn14.setBounds(214, 15, 75, 20);
        panel2.add(btn14);

        btn14.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (btn14.getBackground().equals(culoareFundal) || btn14.getBackground().equals(culoareHighlight)) {
                    if (contorTura % 2 == 0) {
                        btn14.setBackground(culoareButoane);
                        if (btn23.getBackground().equals(culoareFundal) == false && btn25.getBackground().equals(culoareFundal) == false && btn34.getBackground().equals(culoareFundal) == false) {
                            scorPlayer1 += 1;
                            valueOfScore1.setText(String.valueOf(scorPlayer1));
                            btn24.setBackground(culoareBoxPlayer1);
                            contorTura -= 1;
                        }
                        switchTurn(turn);
                    } else {
                        btn14.setBackground(culoareButoane);
                        if (btn23.getBackground().equals(culoareFundal) == false && btn25.getBackground().equals(culoareFundal) == false && btn34.getBackground().equals(culoareFundal) == false) {
                            scorPlayer2 += 1;
                            valueOfScore2.setText(String.valueOf(scorPlayer2));
                            btn24.setBackground(culoareBoxPlayer2);
                            contorTura -= 1;
                        }
                        switchTurn(turn);
                    }
                    contorTura++;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (btn14.getBackground().equals(culoareFundal)) {
                    btn14.setBackground(culoareHighlight);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (btn14.getBackground().equals(culoareHighlight)) {
                    btn14.setBackground(culoareFundal);
                }
            }
        });

        btn15 = new JButton();
        btn15.setBorderPainted(false);
        btn15.setBackground(Color.BLACK);
        btn15.setBounds(288, 15, 20, 20);
        panel2.add(btn15);

        btn16 = new JButton();
        btn16.setBorderPainted(false);
        btn16.setBackground(this.culoareFundal);
        btn16.setBounds(307, 15, 75, 20);
        panel2.add(btn16);

        btn16.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (btn16.getBackground().equals(culoareFundal) || btn16.getBackground().equals(culoareHighlight)) {
                    if (contorTura % 2 == 0) {
                        btn16.setBackground(culoareButoane);
                        if (btn25.getBackground().equals(culoareFundal) == false && btn27.getBackground().equals(culoareFundal)  == false && btn36.getBackground().equals(culoareFundal) == false) {
                            scorPlayer1 += 1;
                            valueOfScore1.setText(String.valueOf(scorPlayer1));
                            btn26.setBackground(culoareBoxPlayer1);
                            contorTura -= 1;
                        }
                        switchTurn(turn);
                    } else {
                        btn16.setBackground(culoareButoane);
                        if (btn25.getBackground().equals(culoareFundal) == false && btn27.getBackground().equals(culoareFundal) == false && btn36.getBackground().equals(culoareFundal) == false) {
                            scorPlayer2 += 1;
                            valueOfScore2.setText(String.valueOf(scorPlayer2));
                            btn26.setBackground(culoareBoxPlayer2);
                            contorTura -= 1;
                        }
                        switchTurn(turn);
                    }
                    contorTura++;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (btn16.getBackground().equals(culoareFundal)) {
                    btn16.setBackground(culoareHighlight);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (btn16.getBackground().equals(culoareHighlight)) {
                    btn16.setBackground(culoareFundal);
                }
            }
        });

        btn17 = new JButton();
        btn17.setBorderPainted(false);
        btn17.setBackground(Color.BLACK);
        btn17.setBounds(381, 15, 20, 20);
        panel2.add(btn17);

        btn21 = new JButton();
        btn21.setBorderPainted(false);
        btn21.setBackground(culoareFundal);
        btn21.setBounds(102, 35, 20, 40);;
        panel2.add(btn21);

        btn21.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (btn21.getBackground().equals(culoareFundal) || btn21.getBackground().equals(culoareHighlight)) {
                    if (contorTura % 2 == 0) {
                        btn21.setBackground(culoareButoane);
                        if (btn12.getBackground().equals(culoareFundal) == false && btn23.getBackground().equals(culoareFundal) == false && btn32.getBackground().equals(culoareFundal) == false) {
                            scorPlayer1 += 1;
                            valueOfScore1.setText(String.valueOf(scorPlayer1));
                            btn22.setBackground(culoareBoxPlayer1);
                            contorTura--;
                        }
                        switchTurn(turn);
                    } else {
                        btn21.setBackground(culoareButoane);
                        if (btn21.getBackground().equals(culoareFundal) == false && btn23.getBackground().equals(culoareFundal) == false && btn32.getBackground().equals(culoareFundal) == false) {
                            scorPlayer2 += 1;
                            valueOfScore2.setText(String.valueOf(scorPlayer2));
                            btn22.setBackground(culoareBoxPlayer2);
                            contorTura--;
                        }
                        switchTurn(turn);
                    }
                    contorTura++;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (btn21.getBackground().equals(culoareFundal)) {
                    btn21.setBackground(culoareHighlight);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (btn21.getBackground().equals(culoareHighlight)) {
                    btn21.setBackground(culoareFundal);
                }
            }
        });

        btn22 = new JButton();
        btn22.setBorderPainted(false);
        btn22.setBackground(this.culoareFundal);
        btn22.setBounds(121, 35, 75, 40);
        panel2.add(btn22);

        btn23 = new JButton();
        btn23.setBorderPainted(false);
        btn23.setBackground(this.culoareFundal);
        btn23.setBounds(195, 35, 20, 40);;
        panel2.add(btn23);

        btn23.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (btn23.getBackground().equals(culoareFundal) || btn23.getBackground().equals(culoareHighlight)) {
                    if (contorTura % 2 == 0) {
                        btn23.setBackground(culoareButoane);
                        if (btn12.getBackground().equals(culoareFundal) == false && btn21.getBackground().equals(culoareFundal) == false && btn32.getBackground().equals(culoareFundal) == false) {
                            btn22.setBackground(culoareBoxPlayer1);
                            scorPlayer1 += 1;
                            valueOfScore1.setText(String.valueOf(scorPlayer1));
                            contorTura -= 1;
                        }
                        if (btn14.getBackground().equals(culoareFundal) == false && btn34.getBackground().equals(culoareFundal) == false && btn25.getBackground().equals(culoareFundal) == false) {
                            scorPlayer1 += 1;
                            valueOfScore1.setText(String.valueOf(scorPlayer1));
                            btn24.setBackground(culoareBoxPlayer1);
                            contorTura -= 1;
                            if (contorTura % 2 == 0) {
                                contorTura--;
                            }
                        }
                        switchTurn(turn);
                    } else {
                        btn23.setBackground(culoareButoane);
                        if (btn12.getBackground().equals(culoareFundal) == false && btn21.getBackground().equals(culoareFundal) == false && btn32.getBackground().equals(culoareFundal) == false) {
                            btn22.setBackground(culoareBoxPlayer2);
                            scorPlayer2 += 1;
                            valueOfScore2.setText(String.valueOf(scorPlayer2));
                            contorTura--;
                        }
                        if (btn14.getBackground().equals(culoareFundal) == false && btn34.getBackground().equals(culoareFundal) == false && btn25.getBackground().equals(culoareFundal) == false) {
                            scorPlayer2 += 1;
                            valueOfScore2.setText(String.valueOf(scorPlayer2));
                            btn24.setBackground(culoareBoxPlayer2);
                            contorTura--;
                            if (contorTura % 2 == 1) {
                                contorTura--;
                            }
                        }
                        switchTurn(turn);
                    }
                    contorTura++;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (btn23.getBackground().equals(culoareFundal)) {
                    btn23.setBackground(culoareHighlight);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (btn23.getBackground().equals(culoareHighlight)) {
                    btn23.setBackground(culoareFundal);
                }
            }
        });

        btn24 = new JButton();
        btn24.setBorderPainted(false);
        btn24.setBackground(this.culoareFundal);
        btn24.setBounds(214, 35, 75, 40);
        panel2.add(btn24);

        btn25 = new JButton();
        btn25.setBorderPainted(false);
        btn25.setBackground(this.culoareFundal);
        btn25.setBounds(288, 35, 20, 40);;
        panel2.add(btn25);

        btn25.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (btn25.getBackground().equals(culoareFundal) || btn25.getBackground().equals(culoareHighlight)) {
                    if (contorTura % 2 == 0) {
                        btn25.setBackground(culoareButoane);
                        if (btn14.getBackground().equals(culoareFundal) == false && btn23.getBackground().equals(culoareFundal) == false && btn34.getBackground().equals(culoareFundal) == false) {
                            scorPlayer1 += 1;
                            valueOfScore1.setText(String.valueOf(scorPlayer1));
                            btn24.setBackground(culoareBoxPlayer1);
                            contorTura--;
                        }
                        if (btn16.getBackground().equals(culoareFundal) == false && btn36.getBackground().equals(culoareFundal) == false && btn27.getBackground().equals(culoareFundal) == false) {
                            scorPlayer1 += 1;
                            valueOfScore1.setText(String.valueOf(scorPlayer1));
                            btn26.setBackground(culoareBoxPlayer1);
                            contorTura--;
                            if (contorTura % 2 == 0) {
                                contorTura--;
                            }
                        }
                        switchTurn(turn);
                    } else {
                        btn25.setBackground(culoareButoane);
                        if (btn14.getBackground().equals(culoareFundal) == false && btn23.getBackground().equals(culoareFundal) == false && btn34.getBackground().equals(culoareFundal) == false) {
                            scorPlayer2 += 1;
                            valueOfScore2.setText(String.valueOf(scorPlayer2));
                            btn24.setBackground(culoareBoxPlayer2);
                            contorTura--;
                        }
                        if (btn16.getBackground().equals(culoareFundal) == false && btn36.getBackground().equals(culoareFundal) == false && btn27.getBackground().equals(culoareFundal) == false) {
                            scorPlayer2 += 1;
                            valueOfScore2.setText(String.valueOf(scorPlayer2));
                            btn26.setBackground(culoareBoxPlayer2);
                            contorTura--;
                            if (contorTura % 2 == 1) {
                                contorTura --;
                            }
                        }
                        switchTurn(turn);
                    }
                    contorTura++;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (btn25.getBackground().equals(culoareFundal)) {
                    btn25.setBackground(culoareHighlight);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (btn25.getBackground().equals(culoareHighlight)) {
                    btn25.setBackground(culoareFundal);
                }
            }
        });

        btn26 = new JButton();
        btn26.setBorderPainted(false);
        btn26.setBackground(this.culoareFundal);
        btn26.setBounds(307, 35, 75, 40);
        panel2.add(btn26);

        btn27 = new JButton();
        btn27.setBorderPainted(false);
        btn27.setBackground(this.culoareFundal);
        btn27.setBounds(381, 35, 20, 40);;
        panel2.add(btn27);

        btn27.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (btn27.getBackground().equals(culoareFundal) || btn27.getBackground().equals(culoareHighlight)) {
                    if (contorTura % 2 == 0) {
                        btn27.setBackground(culoareButoane);
                        if (btn16.getBackground().equals(culoareFundal) == false && btn36.getBackground().equals(culoareFundal) == false && btn25.getBackground().equals(culoareFundal) == false) {
                            scorPlayer1 += 1;
                            valueOfScore1.setText(String.valueOf(scorPlayer1));
                            btn26.setBackground(culoareBoxPlayer1);
                            contorTura--;
                        }
                        switchTurn(turn);
                    } else {
                        btn27.setBackground(culoareButoane);
                        if (btn16.getBackground().equals(culoareFundal) == false && btn36.getBackground().equals(culoareFundal) == false && btn25.getBackground().equals(culoareFundal) == false) {
                            scorPlayer2 += 1;
                            valueOfScore2.setText(String.valueOf(scorPlayer2));
                            btn26.setBackground(culoareBoxPlayer2);
                            contorTura--;
                        }
                        switchTurn(turn);
                    }
                    contorTura++;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (btn27.getBackground().equals(culoareFundal)) {
                    btn27.setBackground(culoareHighlight);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (btn27.getBackground().equals(culoareHighlight)) {
                    btn27.setBackground(culoareFundal);
                }
            }
        });

        btn31 = new JButton();
        btn31.setBorderPainted(false);
        btn31.setBackground(Color.BLACK);
        btn31.setBounds(102, 75, 20, 20);
        panel2.add(btn31);

        btn32 = new JButton();
        btn32.setBorderPainted(false);
        btn32.setBackground(culoareFundal);
        btn32.setBounds(121, 75, 75, 20);
        panel2.add(btn32);

        btn32.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (btn32.getBackground().equals(culoareFundal) || btn32.getBackground().equals(culoareHighlight)) {
                    if (contorTura % 2 == 0) {
                        btn32.setBackground(culoareButoane);
                        if (btn21.getBackground().equals(culoareFundal) == false && btn23.getBackground().equals(culoareFundal) == false && btn12.getBackground().equals(culoareFundal) == false){
                            scorPlayer1 += 1;
                            valueOfScore1.setText(String.valueOf(scorPlayer1));
                            btn22.setBackground(culoareBoxPlayer1);
                            contorTura--;
                        }
                        if (btn41.getBackground().equals(culoareFundal) == false && btn43.getBackground().equals(culoareFundal) == false && btn52.getBackground().equals(culoareFundal) == false){
                            scorPlayer1 += 1;
                            valueOfScore1.setText(String.valueOf(scorPlayer1));
                            btn42.setBackground(culoareBoxPlayer1);
                            contorTura--;
                            if (contorTura % 2 == 0) {
                                contorTura--;
                            }
                        }
                        switchTurn(turn);
                    } else {
                        btn32.setBackground(culoareButoane);
                        if (btn21.getBackground().equals(culoareFundal) == false && btn23.getBackground().equals(culoareFundal) == false && btn12.getBackground().equals(culoareFundal) == false){
                            scorPlayer2 += 1;
                            valueOfScore2.setText(String.valueOf(scorPlayer2));
                            btn22.setBackground(culoareBoxPlayer2);
                            contorTura--;
                        }
                        if (btn41.getBackground().equals(culoareFundal) == false && btn43.getBackground().equals(culoareFundal) == false && btn52.getBackground().equals(culoareFundal) == false){
                            scorPlayer2 += 1;
                            valueOfScore2.setText(String.valueOf(scorPlayer2));
                            btn42.setBackground(culoareBoxPlayer2);
                            contorTura--;
                            if (contorTura % 2 == 1) {
                                contorTura--;
                            }
                        }
                        switchTurn(turn);
                    }
                    contorTura++;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (btn32.getBackground().equals(culoareFundal)) {
                    btn32.setBackground(culoareHighlight);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (btn32.getBackground().equals(culoareHighlight)) {
                    btn32.setBackground(culoareFundal);
                }
            }
        });

        btn33 = new JButton();
        btn33.setBorderPainted(false);
        btn33.setBackground(Color.BLACK);
        btn33.setBounds(195, 75, 20, 20);
        panel2.add(btn33);

        btn34 = new JButton();
        btn34.setBorderPainted(false);
        btn34.setBackground(this.culoareFundal);
        btn34.setBounds(214, 75, 75, 20);
        panel2.add(btn34);

        btn34.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (btn34.getBackground().equals(culoareFundal) || btn34.getBackground().equals(culoareHighlight)) {
                    if (contorTura % 2 == 0) {
                        btn34.setBackground(culoareButoane);
                        if (btn23.getBackground().equals(culoareFundal) == false && btn25.getBackground().equals(culoareFundal) == false && btn14.getBackground().equals(culoareFundal) == false){
                            scorPlayer1 += 1;
                            valueOfScore1.setText(String.valueOf(scorPlayer1));
                            btn24.setBackground(culoareBoxPlayer1);
                            contorTura--;
                        }
                        if (btn43.getBackground().equals(culoareFundal) == false && btn45.getBackground().equals(culoareFundal) == false && btn54.getBackground().equals(culoareFundal) == false){
                            scorPlayer1 += 1;
                            valueOfScore1.setText(String.valueOf(scorPlayer1));
                            btn44.setBackground(culoareBoxPlayer1);
                            contorTura--;
                            if (contorTura % 2 == 0) {
                                contorTura--;
                            }
                        }
                        switchTurn(turn);
                    } else {
                        btn34.setBackground(culoareButoane);
                        if (btn23.getBackground().equals(culoareFundal) == false && btn25.getBackground().equals(culoareFundal) == false && btn14.getBackground().equals(culoareFundal) == false){
                            scorPlayer2 += 1;
                            valueOfScore2.setText(String.valueOf(scorPlayer2));
                            btn24.setBackground(culoareBoxPlayer2);
                            contorTura--;
                        }
                        if (btn43.getBackground().equals(culoareFundal) == false && btn45.getBackground().equals(culoareFundal) == false && btn54.getBackground().equals(culoareFundal) == false){
                            scorPlayer2 += 1;
                            valueOfScore2.setText(String.valueOf(scorPlayer2));
                            btn44.setBackground(culoareBoxPlayer2);
                            contorTura--;
                            if (contorTura % 2 == 1) {
                                contorTura--;
                            }
                        }
                        switchTurn(turn);
                    }
                    contorTura++;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (btn34.getBackground().equals(culoareFundal)) {
                    btn34.setBackground(culoareHighlight);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (btn34.getBackground().equals(culoareHighlight)) {
                    btn34.setBackground(culoareFundal);
                }
            }
        });

        btn35 = new JButton();
        btn35.setBorderPainted(false);
        btn35.setBackground(Color.BLACK);
        btn35.setBounds(288, 75, 20, 20);
        panel2.add(btn35);

        btn36 = new JButton();
        btn36.setBorderPainted(false);
        btn36.setBackground(culoareFundal);
        btn36.setBounds(307, 75, 75, 20);
        panel2.add(btn36);

        btn36.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (btn36.getBackground().equals(culoareFundal) || btn36.getBackground().equals(culoareHighlight)) {
                    if (contorTura % 2 == 0) {
                        btn36.setBackground(culoareButoane);
                        if (btn25.getBackground().equals(culoareFundal) == false && btn27.getBackground().equals(culoareFundal) == false && btn16.getBackground().equals(culoareFundal) == false){
                            scorPlayer1 += 1;
                            valueOfScore1.setText(String.valueOf(scorPlayer1));
                            btn26.setBackground(culoareBoxPlayer1);
                            contorTura--;
                        }
                        if (btn45.getBackground().equals(culoareFundal) == false && btn47.getBackground().equals(culoareFundal) == false && btn56.getBackground().equals(culoareFundal) == false){
                            scorPlayer1 += 1;
                            valueOfScore1.setText(String.valueOf(scorPlayer1));
                            btn46.setBackground(culoareBoxPlayer1);
                            contorTura--;
                            if (contorTura % 2 == 0) {
                                contorTura--;
                            }
                        }
                        switchTurn(turn);
                    } else {
                        btn36.setBackground(culoareButoane);
                        if (btn25.getBackground().equals(culoareFundal) == false && btn27.getBackground().equals(culoareFundal) == false && btn16.getBackground().equals(culoareFundal) == false){
                            scorPlayer2 += 1;
                            valueOfScore2.setText(String.valueOf(scorPlayer2));
                            btn26.setBackground(culoareBoxPlayer2);
                            contorTura--;
                        }
                        if (btn45.getBackground().equals(culoareFundal) == false && btn47.getBackground().equals(culoareFundal) == false && btn56.getBackground().equals(culoareFundal) == false){
                            scorPlayer2 += 1;
                            valueOfScore2.setText(String.valueOf(scorPlayer2));
                            btn46.setBackground(culoareBoxPlayer2);
                            contorTura--;
                            if (contorTura % 2 == 1) {
                                contorTura--;
                            }
                        }

                        switchTurn(turn);
                    }
                    contorTura++;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (btn36.getBackground().equals(culoareFundal)) {
                    btn36.setBackground(culoareHighlight);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (btn36.getBackground().equals(culoareHighlight)) {
                    btn36.setBackground(culoareFundal);
                }
            }
        });

        btn37 = new JButton();
        btn37.setBorderPainted(false);
        btn37.setBackground(Color.BLACK);
        btn37.setBounds(381, 75, 20, 20);
        panel2.add(btn37);

        btn41 = new JButton();
        btn41.setBorderPainted(false);
        btn41.setBackground(culoareFundal);
        btn41.setBounds(102, 95, 20, 40);
        panel2.add(btn41);

        btn41.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (btn41.getBackground().equals(culoareFundal) || btn41.getBackground().equals(culoareHighlight)) {
                    if (contorTura % 2 == 0) {
                        btn41.setBackground(culoareButoane);
                        if (btn32.getBackground().equals(culoareFundal) == false && btn52.getBackground().equals(culoareFundal) == false && btn43.getBackground().equals(culoareFundal) == false){
                            scorPlayer1 += 1;
                            valueOfScore1.setText(String.valueOf(scorPlayer1));
                            btn42.setBackground(culoareBoxPlayer1);
                            contorTura--;
                        }
                        switchTurn(turn);
                    } else {
                        btn41.setBackground(culoareButoane);
                        if (btn32.getBackground().equals(culoareFundal) == false && btn52.getBackground().equals(culoareFundal) == false && btn43.getBackground().equals(culoareFundal) == false){
                            scorPlayer2 += 1;
                            valueOfScore2.setText(String.valueOf(scorPlayer2));
                            btn42.setBackground(culoareBoxPlayer2);
                            contorTura--;
                        }
                        switchTurn(turn);
                    }
                    contorTura++;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (btn41.getBackground().equals(culoareFundal)) {
                    btn41.setBackground(culoareHighlight);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (btn41.getBackground().equals(culoareHighlight)) {
                    btn41.setBackground(culoareFundal);
                }
            }
        });

        btn42 = new JButton();
        btn42.setBorderPainted(false);
        btn42.setBackground(culoareFundal);
        btn42.setBounds(121, 95, 75, 40);
        panel2.add(btn42);

        btn43 = new JButton();
        btn43.setBorderPainted(false);
        btn43.setBackground(culoareFundal);
        btn43.setBounds(195, 95, 20, 40);
        panel2.add(btn43);

        btn43.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (btn43.getBackground().equals(culoareFundal) || btn43.getBackground().equals(culoareHighlight)) {
                    if (contorTura % 2 == 0) {
                        btn43.setBackground(culoareButoane);
                        if (btn32.getBackground().equals(culoareFundal) == false && btn41.getBackground().equals(culoareFundal) == false && btn52.getBackground().equals(culoareFundal) == false){
                            scorPlayer1 += 1;
                            valueOfScore1.setText(String.valueOf(scorPlayer1));
                            btn42.setBackground(culoareBoxPlayer1);
                            contorTura--;
                        }
                        if (btn34.getBackground().equals(culoareFundal) == false && btn54.getBackground().equals(culoareFundal) == false && btn45.getBackground().equals(culoareFundal) == false){
                            scorPlayer1 += 1;
                            valueOfScore1.setText(String.valueOf(scorPlayer1));
                            btn44.setBackground(culoareBoxPlayer1);
                            contorTura--;
                            if (contorTura % 2 == 0) {
                                contorTura--;
                            }
                        }
                        switchTurn(turn);
                    } else {
                        btn43.setBackground(culoareButoane);
                        if (btn32.getBackground().equals(culoareFundal) == false && btn41.getBackground().equals(culoareFundal) == false && btn52.getBackground().equals(culoareFundal) == false){
                            scorPlayer2 += 1;
                            valueOfScore2.setText(String.valueOf(scorPlayer2));
                            btn42.setBackground(culoareBoxPlayer2);
                            contorTura--;
                        }
                        if (btn34.getBackground().equals(culoareFundal) == false && btn54.getBackground().equals(culoareFundal) == false && btn45.getBackground().equals(culoareFundal) == false){
                            scorPlayer2 += 1;
                            valueOfScore2.setText(String.valueOf(scorPlayer1));
                            btn44.setBackground(culoareBoxPlayer2);
                            contorTura--;
                            if (contorTura % 2 == 1) {
                                contorTura--;
                            }
                        }
                        switchTurn(turn);
                    }
                    contorTura++;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (btn43.getBackground().equals(culoareFundal)) {
                    btn43.setBackground(culoareHighlight);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (btn43.getBackground().equals(culoareHighlight)) {
                    btn43.setBackground(culoareFundal);
                }
            }
        });

        btn44 = new JButton();
        btn44.setBorderPainted(false);
        btn44.setBackground(culoareFundal);
        btn44.setBounds(214, 95, 75, 40);
        panel2.add(btn44);

        btn45 = new JButton();
        btn45.setBorderPainted(false);
        btn45.setBackground(culoareFundal);
        btn45.setBounds(288, 95, 20, 40);
        panel2.add(btn45);

        btn45.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (btn45.getBackground().equals(culoareFundal) || btn45.getBackground().equals(culoareHighlight)) {
                    if (contorTura % 2 == 0) {
                        btn45.setBackground(culoareButoane);
                        if (btn43.getBackground().equals(culoareFundal) == false && btn34.getBackground().equals(culoareFundal) == false && btn54.getBackground().equals(culoareFundal) == false){
                            scorPlayer1 += 1;
                            valueOfScore1.setText(String.valueOf(scorPlayer1));
                            btn44.setBackground(culoareBoxPlayer1);
                            contorTura--;
                        }
                        if (btn36.getBackground().equals(culoareFundal) == false && btn56.getBackground().equals(culoareFundal) == false && btn47.getBackground().equals(culoareFundal) == false){
                            scorPlayer1 += 1;
                            valueOfScore1.setText(String.valueOf(scorPlayer1));
                            btn46.setBackground(culoareBoxPlayer1);
                            contorTura--;
                            if (contorTura % 2 == 0) {
                                contorTura--;
                            }
                        }
                        switchTurn(turn);
                    } else {
                        btn45.setBackground(culoareButoane);
                        if (btn43.getBackground().equals(culoareFundal) == false && btn34.getBackground().equals(culoareFundal) == false && btn54.getBackground().equals(culoareFundal) == false){
                            scorPlayer2 += 1;
                            valueOfScore2.setText(String.valueOf(scorPlayer2));
                            btn44.setBackground(culoareBoxPlayer2);
                            contorTura--;
                        }
                        if (btn36.getBackground().equals(culoareFundal) == false && btn56.getBackground().equals(culoareFundal) == false && btn47.getBackground().equals(culoareFundal) == false){
                            scorPlayer2 += 1;
                            valueOfScore2.setText(String.valueOf(scorPlayer2));
                            btn46.setBackground(culoareBoxPlayer2);
                            contorTura--;
                            if (contorTura % 2 == 1) {
                                contorTura--;
                            }
                        }
                        switchTurn(turn);
                    }
                    contorTura++;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (btn45.getBackground().equals(culoareFundal)) {
                    btn45.setBackground(culoareHighlight);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (btn45.getBackground().equals(culoareHighlight)) {
                    btn45.setBackground(culoareFundal);
                }
            }
        });

        btn46 = new JButton();
        btn46.setBorderPainted(false);
        btn46.setBackground(culoareFundal);
        btn46.setBounds(307, 95, 75, 40);
        panel2.add(btn46);

        btn47 = new JButton();
        btn47.setBorderPainted(false);
        btn47.setBackground(culoareFundal);
        btn47.setBounds(381, 95, 20, 40);
        panel2.add(btn47);

        btn47.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (btn47.getBackground().equals(culoareFundal) || btn47.getBackground().equals(culoareHighlight)) {
                    if (contorTura % 2 == 0) {
                        btn47.setBackground(culoareButoane);
                        if (btn45.getBackground().equals(culoareFundal) == false && btn36.getBackground().equals(culoareFundal) == false && btn56.getBackground().equals(culoareFundal) == false){
                            scorPlayer1 += 1;
                            valueOfScore1.setText(String.valueOf(scorPlayer1));
                            btn46.setBackground(culoareBoxPlayer1);
                            contorTura--;
                        }
                        switchTurn(turn);
                    } else {
                        btn47.setBackground(culoareButoane);
                        if (btn45.getBackground().equals(culoareFundal) == false && btn36.getBackground().equals(culoareFundal) == false && btn56.getBackground().equals(culoareFundal) == false){
                            scorPlayer2 += 1;
                            valueOfScore2.setText(String.valueOf(scorPlayer2));
                            btn46.setBackground(culoareBoxPlayer2);
                            contorTura--;
                        }
                        switchTurn(turn);
                    }
                    contorTura++;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (btn47.getBackground().equals(culoareFundal)) {
                    btn47.setBackground(culoareHighlight);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (btn47.getBackground().equals(culoareHighlight)) {
                    btn47.setBackground(culoareFundal);
                }
            }
        });

        btn51 = new JButton();
        btn51.setBorderPainted(false);
        btn51.setBackground(Color.BLACK);
        btn51.setBounds(102, 135, 20, 20);
        panel2.add(btn51);

        btn52 = new JButton();
        btn52.setBorderPainted(false);
        btn52.setBackground(culoareFundal);
        btn52.setBounds(121, 135, 75, 20);
        panel2.add(btn52);

        btn52.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (btn52.getBackground().equals(culoareFundal) || btn52.getBackground().equals(culoareHighlight)) {
                    if (contorTura % 2 == 0) {
                        btn52.setBackground(culoareButoane);
                        if (btn41.getBackground().equals(culoareFundal) == false && btn43.getBackground().equals(culoareFundal) == false && btn32.getBackground().equals(culoareFundal) == false){
                            scorPlayer1 += 1;
                            valueOfScore1.setText(String.valueOf(scorPlayer1));
                            btn42.setBackground(culoareBoxPlayer1);
                            contorTura--;
                        }
                        if (btn61.getBackground().equals(culoareFundal) == false && btn63.getBackground().equals(culoareFundal) == false && btn72.getBackground().equals(culoareFundal) == false){
                            scorPlayer1 += 1;
                            valueOfScore1.setText(String.valueOf(scorPlayer1));
                            btn62.setBackground(culoareBoxPlayer1);
                            contorTura--;
                            if (contorTura % 2 == 0) {
                                contorTura--;
                            }
                        }
                        switchTurn(turn);
                    } else {
                        btn52.setBackground(culoareButoane);
                        if (btn41.getBackground().equals(culoareFundal) == false && btn43.getBackground().equals(culoareFundal) == false && btn32.getBackground().equals(culoareFundal) == false){
                            scorPlayer2 += 1;
                            valueOfScore2.setText(String.valueOf(scorPlayer2));
                            btn42.setBackground(culoareBoxPlayer2);
                            contorTura--;
                        }
                        if (btn61.getBackground().equals(culoareFundal) == false && btn63.getBackground().equals(culoareFundal) == false && btn72.getBackground().equals(culoareFundal) == false){
                            scorPlayer2 += 1;
                            valueOfScore2.setText(String.valueOf(scorPlayer2));
                            btn62.setBackground(culoareBoxPlayer2);
                            contorTura--;
                            if (contorTura % 2 == 1) {
                                contorTura--;
                            }
                        }
                        switchTurn(turn);
                    }
                    contorTura++;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (btn52.getBackground().equals(culoareFundal)) {
                    btn52.setBackground(culoareHighlight);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (btn52.getBackground().equals(culoareHighlight)) {
                    btn52.setBackground(culoareFundal);
                }
            }
        });

        btn53 = new JButton();
        btn53.setBorderPainted(false);
        btn53.setBackground(Color.BLACK);
        btn53.setBounds(195, 135, 20, 20);
        panel2.add(btn53);

        btn54 = new JButton();
        btn54.setBorderPainted(false);
        btn54.setBackground(culoareFundal);
        btn54.setBounds(214, 135, 75, 20);
        panel2.add(btn54);

        btn54.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (btn54.getBackground().equals(culoareFundal) || btn54.getBackground().equals(culoareHighlight)) {
                    if (contorTura % 2 == 0) {
                        btn54.setBackground(culoareButoane);
                        if (btn43.getBackground().equals(culoareFundal) == false && btn45.getBackground().equals(culoareFundal) == false && btn34.getBackground().equals(culoareFundal) == false){
                            scorPlayer1 += 1;
                            valueOfScore1.setText(String.valueOf(scorPlayer1));
                            btn44.setBackground(culoareBoxPlayer1);
                            contorTura--;
                        }
                        if (btn63.getBackground().equals(culoareFundal) == false && btn65.getBackground().equals(culoareFundal) == false && btn74.getBackground().equals(culoareFundal) == false){
                            scorPlayer1 += 1;
                            valueOfScore1.setText(String.valueOf(scorPlayer1));
                            btn64.setBackground(culoareBoxPlayer1);
                            contorTura--;
                            if (contorTura % 2 == 0) {
                                contorTura--;
                            }
                        }
                        switchTurn(turn);
                    } else {
                        btn54.setBackground(culoareButoane);
                        if (btn43.getBackground().equals(culoareFundal) == false && btn45.getBackground().equals(culoareFundal) == false && btn34.getBackground().equals(culoareFundal) == false){
                            scorPlayer2 += 1;
                            valueOfScore2.setText(String.valueOf(scorPlayer2));
                            btn44.setBackground(culoareBoxPlayer2);
                            contorTura--;
                        }
                        if (btn63.getBackground().equals(culoareFundal) == false && btn65.getBackground().equals(culoareFundal) == false && btn74.getBackground().equals(culoareFundal) == false){
                            scorPlayer2 += 1;
                            valueOfScore2.setText(String.valueOf(scorPlayer2));
                            btn64.setBackground(culoareBoxPlayer2);
                            contorTura--;
                            if (contorTura % 2 == 1) {
                                contorTura--;
                            }
                        }
                        switchTurn(turn);
                    }
                    contorTura++;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (btn54.getBackground().equals(culoareFundal)) {
                    btn54.setBackground(culoareHighlight);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (btn54.getBackground().equals(culoareHighlight)) {
                    btn54.setBackground(culoareFundal);
                }
            }
        });

        btn55 = new JButton();
        btn55.setBorderPainted(false);
        btn55.setBackground(Color.BLACK);
        btn55.setBounds(288, 135, 20, 20);
        panel2.add(btn55);

        btn56 = new JButton();
        btn56.setBorderPainted(false);
        btn56.setBackground(culoareFundal);
        btn56.setBounds(307, 135, 75, 20);
        panel2.add(btn56);

        btn56.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (btn56.getBackground().equals(culoareFundal) || btn56.getBackground().equals(culoareHighlight)) {
                    if (contorTura % 2 == 0) {
                        btn56.setBackground(culoareButoane);
                        if (btn45.getBackground().equals(culoareFundal) == false && btn47.getBackground().equals(culoareFundal) == false && btn36.getBackground().equals(culoareFundal) == false){
                            scorPlayer1 += 1;
                            valueOfScore1.setText(String.valueOf(scorPlayer1));
                            btn46.setBackground(culoareBoxPlayer1);
                            contorTura--;
                        }
                        if (btn65.getBackground().equals(culoareFundal) == false && btn67.getBackground().equals(culoareFundal) == false && btn76.getBackground().equals(culoareFundal) == false){
                            scorPlayer1 += 1;
                            valueOfScore1.setText(String.valueOf(scorPlayer1));
                            btn66.setBackground(culoareBoxPlayer1);
                            contorTura--;
                            if (contorTura % 2 == 0) {
                                contorTura--;
                            }
                        }
                        switchTurn(turn);
                    } else {
                        btn56.setBackground(culoareButoane);
                        if (btn45.getBackground().equals(culoareFundal) == false && btn47.getBackground().equals(culoareFundal) == false && btn36.getBackground().equals(culoareFundal) == false){
                            scorPlayer2 += 1;
                            valueOfScore2.setText(String.valueOf(scorPlayer2));
                            btn46.setBackground(culoareBoxPlayer2);
                            contorTura--;
                        }
                        if (btn65.getBackground().equals(culoareFundal) == false && btn67.getBackground().equals(culoareFundal) == false && btn76.getBackground().equals(culoareFundal) == false){
                            scorPlayer2 += 1;
                            valueOfScore2.setText(String.valueOf(scorPlayer2));
                            btn66.setBackground(culoareBoxPlayer2);
                            contorTura--;
                            if (contorTura % 2 == 1) {
                                contorTura--;
                            }
                        }
                        switchTurn(turn);
                    }
                    contorTura++;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (btn56.getBackground().equals(culoareFundal)) {
                    btn56.setBackground(culoareHighlight);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (btn56.getBackground().equals(culoareHighlight)) {
                    btn56.setBackground(culoareFundal);
                }
            }
        });

        btn57 = new JButton();
        btn57.setBorderPainted(false);
        btn57.setBackground(Color.BLACK);
        btn57.setBounds(381, 135, 20, 20);
        panel2.add(btn57);

        btn61 = new JButton();
        btn61.setBorderPainted(false);
        btn61.setBackground(culoareFundal);
        btn61.setBounds(102, 155, 20, 40);
        panel2.add(btn61);

        btn61.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (btn61.getBackground().equals(culoareFundal) || btn61.getBackground().equals(culoareHighlight)) {
                    if (contorTura % 2 == 0) {
                        btn61.setBackground(culoareButoane);
                        if (btn63.getBackground().equals(culoareFundal) == false && btn52.getBackground().equals(culoareFundal) == false && btn72.getBackground().equals(culoareFundal) == false){
                            scorPlayer1 += 1;
                            valueOfScore1.setText(String.valueOf(scorPlayer1));
                            btn62.setBackground(culoareBoxPlayer1);
                            contorTura--;
                        }
                        switchTurn(turn);
                    } else {
                        btn61.setBackground(culoareButoane);
                        if (btn63.getBackground().equals(culoareFundal) == false && btn52.getBackground().equals(culoareFundal) == false && btn72.getBackground().equals(culoareFundal) == false){
                            scorPlayer2 += 1;
                            valueOfScore2.setText(String.valueOf(scorPlayer2));
                            btn62.setBackground(culoareBoxPlayer2);
                            contorTura--;
                        }
                        switchTurn(turn);
                    }
                    contorTura++;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (btn61.getBackground().equals(culoareFundal)) {
                    btn61.setBackground(culoareHighlight);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (btn61.getBackground().equals(culoareHighlight)) {
                    btn61.setBackground(culoareFundal);
                }
            }
        });

        btn62 = new JButton();
        btn62.setBorderPainted(false);
        btn62.setBackground(culoareFundal);
        btn62.setBounds(121, 155, 75, 40);
        panel2.add(btn62);

        btn63 = new JButton();
        btn63.setBorderPainted(false);
        btn63.setBackground(culoareFundal);
        btn63.setBounds(195, 155, 20, 40);
        panel2.add(btn63);

        btn63.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (btn63.getBackground().equals(culoareFundal) || btn63.getBackground().equals(culoareHighlight)) {
                    if (contorTura % 2 == 0) {
                        btn63.setBackground(culoareButoane);
                        if (btn61.getBackground().equals(culoareFundal) == false && btn52.getBackground().equals(culoareFundal) == false && btn72.getBackground().equals(culoareFundal) == false){
                            scorPlayer1 += 1;
                            valueOfScore1.setText(String.valueOf(scorPlayer1));
                            btn62.setBackground(culoareBoxPlayer1);
                            contorTura--;
                        }
                        if (btn65.getBackground().equals(culoareFundal) == false && btn54.getBackground().equals(culoareFundal) == false && btn74.getBackground().equals(culoareFundal) == false){
                            scorPlayer1 += 1;
                            valueOfScore1.setText(String.valueOf(scorPlayer1));
                            btn64.setBackground(culoareBoxPlayer1);
                            contorTura--;
                            if (contorTura % 2 == 0) {
                                contorTura--;
                            }
                        }
                        switchTurn(turn);
                    } else {
                        btn63.setBackground(culoareButoane);
                        if (btn61.getBackground().equals(culoareFundal) == false && btn52.getBackground().equals(culoareFundal) == false && btn72.getBackground().equals(culoareFundal) == false){
                            scorPlayer2 += 1;
                            valueOfScore2.setText(String.valueOf(scorPlayer2));
                            btn62.setBackground(culoareBoxPlayer2);
                            contorTura--;
                        }
                        if (btn65.getBackground().equals(culoareFundal) == false && btn54.getBackground().equals(culoareFundal) == false && btn74.getBackground().equals(culoareFundal) == false){
                            scorPlayer2 += 1;
                            valueOfScore2.setText(String.valueOf(scorPlayer2));
                            btn64.setBackground(culoareBoxPlayer2);
                            contorTura--;
                            if (contorTura % 2 == 1) {
                                contorTura--;
                            }
                        }
                        switchTurn(turn);
                    }
                    contorTura++;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (btn63.getBackground().equals(culoareFundal)) {
                    btn63.setBackground(culoareHighlight);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (btn63.getBackground().equals(culoareHighlight)) {
                    btn63.setBackground(culoareFundal);
                }
            }
        });

        btn64 = new JButton();
        btn64.setBorderPainted(false);
        btn64.setBackground(culoareFundal);
        btn64.setBounds(214, 155, 75, 40);
        panel2.add(btn64);

        btn65 = new JButton();
        btn65.setBorderPainted(false);
        btn65.setBackground(culoareFundal);
        btn65.setBounds(288, 155, 20, 40);
        panel2.add(btn65);

        btn65.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (btn65.getBackground().equals(culoareFundal) || btn65.getBackground().equals(culoareHighlight)) {
                    if (contorTura % 2 == 0) {
                        btn65.setBackground(culoareButoane);
                        if (btn63.getBackground().equals(culoareFundal) == false && btn54.getBackground().equals(culoareFundal) == false && btn74.getBackground().equals(culoareFundal) == false){
                            scorPlayer1 += 1;
                            valueOfScore1.setText(String.valueOf(scorPlayer1));
                            btn64.setBackground(culoareBoxPlayer1);
                            contorTura--;
                        }
                        if (btn67.getBackground().equals(culoareFundal) == false && btn56.getBackground().equals(culoareFundal) == false && btn76.getBackground().equals(culoareFundal) == false){
                            scorPlayer1 += 1;
                            valueOfScore1.setText(String.valueOf(scorPlayer1));
                            btn66.setBackground(culoareBoxPlayer1);
                            contorTura--;
                            if (contorTura % 2 == 0) {
                                contorTura--;
                            }
                        }
                        switchTurn(turn);
                    } else {
                        btn65.setBackground(culoareButoane);
                        if (btn63.getBackground().equals(culoareFundal) == false && btn54.getBackground().equals(culoareFundal) == false && btn74.getBackground().equals(culoareFundal) == false){
                            scorPlayer2 += 1;
                            valueOfScore2.setText(String.valueOf(scorPlayer2));
                            btn64.setBackground(culoareBoxPlayer2);
                            contorTura--;
                        }
                        if (btn67.getBackground().equals(culoareFundal) == false && btn56.getBackground().equals(culoareFundal) == false && btn76.getBackground().equals(culoareFundal) == false){
                            scorPlayer2 += 1;
                            valueOfScore2.setText(String.valueOf(scorPlayer2));
                            btn66.setBackground(culoareBoxPlayer2);
                            contorTura--;
                            if (contorTura % 2 == 1) {
                                contorTura--;
                            }
                        }
                        switchTurn(turn);
                    }
                    contorTura++;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (btn65.getBackground().equals(culoareFundal)) {
                    btn65.setBackground(culoareHighlight);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (btn65.getBackground().equals(culoareHighlight)) {
                    btn65.setBackground(culoareFundal);
                }
            }
        });

        btn66 = new JButton();
        btn66.setBorderPainted(false);
        btn66.setBackground(culoareFundal);
        btn66.setBounds(307, 155, 75, 40);
        panel2.add(btn66);

        btn67 = new JButton();
        btn67.setBorderPainted(false);
        btn67.setBackground(culoareFundal);
        btn67.setBounds(381, 155, 20, 40);
        panel2.add(btn67);

        btn67.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (btn67.getBackground().equals(culoareFundal) || btn67.getBackground().equals(culoareHighlight)) {
                    if (contorTura % 2 == 0) {
                        btn67.setBackground(culoareButoane);
                        if (btn65.getBackground().equals(culoareFundal) == false && btn56.getBackground().equals(culoareFundal) == false && btn76.getBackground().equals(culoareFundal) == false){
                            scorPlayer1 += 1;
                            valueOfScore1.setText(String.valueOf(scorPlayer1));
                            btn66.setBackground(culoareBoxPlayer1);
                            contorTura--;
                        }
                        switchTurn(turn);
                    } else {
                        btn67.setBackground(culoareButoane);
                        if (btn65.getBackground().equals(culoareFundal) == false && btn56.getBackground().equals(culoareFundal) == false && btn76.getBackground().equals(culoareFundal) == false){
                            scorPlayer2 += 1;
                            valueOfScore2.setText(String.valueOf(scorPlayer2));
                            btn66.setBackground(culoareBoxPlayer2);
                            contorTura--;
                        }
                        switchTurn(turn);
                    }
                    contorTura++;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (btn67.getBackground().equals(culoareFundal)) {
                    btn67.setBackground(culoareHighlight);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (btn67.getBackground().equals(culoareHighlight)) {
                    btn67.setBackground(culoareFundal);
                }
            }
        });

        btn71 = new JButton();
        btn71.setBorderPainted(false);
        btn71.setBackground(Color.BLACK);
        btn71.setBounds(102, 195, 20, 20);
        panel2.add(btn71);

        btn72 = new JButton();
        btn72.setBorderPainted(false);
        btn72.setBackground(culoareFundal);
        btn72.setBounds(121, 195, 75, 20);
        panel2.add(btn72);

        btn72.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (btn72.getBackground().equals(culoareFundal) || btn72.getBackground().equals(culoareHighlight)) {
                    if (contorTura % 2 == 0) {
                        btn72.setBackground(culoareButoane);
                        if (btn61.getBackground().equals(culoareFundal) == false && btn63.getBackground().equals(culoareFundal) == false && btn52.getBackground().equals(culoareFundal) == false){
                            scorPlayer1 += 1;
                            valueOfScore1.setText(String.valueOf(scorPlayer1));
                            btn62.setBackground(culoareBoxPlayer1);
                            contorTura--;
                        }
                        switchTurn(turn);
                    } else {
                        btn72.setBackground(culoareButoane);
                        if (btn61.getBackground().equals(culoareFundal) == false && btn63.getBackground().equals(culoareFundal) == false && btn52.getBackground().equals(culoareFundal) == false){
                            scorPlayer2 += 1;
                            valueOfScore2.setText(String.valueOf(scorPlayer2));
                            btn62.setBackground(culoareBoxPlayer2);
                            contorTura--;
                        }
                        switchTurn(turn);
                    }
                    contorTura++;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (btn72.getBackground().equals(culoareFundal)) {
                    btn72.setBackground(culoareHighlight);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (btn72.getBackground().equals(culoareHighlight)) {
                    btn72.setBackground(culoareFundal);
                }
            }
        });

        btn73 = new JButton();
        btn73.setBorderPainted(false);
        btn73.setBackground(Color.BLACK);
        btn73.setBounds(195, 195, 20, 20);
        panel2.add(btn73);

        btn74 = new JButton();
        btn74.setBorderPainted(false);
        btn74.setBackground(culoareFundal);
        btn74.setBounds(214, 195, 75, 20);
        panel2.add(btn74);

        btn74.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (btn74.getBackground().equals(culoareFundal) || btn74.getBackground().equals(culoareHighlight)) {
                    if (contorTura % 2 == 0) {
                        btn74.setBackground(culoareButoane);
                        if (btn63.getBackground().equals(culoareFundal) == false && btn65.getBackground().equals(culoareFundal) == false && btn54.getBackground().equals(culoareFundal) == false){
                            scorPlayer1 += 1;
                            valueOfScore1.setText(String.valueOf(scorPlayer1));
                            btn64.setBackground(culoareBoxPlayer1);
                            contorTura--;
                        }
                        switchTurn(turn);
                    } else {
                        btn74.setBackground(culoareButoane);
                        if (btn63.getBackground().equals(culoareFundal) == false && btn65.getBackground().equals(culoareFundal) == false && btn54.getBackground().equals(culoareFundal) == false){
                            scorPlayer2 += 1;
                            valueOfScore2.setText(String.valueOf(scorPlayer2));
                            btn64.setBackground(culoareBoxPlayer2);
                            contorTura--;
                        }
                        switchTurn(turn);
                    }
                    contorTura++;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (btn74.getBackground().equals(culoareFundal)) {
                    btn74.setBackground(culoareHighlight);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (btn74.getBackground().equals(culoareHighlight)) {
                    btn74.setBackground(culoareFundal);
                }
            }
        });

        btn75 = new JButton();
        btn75.setBorderPainted(false);
        btn75.setBackground(Color.BLACK);
        btn75.setBounds(288, 195, 20, 20);
        panel2.add(btn75);

        btn76 = new JButton();
        btn76.setBorderPainted(false);
        btn76.setBackground(culoareFundal);
        btn76.setBounds(307, 195, 75, 20);
        panel2.add(btn76);

        btn76.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (btn76.getBackground().equals(culoareFundal) || btn76.getBackground().equals(culoareHighlight)) {
                    if (contorTura % 2 == 0) {
                        btn76.setBackground(culoareButoane);
                        if (btn65.getBackground().equals(culoareFundal) == false && btn67.getBackground().equals(culoareFundal) == false && btn56.getBackground().equals(culoareFundal) == false){
                            scorPlayer1 += 1;
                            valueOfScore1.setText(String.valueOf(scorPlayer1));
                            btn66.setBackground(culoareBoxPlayer1);
                            contorTura--;
                        }
                        switchTurn(turn);
                    } else {
                        btn76.setBackground(culoareButoane);
                        if (btn65.getBackground().equals(culoareFundal) == false && btn67.getBackground().equals(culoareFundal) == false && btn56.getBackground().equals(culoareFundal) == false){
                            scorPlayer2 += 1;
                            valueOfScore2.setText(String.valueOf(scorPlayer2));
                            btn66.setBackground(culoareBoxPlayer2);
                            contorTura--;
                        }
                        switchTurn(turn);
                    }
                    contorTura++;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (btn76.getBackground().equals(culoareFundal)) {
                    btn76.setBackground(culoareHighlight);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (btn76.getBackground().equals(culoareHighlight)) {
                    btn76.setBackground(culoareFundal);
                }
            }
        });

        btn77 = new JButton();
        btn77.setBorderPainted(false);
        btn77.setBackground(Color.BLACK);
        btn77.setBounds(381, 195, 20, 20);
        panel2.add(btn77);

        turn = new JLabel(PBSelectFrame.getPlayer1Name() + "'s turn");
        turn.setForeground(culoareHighlight);
        turn.setFont(new Font("Times New Roman", Font.BOLD, 20));
        turn.setHorizontalTextPosition(SwingConstants.CENTER);
        turn.setHorizontalAlignment(SwingConstants.CENTER);
        turn.setBounds(135, 225, 250, 30);
        panel2.add(turn);

        btnRestart = new JButton("Restart");
        btnRestart.setHorizontalTextPosition(SwingConstants.CENTER);
        btnRestart.setBorderPainted(false);
        btnRestart.setBackground(culoareButoane);
        btnRestart.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        btnRestart.setBounds(195, 280, 150, 50);
        panel2.add(btnRestart);
    }

    public void setBtnRestartActionListener(ActionListener actionListener) {
        btnRestart.addActionListener(actionListener);
    }

    public void switchTurn(JLabel label) {
        if (this.contorTura % 2 == 1) {
            label.setForeground(culoareHighlight);
            label.setText(PBSelectFrame.getPlayer1Name() + "' s turn");
        } else {
            label.setForeground(culoareHighlight);
            label.setText(PBSelectFrame.getPlayer2Name() + "' s turn");
        }
        if (this.scorPlayer1 + this.scorPlayer2 == 9) {
            label.setBounds(135, 225, 250, 30);
            if (this.scorPlayer1 > this.scorPlayer2) {
                label.setForeground(new Color(220, 215, 0));
                label.setText("Winner is : " + PBSelectFrame.getPlayer1Name());
            } else {
                label.setForeground(new Color(220, 215, 0));
                label.setText("Winner is : " + PBSelectFrame.getPlayer2Name());
            }
        }
    }
}

