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


}