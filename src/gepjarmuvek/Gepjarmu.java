package gepjarmuvek;

public abstract class Gepjarmu {
    private String soforNev;
    private String rendszam;

    public Gepjarmu(String soforNev, String rendszam) {
        this.soforNev = soforNev;
        this.rendszam = rendszam;
    }

    public String getSoforNev() {
        return soforNev;
    }

    public String getRendszam() {
        return rendszam;
    }
    
    public abstract void szallitas();
    
}
