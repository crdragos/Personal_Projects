package tp.polynomial.controllers;

import tp.polynomial.models.Polinom;
import tp.polynomial.views.PolynomialFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Clasa care controleza actiunile ce au loc atunci cand utilizatorul interactioneaza cu intefarata grafica a aplicatiei
 */

public class PolynomialController {

    /**
     * Constructorul primeste ca si parametru frame-ul ce contine toate butoanele, field-urile si label-urile necesare
     * @param frame
     */

    public PolynomialController(PolynomialFrame frame) {
        frame.setAdditonButtonActionListener(new AdditionButtonActionListener());
        frame.setSubtractionButtonActionListener(new SubtractionButtonActionListener());
        frame.setMultiplicationButtonActionListener(new MultiplicationButtonActionListener());
        frame.setDivisionButtonActionListener(new DivisionButtonActionListener());
        frame.setDerivativeButtonActionListener(new DerivatiteButtonActionListener());
        frame.setIntegrationButtonActionListener(new IntegrationButtonActionListener());
        frame.setClearButtonActionListener(new ClearButtonActionListener());
        frame.setSubmitButton(new SubmitButtonActionListener());
    }

    /**
     * Metoda descrie ceea ce se va intampla atunci cand este apasat butonul corespunzator operatiei de adunare.
     */

    private class AdditionButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            PolynomialFrame.getOperationLabel().setVisible(true);
            PolynomialFrame.getFirstPoliLabel().setVisible(true);
            PolynomialFrame.getFirstPoliTextField().setVisible(true);
            PolynomialFrame.getOperationSymbolLabel().setVisible(true);
            PolynomialFrame.getSecondPoliLabel().setVisible(true);
            PolynomialFrame.getSecondPoliTextField().setVisible(true);
            PolynomialFrame.getClearButton().setVisible(true);
            PolynomialFrame.getSubmitButton().setVisible(true);

            PolynomialFrame.getOperationLabel().setText("Addition");
            PolynomialFrame.getFirstPoliTextField().setText("");
            PolynomialFrame.getOperationSymbolLabel().setText("+");
            PolynomialFrame.getSecondPoliTextField().setText("");
            PolynomialFrame.getResultTextField().setText("");

            PolynomialFrame.getResultLabel().setVisible(false);
            PolynomialFrame.getResultTextField().setVisible(false);
        }
    }

    /**
     * Metoda descrie ce se va inatmpla atunci este apasat butonul corespunzator operatiei de scadere.
     */

    private class SubtractionButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            PolynomialFrame.getOperationLabel().setVisible(true);
            PolynomialFrame.getFirstPoliLabel().setVisible(true);
            PolynomialFrame.getFirstPoliTextField().setVisible(true);
            PolynomialFrame.getOperationSymbolLabel().setVisible(true);
            PolynomialFrame.getSecondPoliLabel().setVisible(true);
            PolynomialFrame.getSecondPoliTextField().setVisible(true);
            PolynomialFrame.getClearButton().setVisible(true);
            PolynomialFrame.getSubmitButton().setVisible(true);

            PolynomialFrame.getOperationLabel().setText("Subtraction");
            PolynomialFrame.getFirstPoliTextField().setText("");
            PolynomialFrame.getOperationSymbolLabel().setText("-");
            PolynomialFrame.getSecondPoliTextField().setText("");
            PolynomialFrame.getResultTextField().setText("");

            PolynomialFrame.getResultLabel().setVisible(false);
            PolynomialFrame.getResultTextField().setVisible(false);
        }
    }

    /**
     * Metoda descrie ce se va inatmpla atunci este apasat butonul corespunzator operatiei de inmultire.
     */

    private class MultiplicationButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            PolynomialFrame.getOperationLabel().setVisible(true);
            PolynomialFrame.getFirstPoliLabel().setVisible(true);
            PolynomialFrame.getFirstPoliTextField().setVisible(true);
            PolynomialFrame.getOperationSymbolLabel().setVisible(true);
            PolynomialFrame.getSecondPoliLabel().setVisible(true);
            PolynomialFrame.getSecondPoliTextField().setVisible(true);
            PolynomialFrame.getClearButton().setVisible(true);
            PolynomialFrame.getSubmitButton().setVisible(true);

            PolynomialFrame.getOperationLabel().setText("Multiplication");
            PolynomialFrame.getFirstPoliTextField().setText("");
            PolynomialFrame.getOperationSymbolLabel().setText("*");
            PolynomialFrame.getSecondPoliTextField().setText("");
            PolynomialFrame.getResultTextField().setText("");

            PolynomialFrame.getResultLabel().setVisible(false);
            PolynomialFrame.getResultTextField().setVisible(false);
        }
    }

    /**
     * Metoda descrie ce se va inatmpla atunci este apasat butonul corespunzator operatiei de impartire.
     */

    private class DivisionButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            PolynomialFrame.getOperationLabel().setVisible(true);
            PolynomialFrame.getFirstPoliLabel().setVisible(true);
            PolynomialFrame.getFirstPoliTextField().setVisible(true);
            PolynomialFrame.getOperationSymbolLabel().setVisible(true);
            PolynomialFrame.getSecondPoliLabel().setVisible(true);
            PolynomialFrame.getSecondPoliTextField().setVisible(true);
            PolynomialFrame.getClearButton().setVisible(true);
            PolynomialFrame.getSubmitButton().setVisible(true);

            PolynomialFrame.getOperationLabel().setText("Division");
            PolynomialFrame.getFirstPoliTextField().setText("");
            PolynomialFrame.getOperationSymbolLabel().setText("/");
            PolynomialFrame.getSecondPoliTextField().setText("");
            PolynomialFrame.getResultTextField().setText("");

            PolynomialFrame.getResultLabel().setVisible(false);
            PolynomialFrame.getResultTextField().setVisible(false);
        }
    }

    /**
     * Metoda descrie ce se va inatmpla atunci este apasat butonul corespunzator operatiei de derivare.
     */

    private class DerivatiteButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            PolynomialFrame.getOperationLabel().setVisible(true);
            PolynomialFrame.getFirstPoliLabel().setVisible(true);
            PolynomialFrame.getFirstPoliTextField().setVisible(true);
            PolynomialFrame.getOperationSymbolLabel().setVisible(true);
            PolynomialFrame.getClearButton().setVisible(true);
            PolynomialFrame.getSubmitButton().setVisible(true);

            PolynomialFrame.getOperationLabel().setText("Derivation");
            PolynomialFrame.getFirstPoliTextField().setText("");
            PolynomialFrame.getOperationSymbolLabel().setText("| '");
            PolynomialFrame.getSecondPoliTextField().setText("");
            PolynomialFrame.getResultTextField().setText("");

            PolynomialFrame.getResultLabel().setVisible(false);
            PolynomialFrame.getResultTextField().setVisible(false);
            PolynomialFrame.getSecondPoliLabel().setVisible(false);
            PolynomialFrame.getSecondPoliTextField().setVisible(false);
        }
    }

    /**
     * Metoda descrie ce se va inatmpla atunci este apasat butonul corespunzator operatiei de integrare.
     */

    private class IntegrationButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            PolynomialFrame.getOperationLabel().setVisible(true);
            PolynomialFrame.getFirstPoliLabel().setVisible(true);
            PolynomialFrame.getFirstPoliTextField().setVisible(true);
            PolynomialFrame.getOperationSymbolLabel().setVisible(true);
            PolynomialFrame.getClearButton().setVisible(true);
            PolynomialFrame.getSubmitButton().setVisible(true);

            PolynomialFrame.getOperationLabel().setText("Integration");
            PolynomialFrame.getFirstPoliTextField().setText("");
            PolynomialFrame.getOperationSymbolLabel().setText("S|'");
            PolynomialFrame.getSecondPoliTextField().setText("");
            PolynomialFrame.getResultTextField().setText("");

            PolynomialFrame.getResultLabel().setVisible(false);
            PolynomialFrame.getResultTextField().setVisible(false);
            PolynomialFrame.getSecondPoliLabel().setVisible(false);
            PolynomialFrame.getSecondPoliTextField().setVisible(false);
        }
    }

    /**
     * Metoda descrie ce se va inatmpla atunci este apasat butonul corespunzator operatiei de curatare a datelor introduse.
     */

    private class ClearButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            PolynomialFrame.getFirstPoliTextField().setText("");
            PolynomialFrame.getSecondPoliTextField().setText("");
            PolynomialFrame.getResultTextField().setText("");

            PolynomialFrame.getResultLabel().setVisible(false);
            PolynomialFrame.getResultTextField().setVisible(false);
        }
    }

    /**
     * Metoda descrie pe rand ce se va intampla la apasarea butonului Submit, in functie de operatia selectata de utilizator.
     */

    private class SubmitButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            PolynomialFrame.getResultLabel().setVisible(true);
            PolynomialFrame.getResultTextField().setVisible(true);
            PolynomialFrame.getResultTextField().setText("Result");

            /**
             * In cazul operatiei de adunare, se valideaza datele introduse, se creza celel doua polinome si se efectueaza operatia, rezultatul fiind vizibil in UI.
             * In cazul in care utilizatorul incearca sa transmita date gresite, operatia nu va fi efectuata, iar campul cu date gresite va fi colorat in rosu.
             */

            if (PolynomialFrame.getOperationLabel().getText().equals("Addition")) {
                String stringPolinom1 = PolynomialFrame.getFirstPoliTextField().getText();
                int counter = 0;
                Polinom polinom1 = new Polinom();
                try {
                    polinom1.createPolinom(stringPolinom1);
                    PolynomialFrame.getFirstPoliTextField().setBackground(Color.WHITE);
                } catch (Exception exception) {
                    PolynomialFrame.getFirstPoliTextField().setBackground(new Color(200, 76, 91));
                    counter++;
                } finally {
                    String stringPolinom2 = PolynomialFrame.getSecondPoliTextField().getText();
                    Polinom polinom2 = new Polinom();
                    try {
                        polinom2.createPolinom(stringPolinom2);
                        PolynomialFrame.getSecondPoliTextField().setBackground(Color.WHITE);
                    } catch (Exception exception) {
                        PolynomialFrame.getSecondPoliTextField().setBackground(new Color(200, 76, 91));
                        counter++;
                    } finally {
                        if (counter == 0) {
                            PolynomialFrame.getResultTextField().setText(polinom1.add(polinom2).toString());
                        } else {
                            PolynomialFrame.getResultTextField().setVisible(false);
                            PolynomialFrame.getResultLabel().setVisible(false);
                        }
                    }
                }
            }

            /**
             * In cazul operatiei de scadere, se valideaza datele introduse, se creza celel doua polinome si se efectueaza operatia, rezultatul fiind vizibil in UI.
             * In cazul in care utilizatorul incearca sa transmita date gresite, operatia nu va fi efectuata, iar campul cu date gresite va fi colorat in rosu.
             */

            if (PolynomialFrame.getOperationLabel().getText().equals("Subtraction")) {
                String stringPolinom1 = PolynomialFrame.getFirstPoliTextField().getText();
                int counter = 0;
                Polinom polinom1 = new Polinom();
                try {
                    polinom1.createPolinom(stringPolinom1);
                    PolynomialFrame.getFirstPoliTextField().setBackground(Color.WHITE);
                } catch (Exception exception) {
                    PolynomialFrame.getFirstPoliTextField().setBackground(new Color(200, 76, 91));
                    counter++;
                } finally {
                    String stringPolinom2 = PolynomialFrame.getSecondPoliTextField().getText();
                    Polinom polinom2 = new Polinom();
                    try {
                        polinom2.createPolinom(stringPolinom2);
                        PolynomialFrame.getSecondPoliTextField().setBackground(Color.WHITE);
                    } catch (Exception exception) {
                        PolynomialFrame.getSecondPoliTextField().setBackground(new Color(200, 76, 91));
                        counter++;
                    } finally {
                        if (counter == 0) {
                            PolynomialFrame.getResultTextField().setText(polinom1.subb(polinom2).toString());
                        } else {
                            PolynomialFrame.getResultTextField().setVisible(false);
                            PolynomialFrame.getResultLabel().setVisible(false);
                        }
                    }
                }
            }

            /**
             * In cazul operatiei de inmultire, se valideaza datele introduse, se creza celel doua polinome si se efectueaza operatia, rezultatul fiind vizibil in UI.
             * In cazul in care utilizatorul incearca sa transmita date gresite, operatia nu va fi efectuata, iar campul cu date gresite va fi colorat in rosu.
             */

            if (PolynomialFrame.getOperationLabel().getText().equals("Multiplication")) {
                String stringPolinom1 = PolynomialFrame.getFirstPoliTextField().getText();
                int counter = 0;
                Polinom polinom1 = new Polinom();
                try {
                    polinom1.createPolinom(stringPolinom1);
                    PolynomialFrame.getFirstPoliTextField().setBackground(Color.WHITE);
                } catch (Exception exception) {
                    PolynomialFrame.getFirstPoliTextField().setBackground(new Color(200, 76, 91));
                    counter++;
                } finally {
                    String stringPolinom2 = PolynomialFrame.getSecondPoliTextField().getText();
                    Polinom polinom2 = new Polinom();
                    try {
                        polinom2.createPolinom(stringPolinom2);
                        PolynomialFrame.getSecondPoliTextField().setBackground(Color.WHITE);
                    } catch (Exception exception) {
                        PolynomialFrame.getSecondPoliTextField().setBackground(new Color(200, 76, 91));
                        counter++;
                    } finally {
                        if (counter == 0) {
                            PolynomialFrame.getResultTextField().setText(polinom1.multiply(polinom2).toString());
                        } else {
                            PolynomialFrame.getResultTextField().setVisible(false);
                            PolynomialFrame.getResultLabel().setVisible(false);
                        }
                    }
                }
            }

            /**
             * In cazul operatiei de derivare, se valideaza datele introduse, se creza celel doua polinome si se efectueaza operatia, rezultatul fiind vizibil in UI.
             * In cazul in care utilizatorul incearca sa transmita date gresite, operatia nu va fi efectuata, iar campul cu date gresite va fi colorat in rosu.
             */

            if (PolynomialFrame.getOperationLabel().getText().equals("Derivation")) {
                String stringPolinom1 = PolynomialFrame.getFirstPoliTextField().getText();
                int counter = 0;
                Polinom polinom1 = new Polinom();
                try {
                    polinom1.createPolinom(stringPolinom1);
                    PolynomialFrame.getFirstPoliTextField().setBackground(Color.WHITE);
                } catch (Exception exception) {
                    PolynomialFrame.getFirstPoliTextField().setBackground(new Color(200, 76, 91));
                    counter++;
                } finally {
                        if (counter == 0) {
                            PolynomialFrame.getResultTextField().setText(polinom1.derivation().toString());
                        } else {
                            PolynomialFrame.getResultTextField().setVisible(false);
                            PolynomialFrame.getResultLabel().setVisible(false);
                        }
                }
            }

            /**
             * In cazul operatiei de integrare, se valideaza datele introduse, se creza celel doua polinome si se efectueaza operatia, rezultatul fiind vizibil in UI.
             * In cazul in care utilizatorul incearca sa transmita date gresite, operatia nu va fi efectuata, iar campul cu date gresite va fi colorat in rosu.
             */

            if (PolynomialFrame.getOperationLabel().getText().equals("Integration")) {
                String stringPolinom1 = PolynomialFrame.getFirstPoliTextField().getText();
                int counter = 0;
                Polinom polinom1 = new Polinom();
                try {
                    polinom1.createPolinom(stringPolinom1);
                    PolynomialFrame.getFirstPoliTextField().setBackground(Color.WHITE);
                } catch (Exception exception) {
                    PolynomialFrame.getFirstPoliTextField().setBackground(new Color(200, 76, 91));
                    counter++;
                } finally {
                    if (counter == 0) {
                        PolynomialFrame.getResultTextField().setText(polinom1.integration());
                    } else {
                        PolynomialFrame.getResultTextField().setVisible(false);
                        PolynomialFrame.getResultLabel().setVisible(false);
                    }
                }
            }
        }
    }
}
