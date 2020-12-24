package tp.polynomial.models;

/**
 * Reprezentarea in cod a unui monom
 * Atribute caracteristice: coeficientul si exponentu;
 */

public class Monom {

    private Integer coeficeint;
    private Integer exponent;

    public Monom(Integer coeficeint, Integer grad) {
        this.coeficeint = coeficeint;
        this.exponent = grad;
    }

    public Monom() {
        this.exponent = 0;
        this.coeficeint = 0;
    }

    /**
     * Aceasta metoda va returna o valoare Integer care reprezinta coeficientul monomului.
     * @return
     */

    public Integer getCoeficeint() {
        return this.coeficeint;
    }

    /**
     * Apelul metodei va seta coeficientul polinomului care o apeleaza, la valoare Integer primita ca si parametru.
     * @param coeficeint
     */

    public void setCoeficeint(Integer coeficeint) {
        this.coeficeint = coeficeint;
    }

    /**
     * Metoda va returna o valoare Integer, reprezentand exponentul monomului.
     * @return
     */

    public Integer getExponent() {
        return this.exponent;
    }

    /**
     * Apelul metodei va seta exponentului monomului care o apeleaza la valoarea Integer primita ca si parametru.
     * @param exponent
     */

    public void setExponent(Integer exponent) {
        this.exponent = exponent;
    }

    /**
     * Suprascrierea metodei toString este utilizita pentru a afisa monomul in forma pe care developer-ul aplicatiei si-o doreste.
     * @return
     */
    
    @Override
    public String toString() {
        if (this.coeficeint == 0) {
            return "";
        }
        if (this.exponent == 1) {
            return this.coeficeint + "x";
        }
        return this.coeficeint + "x^" + this.exponent;
    }

    /**
     * Metoda va prelua input-ul user-ului si va prelucara acest input pentru a aduce monomul la forma necesara viitoarelor operatii.
     * @param string
     */

    public void createMonom(String string) {
        if (string.indexOf('x') > 0) {
            if (string.indexOf('^') > 0) {
                this.coeficeint = Integer.parseInt(string.substring(0, string.indexOf('*')));
                this.exponent = Integer.parseInt(string.substring(string.indexOf('^') + 1));
            } else {
                this.coeficeint = Integer.parseInt(string.substring(0, string.indexOf('*')));
                this.exponent = 1;
            }
        } else {
            this.coeficeint = Integer.parseInt(string);
            this.exponent = 0;
        }
    }

    /**
     * Aceasta metoda va returna un nou monom, reprezentand suma a doua monaome sau null, in cazul in care celce doua monaome nu corespund cerintelor operatiei de adunare.
     * @param monom
     * @return
     */

    public Monom add(Monom monom) {
        if (this.exponent == monom.exponent) {
            Monom additionResult = new Monom(this.coeficeint + monom.coeficeint, this.exponent);
            return additionResult;
        }
        return null;
    }

    /**
     * Aceasta metoda va returna un nou monom, reprezentand diferenta a doua monaome sau null, in cazul in care celce doua monaome nu corespund cerintelor operatiei de scadere.
     * @param monom
     * @return
     */

    public Monom subb(Monom monom) {
        if (this.exponent == monom.exponent) {
            Monom subtractionResult = new Monom(this.coeficeint - monom.coeficeint, this.exponent);
            return subtractionResult;
        }
        return null;
    }
}
