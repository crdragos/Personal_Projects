package tp.polynomial.controllers;

import tp.polynomial.views.PolynomialFrame;

/**
 * Controller-ul principal al aplicatiei va deschide GUI-ul aplicatiti in care utilizatorul va putea introduce polinoame si va putea efectua operatii pe polinoame.
 */

public class MainController {
    public static void main(String[] args) {

        new PolynomialController(new PolynomialFrame());

    }
}
