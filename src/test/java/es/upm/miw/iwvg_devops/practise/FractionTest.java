package es.upm.miw.iwvg_devops.practise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {

    @Test
    void testGetNumerator() {
        Fraction testFraction = new Fraction(8, 5);
        assertEquals(8, testFraction.getNumerator());
    }

    @Test
    void testGetDenominator() {
        Fraction testFraction = new Fraction(8, 5);
        assertEquals(5, testFraction.getDenominator());
    }

    @Test
    void testSetNumerator() {
        Fraction testFraction = new Fraction(8, 5);
        testFraction.setNumerator(9);
        assertEquals(9, testFraction.getNumerator());
    }

    @Test
    void testSetDenominator() {
        Fraction testFraction = new Fraction(8, 5);
        testFraction.setDenominator(4);
        assertEquals(4, testFraction.getDenominator());
    }

    @Test
    void testDecimal() {
        Fraction testFraction = new Fraction(8, 5);
        assertEquals(1.6, testFraction.decimal(), 10e5);
    }

    @Test
    void testAdd() {
        Fraction testFraction = new Fraction(8, 5);
        Fraction inputFraction = new Fraction(4, 6);
        assertEquals(68, testFraction.add(inputFraction).getNumerator());
        assertEquals(30, testFraction.add(inputFraction).getDenominator());
    }


    @Test
    void testMultiply() {
        Fraction testFraction = new Fraction(8, 5);
        Fraction inputFraction = new Fraction(4, 6);
        assertEquals(32, testFraction.multiply(inputFraction).getNumerator());
        assertEquals(30, testFraction.multiply(inputFraction).getDenominator());

    }

    @Test
    void testDivide() {
        Fraction testFraction = new Fraction(8, 5);
        Fraction inputFraction = new Fraction(4, 6);
        assertEquals(48, testFraction.divide(inputFraction).getNumerator());
        assertEquals(20, testFraction.divide(inputFraction).getDenominator());
    }

    @Test
    void testIsProper() {
        Fraction testFraction = new Fraction(8, 5);
        assertEquals(false, testFraction.isProper());
    }

    @Test
    void testIsImproper() {
        Fraction testFraction = new Fraction(8, 5);
        assertEquals(true, testFraction.isImproper());
    }

    @Test
    void testIsEquivalent() {
        Fraction testFraction = new Fraction(8, 5);
        Fraction inputFraction = new Fraction(4, 6);
        assertEquals(false, testFraction.isEquivalent(inputFraction));
    }


}