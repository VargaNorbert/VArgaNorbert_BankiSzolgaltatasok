package hu.petrik.bankiszolgaltatasok;

public class Main {
    public static void main(String[] args) {
        Bank OTP = new Bank();
        Tulajdonos t1 = new Tulajdonos("Teszt Elek");
        Tulajdonos t2 = new Tulajdonos("Gipsz Jakab");

        MegtakaritasSzamla szamla =(MegtakaritasSzamla)  OTP.szamlaNyitas(t2,0);
        HitelSzamla szamla2 = (HitelSzamla) OTP.szamlaNyitas(t1,150000);

        szamla.befizet(10000);

        szamla2.befizet(200000);

        System.out.println(szamla.aktualisEgyenleg);

        szamla.kamatJovairas();

        System.out.println(OTP.getOsszegyenleg(t1));
        OTP.getLegnagyobbEgyenleguSzamla(t2);


    }
}
