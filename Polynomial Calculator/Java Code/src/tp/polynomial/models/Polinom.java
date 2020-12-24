package tp.polynomial.models;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Clasa polinom este reprezentarea unui polinom.
 * Orice polinom are doua elemenete carcateristice si anume gradul si o lista de coeficienti
 */

public class Polinom {

    private Integer grad;
    private ArrayList<Monom> monoms;

    public Polinom(ArrayList<Monom> monoms) {
        this.monoms = monoms;
        int max = 0;
        for (Monom monom : this.monoms) {
            if (monom.getExponent() > max) {
                max = monom.getExponent();
            }
        }
        this.grad = max;
    }

    /**
     * Constructorul fara parametri ai clasei polinom
     * Se initializeaza gradul acestuia cu 0 si se creaza o lista de monoame
     */

    public Polinom() {
        this.monoms = new ArrayList<Monom>();
        this.grad = 0;
    }

    /**
     * Aceasta functie seteaza gradul unui polinom la o valoare primita ca si parametru
     * @param grad
     */

    public void setGrad(Integer grad) {
        this.grad = grad;
    }

    /**
     * Metoda getGrad, fara parametrii, va returana o valoare intreaga reprezentand gradul polinomului care apeleaza metoda
     * @return
     */

    public Integer getGrad() {
        return this.grad;
    }

    /**
     * Aceasta metoda va inlocui lista de monoame ale polinomului cu noua lista primita ca si parametru la apelul metodei
     * @param monoms
     */

    public void setMonoms(ArrayList<Monom> monoms) {
        this.monoms = monoms;
    }

    /**
     * Metoda getMonoms, fara parametrii, va returna o lista de monoame ce reprezinta monaomele polinomului care apeleaza metoda
     * @return
     */

    public ArrayList<Monom> getMonoms() {
        return this.monoms;
    }

    /**
     * Suprascrierea metodei toString() este folosita pentru a afisa polinomul in forma pe care developer-ul aplicatiei o doreste
     * @return
     */

    @Override
    public String toString() {
        String result = "";
        for (Monom monom : this.monoms) {
            if (monom.getCoeficeint() != 0) {
                if (monom.getExponent() != 0) {
                    if (monom.getCoeficeint() > 0) {
                        result = result + "+" + monom.toString();
                    } else {
                        result = result + monom.toString();
                    }
                } else {
                    if (monom.getCoeficeint() > 0) {
                        result = result + "+" + monom.getCoeficeint();
                    } else {
                        result = result + monom.getCoeficeint();
                    }
                }
            }
        }
        return result;
    }

    /**
     * Metoda createPolinom primeste ca si parametru un string, pe care il va compara cu o expresie de tip regex, pentru a modela input-ul sub forma stabilita (grad su lista de monaome)
     * @param string
     */

    public void createPolinom(String string) {
        Pattern pattern = Pattern.compile("([+-]?(?:(?:\\*x\\^\\d+)|(?:\\d+\\*x\\^\\d+)|(?:\\d+\\*x)|(?:\\d+)|(?:x)))");
        Matcher matcher = pattern.matcher(string);
        ArrayList<Monom> monoame = new ArrayList<>();
        int gradPolinomCreat = 0;
        while (matcher.find()) {
            String monomString = matcher.group(1);
            Monom monom = new Monom(0,0);
            monom.createMonom(monomString);
            if (monom.getExponent() > gradPolinomCreat) {
                gradPolinomCreat = monom.getExponent();
            }
            monoame.add(monom);
        }
        this.grad = gradPolinomCreat;
        this.monoms = monoame;
    }

    /**
     * Metoda getMonomByExponent, primeste ca si parametru o variabila Integer, reprezentand exponentul monomului pe care dorim sa il extragem din lista de monoame a polinomului.
     * Ea va returna monomul cu exponentul primit ca si parametru, sau in cazul incare acesta nu exista, va returna null
     * @param exponent
     * @return
     */

    public Monom getMonomByExponent(Integer exponent) {
        for (Monom monom : this.monoms) {
            if (monom.getExponent() == exponent) {
                return monom;
            }
        }
        return null;
    }

    /**
     * Functia addition primeste ca si paramatru un nou polinom si va efectua adunarea celor doua polinoame (cel care apeleaza functia si cel dat ca parametru)
     * Functia returneaza suma.
     *
     * @param polinom
     * @return
     */

    public Polinom add(Polinom polinom) {
        int intMaxGrad = 0;
        if (this.grad > polinom.grad) {
            intMaxGrad = this.grad;
        } else {
            intMaxGrad = polinom.grad;
        }
        int intAuxMaxGrad = intMaxGrad;
        ArrayList<Monom> monoame = new ArrayList<>();
        while (intAuxMaxGrad >= 0) {
            monoame.add(new Monom(0, intAuxMaxGrad));
            intAuxMaxGrad--;
        }
        Polinom additionResult = new Polinom(monoame);
        intAuxMaxGrad = intMaxGrad;
        while (intAuxMaxGrad >= 0) {
            for (Monom monom : this.monoms) {
                if (monom.getExponent() == intAuxMaxGrad) {
                    additionResult.monoms.set(intMaxGrad - intAuxMaxGrad, additionResult.monoms.get(intMaxGrad - intAuxMaxGrad).add(monom));
                }
            }
            for (Monom monom : polinom.monoms) {
                if (monom.getExponent() == intAuxMaxGrad) {
                    additionResult.monoms.set(intMaxGrad - intAuxMaxGrad, additionResult.monoms.get(intMaxGrad - intAuxMaxGrad).add(monom));
                }
            }
            intAuxMaxGrad--;
        }
        return additionResult;
    }

    /**
     * Functia subtraction va returna diferenta polinomul care apeleaza functia si polinomul primit ca si parametru al functiei
     *
     * @param polinom
     * @return
     */

    public Polinom subb(Polinom polinom) {
        int intMaxGrad = 0;
        if (this.grad > polinom.grad) {
            intMaxGrad = this.grad;
        } else {
            intMaxGrad = polinom.grad;
        }
        int intAuxMaxGrad = intMaxGrad;
        ArrayList<Monom> monoame = new ArrayList<>();
        while (intAuxMaxGrad >= 0) {
            monoame.add(new Monom(0, intAuxMaxGrad));
            intAuxMaxGrad--;
        }
        Polinom subtractionResult = new Polinom(monoame);
        intAuxMaxGrad = intMaxGrad;
        while (intAuxMaxGrad >= 0) {
            for (Monom monom : this.monoms) {
                if (monom.getExponent() == intAuxMaxGrad) {
                    subtractionResult.monoms.set(intMaxGrad - intAuxMaxGrad, subtractionResult.monoms.get(intMaxGrad - intAuxMaxGrad).add(monom));
                }
            }
            for (Monom monom : polinom.monoms) {
                if (monom.getExponent() == intAuxMaxGrad) {
                    subtractionResult.monoms.set(intMaxGrad - intAuxMaxGrad, subtractionResult.monoms.get(intMaxGrad - intAuxMaxGrad).subb(monom));
                }
            }
            intAuxMaxGrad--;
        }
        return subtractionResult;
    }

    /**
     * Metoda multiply este menita sa inmulteaza doua polinoame.
     * Ea primeste ca si parametru un nou polinom, pe care il va inmulti cu cel care apeleaza functia.
     * Rezultatul operatiei va fi stocat intr-un nou polinom, care va fi returnat.
     * @param polinom
     * @return
     */

    public Polinom multiply(Polinom polinom) {
        ArrayList<Monom> monoame = new ArrayList<>();
        for (int i = 0; i <= this.grad + polinom.grad; i++) {
            monoame.add(new Monom(0, this.grad + polinom.grad - i));
        }
        Polinom result = new Polinom(monoame);
        for (Monom monom1 : this.monoms) {
            for (Monom monom2 : polinom.monoms) {
                Integer previousCoeficeint = result.getMonomByExponent(monom1.getExponent() + monom2.getExponent()).getCoeficeint();
                result.getMonomByExponent(monom1.getExponent() + monom2.getExponent()).setCoeficeint(previousCoeficeint + monom1.getCoeficeint() * monom2.getCoeficeint());
            }
        }
        return result;
    }

    /*public String division(Polinom polinom) {
        return "Mai tarziu";
    }*/

    /**
     * Metoda derivation va deriva polinomul care o apelaza.
     * SE MODIFICA POLINOMUL CARE APELEAZA METODA
     * Se returneaza polinomul derivat.
     * @return
     */

    public Polinom derivation() {
        for (Monom monom : this.monoms) {
            if (monom.getExponent() == 0) {
                monom.setCoeficeint(0);
            } else {
                monom.setCoeficeint(monom.getCoeficeint() * monom.getExponent());
                monom.setExponent(monom.getExponent() - 1);
            }
        }
        return this;
    }

    /**
     * Metoda va returna un string ce reprezinta varianta integrata a polinomului care apeleaza metoda.
     * @return
     */

    public String integration() {
        String integrationResult = "";
        for (Monom monom : this.monoms) {
            if (monom.getCoeficeint() > 0) {
                integrationResult = integrationResult + "+(" + monom.getCoeficeint() + "/" + (monom.getExponent() + 1) + ")*x^" + (monom.getExponent() + 1);
            } else if (monom.getCoeficeint() < 0) {
                integrationResult = integrationResult + "(" + monom.getCoeficeint() + "/" + (monom.getExponent() + 1) + ")*x^" + (monom.getExponent() + 1);
            }
        }
        return integrationResult;
    }
}
