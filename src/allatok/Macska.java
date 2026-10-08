package allatok;

public class Macska extends Allat {

    //private String nev;
    public Macska(String nev) {
        super(nev);
    }

//    public String getNev() {
//        return nev;
//    }
        //ezt is megörökölte a östtöl
//    public void eszik() {
//        //System.out.println(super.getNev() + " eszik: Nyam nyam"); //csak jobban olvasható
//        System.out.println(super.getNev() + " eszik: Nyam nyam");
//    }

    @Override
    public void hangotAd() {
        System.out.println(getNev() + " ugat: Nyá nyá");
    }
}
