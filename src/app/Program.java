package app;

import allatok.Macska;
import allatok.Allat;
import allatok.Kutya;
import gepjarmuvek.Gepjarmu;
import gepjarmuvek.SzemelyAuto;
import gepjarmuvek.TeherAuto;
import sikidomok.Kor;
import sikidomok.Sikidom;
import sikidomok.Teglalap;

public class Program {

    public static void main(String[] args) {
        //allatok();
        //sikidomok();

        SzemelyAuto sz = new SzemelyAuto("Teszt Elek", "ABC-123");
        sz.szallitas();

        TeherAuto t = new TeherAuto("Gipsz Elek", "DEF-456");
        t.szallitas();

        String tSofor = t.getSoforNev();
        System.out.println(tSofor);

        System.out.println("\nTömböl:");
        Gepjarmu[] gepjarmuvek = {sz, t, new SzemelyAuto("Párkány", "QWE-789"), new TeherAuto("Matics", "ASD-135")};
        for (Gepjarmu gepjarmu : gepjarmuvek) {
            System.out.println("Sofőr: " + gepjarmu.getSoforNev() + ", rendszáma: " + gepjarmu.getRendszam() + ", szállít: " + gepjarmu.szallitas());
        }
    }

    private static void allatok() {
//        Allat allat = new Allat("?");
//        allat.eszik();

        //polimorfizmus
        Allat allatAkiKutya = new Kutya("KutyaAllat");

        Kutya k1 = new Kutya("Luna");
        System.out.println("Kuyta neve: " + k1.getNev());
        k1.eszik();
        k1.hangotAd();

        Kutya k2 = new Kutya("Lupi");
        System.out.println("Kuyta neve: " + k2.getNev());
        k2.eszik();
        k2.hangotAd();

        Macska m1 = new Macska("Frici");
        System.out.println("Macsak neve: " + m1.getNev());
        m1.eszik();
        m1.hangotAd();

        Kutya[] kutyak = {k1, k2, new Kutya("Luo")};
        Macska[] macskak = {m1, new Macska("Mou")};
        Allat[] allatok = {k1, m1, allatAkiKutya};//new Allat("allat1")

        System.out.println("Állatok:");
        for (Allat allat : allatok) {
            allat.eszik();
            allat.hangotAd();
        }
    }

    private static void sikidomok() {
        double sugar = 5;

        Kor k = new Kor(sugar);
        String sKor = "Kör";
        System.out.println(sKor + " kerülete: " + k.kerulet());
        System.out.println(sKor + " területe: " + k.terulet());

        double a = 4;
        double b = 5;

        Teglalap t = new Teglalap(a, b);
        String sTeglalap = "Téglalap";
        System.out.println(sTeglalap + " kerülete: " + t.kerulet());
        System.out.println(sTeglalap + " területe: " + t.terulet());

        System.out.println("Tömbböl");
        Sikidom[] sikidomok = {k, t, new Kor(3.14), new Teglalap(1, 2)};
        for (Sikidom sikidom : sikidomok) {
            System.out.println(sikidom.kerulet());
            System.out.println(sikidom.terulet());
            sikidom.teruletKiiro();
        }
    }
}
