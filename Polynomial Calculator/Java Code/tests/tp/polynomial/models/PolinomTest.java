package tp.polynomial.models;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PolinomTest {

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() {
        String stringPolinom1 = "6*x^2+2*x^1+1";
        String stringPolinom2 = "1*x^3-5*x^1+4";
        Polinom polinom1 = new Polinom();
        Polinom polinom2 = new Polinom();
        polinom1.createPolinom(stringPolinom1);
        polinom2.createPolinom(stringPolinom2);
        Assert.assertTrue(polinom1.add(polinom2).toString().equals("+1x^3+6x^2-3x+5"));
    }

    @Test
    public void subb() {
        String stringPolinom1 = "6*x^2+2*x^1+1";
        String stringPolinom2 = "1*x^3-5*x^1+4";
        Polinom polinom1 = new Polinom();
        Polinom polinom2 = new Polinom();
        polinom1.createPolinom(stringPolinom1);
        polinom2.createPolinom(stringPolinom2);
        Assert.assertTrue(polinom1.subb(polinom2).toString().equals("-1x^3+6x^2+7x-3"));
    }

    @Test
    public void multiply() {
        String stringPolinom1 = "6*x^2+2*x^1+1";
        String stringPolinom2 = "1*x^3-5*x^1+4";
        Polinom polinom1 = new Polinom();
        Polinom polinom2 = new Polinom();
        polinom1.createPolinom(stringPolinom1);
        polinom2.createPolinom(stringPolinom2);
        Assert.assertTrue(polinom1.multiply(polinom2).toString().equals("+6x^5+2x^4-29x^3+14x^2+3x+4"));
    }

    @Test
    public void derivation() {
        String stringPolinom1 = "6*x^4+5*x^2+2*x+2";
        Polinom polinom1 = new Polinom();
        polinom1.createPolinom(stringPolinom1);
        Assert.assertTrue(polinom1.derivation().toString().equals("+24x^3+10x+2"));
    }

    @Test
    public void integration() {
        String stringPolinom1 = "6*x^4+5*x^2+2*x+2";
        Polinom polinom1 = new Polinom();
        polinom1.createPolinom(stringPolinom1);
        Assert.assertTrue(polinom1.integration().equals("+(6/5)*x^5+(5/3)*x^3+(2/2)*x^2+(2/1)*x^1"));
    }
}