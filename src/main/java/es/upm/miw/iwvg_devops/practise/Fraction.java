package es.upm.miw.iwvg_devops.practise;


/**
 * Conceptos: Las fracciones propias son aquellas cuyo numerador es menor que el denominador
 * <p>
 * Las fracciones impropias son aquellas cuyo numerador es mayor que el denominador
 * <p>
 * Dos fracciones son equivalentes cuando el producto de extremos (numerador de la primera por denominador de la segunda) es igual al
 * producto de medios (denominador de la primera por el numerador de la segunda)
 * <p>
 * Las fracciones irreducibles son aquellas que no se pueden simplificar, esto sucede cuando el numerador y el denominador son primos entre
 * sí
 * <p>
 * Reducir varias fracciones a común denominador consiste en convertirlas en otras equivalentes que tengan el mismo denominador
 * <p>
 * Comparar fracciones
 * <p>
 * Suma fracciones: En primer lugar se reducen los denominadores a común denominador, y se suman o se restan los numeradores de las
 * fracciones equivalentes obtenidas
 * <p>
 * Multiplicación: La multiplicación de dos fracciones es otra fracción que tiene: Por numerador el producto de los numeradores. Por
 * denominador el producto de los denominadores.
 * <p>
 * La división de dos fracciones es otra fracción que tiene: Por numerador el producto de los extremos. Por denominador el producto de los
 * medios. Invertir fraccion
 */
public class Fraction {

    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public Fraction add(Fraction inputFraction) {
        Fraction addFraction = new Fraction();
        addFraction.denominator = this.denominator * inputFraction.denominator;
        addFraction.numerator = (addFraction.denominator / this.denominator * this.numerator)
                + (addFraction.denominator / inputFraction.denominator * inputFraction.numerator);
        return (addFraction);
    }


    public Fraction multiply(Fraction inputFraction) {
        Fraction multiplyFraction = new Fraction();
        multiplyFraction.denominator = this.denominator * inputFraction.denominator;
        multiplyFraction.numerator = this.numerator * inputFraction.numerator;
        return (multiplyFraction);
    }

    public Fraction divide(Fraction inputFraction) {
        Fraction divideFraction = new Fraction();
        divideFraction.denominator = this.denominator * inputFraction.numerator;
        divideFraction.numerator = this.numerator * inputFraction.denominator;
        return (divideFraction);
    }

    public boolean isProper() {
        return (this.numerator < this.denominator);

    }

    public boolean isImproper() {
        return (this.numerator >= this.denominator);

    }

    public boolean isEquivalent(Fraction inputFraction) {
        return (inputFraction.numerator * this.denominator == inputFraction.denominator * this.numerator);
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

}