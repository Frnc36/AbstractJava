package gepjarmuvek;

public class SzemelyAuto extends Gepjarmu{

    public SzemelyAuto(String soforNev, String rendszam) {
        super(soforNev, rendszam);
    }
    
    @Override
    public void szallitas() {
        System.out.println("Személyeket szállít");
    }
    
}
