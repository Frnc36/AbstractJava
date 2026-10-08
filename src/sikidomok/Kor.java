package sikidomok;

public class Kor extends Sikidom {

    private double sugar;

    public Kor(double sugar) {
        this.sugar = sugar;
    }

    @Override
    public double terulet() {
        return sugar * sugar * Math.PI;
    }

    @Override
    public double kerulet() {
        return 2 * sugar * Math.PI;
    }

}
