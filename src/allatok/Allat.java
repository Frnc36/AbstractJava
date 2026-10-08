package allatok;

public abstract class Allat {

    private String nev;

    public Allat(String nev) {
        //ellenőzés kell ide
        this.nev = nev;
    }

    public String getNev() {
        return nev;
    }

    public void eszik() {
        System.out.println(nev + " eszik: Nyam nyam");
    }
    //ha absract akkor nincsc törzse
    public abstract void hangotAd(); // { ; }//nem üres hanem így akarom hagyni, így jelölik
        //System.out.println("állat hangot ad");
    //}
}
