package gepjarmuvek;

public class TeherAuto extends Gepjarmu {

    public TeherAuto(String soforNev, String rendszam) {
        super(soforNev, rendszam);
    }

    @Override
    public void szallitas() {
        System.out.println("Árukat szállít");
    }
    
    
}
