package tp.polynomial.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Aceasta componenta a proiectului este meninta sa descrie modul in care va arata interfata grafica a aplicatiei.
 */

public class PolynomialFrame extends JFrame {

    /**
     * Butoanele care raman vizibile pe tot parcursul utiloizarii aplicatiei.
     */

    private JButton additonButton;
    private JButton subtractionButton;
    private JButton multiplicationButton;
    private JButton divisionButton;
    private JButton derivativeButton;
    private JButton integrationButton;

    /**
     * Aceste doua butoane vor fi vizibile doar dupa ce utilizatorul va selecta o operatie.
     */

    private static JButton clearButton;
    private static JButton submitButton;

    /**
     * Etichete folosite pentru a ajuta utilizatorul sa vada ceea ce a selectat.
     */

    private static JLabel assignmentLabel;
    private static JLabel operationLabel;
    private static JLabel operationSymbolLabel;
    private static JLabel resultLabel;
    private static JLabel nameLabel;
    private static JLabel groupLabel;
    private static JLabel firstPoliLabel;
    private static JLabel secondPoliLabel;

    /**
     * In aceste campuri, utilizatorul va introduce polinoamele pe care doreste sa efectuze operatii.
     */

    private static JTextField firstPoliTextField;
    private static JTextField secondPoliTextField;

    /**
     * Aici va fi afisat rezultaul operatiei dorite, camp care nu poate fi editat de carte utilizator.
     */

    private static JTextField resultTextField;

    private JPanel contentPanel;

    /**
     * Culorile folosite in aplicatie.
     */

    private final Color backgroundColor = new Color(178, 170, 225);

    /**
     * Fonturile folosita in dezvoltarea aplicatiei.
     */

    private final Font labelFont = new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25);
    private final Font polinomFont = new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18);

    /**
     * Constructorul interfetei grafice
     */

    public PolynomialFrame() {
        this.setBounds(100, 100, 700, 550);
        contentPanel = new JPanel();
        contentPanel.setBackground(backgroundColor);
        contentPanel.setLayout(null);
        this.setContentPane(contentPanel);
        this.setResizable(false);
        this.setTitle("TP_2020");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        assignmentLabel = new JLabel();
        assignmentLabel.setForeground(Color.BLACK);
        assignmentLabel.setText("Assignment 1 - Polynomial Calculator");
        assignmentLabel.setFont(labelFont);
        assignmentLabel.setHorizontalTextPosition((int) CENTER_ALIGNMENT);
        assignmentLabel.setBounds(150, 10, 550, 40);

        JPanel headerPanel = new JPanel();
        headerPanel.setBounds(0, 0, 684, 60);
        headerPanel.setLayout(null);
        headerPanel.setBackground(backgroundColor);
        headerPanel.add(assignmentLabel);
        contentPanel.add(headerPanel);

        additonButton = new JButton();
        additonButton.setText("+");
        additonButton.setFont(labelFont);
        additonButton.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        additonButton.setHorizontalTextPosition((int) CENTER_ALIGNMENT);
        additonButton.setBounds(25, 80, 75, 50);

        subtractionButton = new JButton();
        subtractionButton.setFont(labelFont);
        subtractionButton.setText("-");
        subtractionButton.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        subtractionButton.setHorizontalTextPosition((int) CENTER_ALIGNMENT);
        subtractionButton.setBounds(25, 180, 75, 50);

        multiplicationButton = new JButton();
        multiplicationButton.setText("*");
        multiplicationButton.setFont(labelFont);
        multiplicationButton.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        multiplicationButton.setHorizontalTextPosition((int) CENTER_ALIGNMENT);
        multiplicationButton.setBounds(25, 280, 75, 50);

        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(null);
        leftPanel.setBounds(0, 60, 130, 393);
        leftPanel.setBackground(backgroundColor);
        leftPanel.add(additonButton);
        leftPanel.add(subtractionButton);
        leftPanel.add(multiplicationButton);
        contentPanel.add(leftPanel);

        operationLabel = new JLabel();
        operationLabel.setFont(labelFont);
        operationLabel.setText("");
        operationLabel.setBounds(120, 35, 200, 40);
        operationLabel.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        operationLabel.setHorizontalTextPosition((int) CENTER_ALIGNMENT);
        operationLabel.setVisible(false);

        firstPoliLabel = new JLabel();
        firstPoliLabel.setText("P(x) : ");
        firstPoliLabel.setFont(labelFont);
        firstPoliLabel.setBounds(15, 80, 70, 40);
        firstPoliLabel.setVisible(false);

        firstPoliTextField = new JTextField();
        firstPoliTextField.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        firstPoliTextField.setBounds(100, 90, 275, 30);
        firstPoliTextField.setVisible(false);
        firstPoliTextField.setFont(polinomFont);

        operationSymbolLabel = new JLabel();
        operationSymbolLabel.setText("+");
        operationSymbolLabel.setFont(labelFont);
        operationSymbolLabel.setBounds(225, 125, 100, 40);
        operationSymbolLabel.setVisible(false);

        secondPoliLabel = new JLabel();
        secondPoliLabel.setText("Q(x) : ");
        secondPoliLabel.setFont(labelFont);
        secondPoliLabel.setBounds(15, 160, 70, 40);
        secondPoliLabel.setVisible(false);

        secondPoliTextField = new JTextField();
        secondPoliTextField.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        secondPoliTextField.setBounds(100, 170, 275, 30);
        secondPoliTextField.setVisible(false);
        secondPoliTextField.setFont(polinomFont);

        resultLabel = new JLabel();
        resultLabel.setText("Result : ");
        resultLabel.setFont(labelFont);
        resultLabel.setBounds(15, 210, 100, 40);
        resultLabel.setVisible(false);

        resultTextField = new JTextField();
        resultTextField.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        resultTextField.setEditable(false);
        resultTextField.setBounds(100, 220, 275, 30);
        resultTextField.setVisible(false);
        resultTextField.setFont(polinomFont);

        clearButton = new JButton();
        clearButton.setText("Clear");
        clearButton.setBounds(15, 280, 150, 50);
        clearButton.setFont(labelFont);
        clearButton.setVisible(false);

        submitButton = new JButton();
        submitButton.setText("Submit");
        submitButton.setFont(labelFont);
        submitButton.setBounds(250, 280, 150, 50);
        submitButton.setVisible(false);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(null);
        centerPanel.setBounds(130, 60, 420, 393);
        centerPanel.setBackground(backgroundColor);
        centerPanel.add(operationLabel);
        centerPanel.add(firstPoliLabel);
        centerPanel.add(firstPoliTextField);
        centerPanel.add(operationSymbolLabel);
        centerPanel.add(secondPoliLabel);
        centerPanel.add(secondPoliTextField);
        centerPanel.add(resultLabel);
        centerPanel.add(resultTextField);
        centerPanel.add(clearButton);
        centerPanel.add(submitButton);
        contentPanel.add(centerPanel);

        divisionButton = new JButton();
        divisionButton.setText("/");
        divisionButton.setFont(labelFont);
        divisionButton.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        divisionButton.setHorizontalTextPosition((int) CENTER_ALIGNMENT);
        divisionButton.setBounds(25, 80, 75, 50);

        derivativeButton = new JButton();
        derivativeButton.setFont(labelFont);
        derivativeButton.setText("|'");
        derivativeButton.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        derivativeButton.setHorizontalTextPosition((int) CENTER_ALIGNMENT);
        derivativeButton.setBounds(25, 180, 75, 50);

        integrationButton = new JButton();
        integrationButton.setText("S|");
        integrationButton.setFont(labelFont);
        integrationButton.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        integrationButton.setHorizontalTextPosition((int) CENTER_ALIGNMENT);
        integrationButton.setBounds(25, 280, 75, 50);

        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(null);
        rightPanel.setBounds(550, 60, 150, 393);
        rightPanel.setBackground(backgroundColor);
        rightPanel.add(divisionButton);
        rightPanel.add(derivativeButton);
        rightPanel.add(integrationButton);
        contentPanel.add(rightPanel);

        nameLabel = new JLabel();
        nameLabel.setFont(labelFont);
        nameLabel.setHorizontalTextPosition((int) CENTER_ALIGNMENT);
        nameLabel.setForeground(Color.BLACK);
        nameLabel.setText("Crecan Dragos");
        nameLabel.setBounds(50, 10, 200, 40);

        groupLabel = new JLabel();
        groupLabel.setForeground(Color.BLACK);
        groupLabel.setText("30223");
        groupLabel.setFont(labelFont);
        groupLabel.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        groupLabel.setBounds(500, 10, 100, 40);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setBounds(0, 451, 684, 393);
        bottomPanel.setLayout(null);
        bottomPanel.setBackground(backgroundColor);
        bottomPanel.add(nameLabel);
        bottomPanel.add(groupLabel);
        contentPanel.add(bottomPanel);

        this.setVisible(true);
    }

    /**
     * Se adauga un action listener butonului corespuncator operatiei de adunare
     * @param actionListener
     */

    public void setAdditonButtonActionListener(ActionListener actionListener) {
        additonButton.addActionListener(actionListener);
    }

    /**
     * Se adauga un action listener butonului corespuncator operatiei de scadere
     * @param actionListener
     */

    public void setSubtractionButtonActionListener(ActionListener actionListener) {
        subtractionButton.addActionListener(actionListener);
    }

    /**
     * Se adauga un action listener butonului corespuncator operatiei de inmultire
     * @param actionListener
     */

    public void setMultiplicationButtonActionListener(ActionListener actionListener) {
        multiplicationButton.addActionListener(actionListener);
    }

    /**
     * Se adauga un action listener butonului corespuncator operatiei de impartire
     * @param actionListener
     */

    public void setDivisionButtonActionListener(ActionListener actionListener) {
        divisionButton.addActionListener(actionListener);
    }

    /**
     * Se adauga un action listener butonului corespuncator operatiei de derivare
     * @param actionListener
     */

    public void setDerivativeButtonActionListener(ActionListener actionListener) {
        derivativeButton.addActionListener(actionListener);
    }

    /**
     * Se adauga un action listener butonului corespuncator operatiei de integrare
     * @param actionListener
     */

    public void setIntegrationButtonActionListener(ActionListener actionListener) {
        integrationButton.addActionListener(actionListener);
    }

    /**
     * Se adauga un action listener butonului corespuncator operatiei de curatare a datelor introduse
     * @param actionListener
     */

    public void setClearButtonActionListener(ActionListener actionListener) {
        clearButton.addActionListener(actionListener);
    }

    /**
     * Se adauga un action listener butonului de submit
     * @param actionListener
     */

    public void setSubmitButton(ActionListener actionListener) {
        submitButton.addActionListener(actionListener);
    }

    /**
     * Metoda va returna eticheta care indica ce operatoie a selectat utilizatorul, pentru a putea fi modificata in functie operatiile selectate ulterior
     * @return
     */

    public static JLabel getOperationLabel() {
        return operationLabel;
    }

    /**
     * Se returneaza eticatea primului polinom, pentru a-i putea fi setata vizibilitatea in functie de operatia selectata
     * @return
     */

    public static JLabel getFirstPoliLabel() {
        return firstPoliLabel;
    }

    /**
     * Metoda returenaza campul in care utilizatorul va introduce primul polinom
     * @return
     */

    public static JTextField getFirstPoliTextField() {
        return firstPoliTextField;
    }

    /**
     * Metoda returneza eticheta ce reprezinta simbolul matematic al operatiei selectate, se modifica de la o operatie la alata
     * @return
     */

    public static JLabel getOperationSymbolLabel() {
        return operationSymbolLabel;
    }

    /**
     * Se returneaza eticheta celui de-al doilea polinom, pentru a-i fi setata vizibilitatea in functie de operatia selectata
     * @return
     */

    public static JLabel getSecondPoliLabel() {
        return secondPoliLabel;
    }

    /**
     * Metoda returneaza campul in care utilizatorul intorcude cel de-al doilea polinom
     * @return
     */

    public static JTextField getSecondPoliTextField() {
        return secondPoliTextField;
    }

    /**
     * Se returneza eticheata corespunzatooare rezultatului operatiei dorite
     * @return
     */

    public static JLabel getResultLabel() {
        return resultLabel;
    }

    /**
     * Metdoa returneza campul in care este generat automat rezultatul operatiei, la apasarea butonului de submit, nu poate fi modificat manual de catre utilizator
     * @return
     */

    public static JTextField getResultTextField() {
        return resultTextField;
    }

    /**
     * Metoda va returna butonul pentru resetarea datelor introduse pentru a avea control aspura vizibilitatii acestuia
     * @return
     */

    public static JButton getClearButton() {
        return clearButton;
    }

    /**
     * Metoda va returna butonul de Submit, pentru a avea control asupra vizibilitatii acestuia, el va fi vizibil doar cand utilizatorul va selecta o operatie
     * @return
     */

    public static JButton getSubmitButton() {
        return submitButton;
    }
}
