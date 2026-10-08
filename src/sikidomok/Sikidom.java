package sikidomok;

public abstract class Sikidom {

    public abstract double terulet();

    public abstract double kerulet();

    public void teruletKiiro() {
        System.out.println("terulet: " + terulet());
    }
}
