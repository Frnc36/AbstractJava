package sikidomok;

public class Teglalap extends Sikidom {

    private double a;
    private double b;

    public Teglalap(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public double terulet() {
        return a * b;
    }

    @Override
    public double kerulet() {
        return (a + b) * 2;
    }
}
