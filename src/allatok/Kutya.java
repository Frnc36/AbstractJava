package allatok;

public class Kutya extends Allat {

    //private String nev;

    public Kutya(String nev) {
        super(nev);//az ős a str paramétert váró konst. hívás
    }

//    public String getNev() {
//        return nev;
//    }

//    public void eszik() {
//        System.out.println(super.getNev() + " eszik: Nyam nyam");
//    }

    @Override
    public void hangotAd() {
        System.out.println(super.getNev() + " ugat: Vau vau");
    }

}
