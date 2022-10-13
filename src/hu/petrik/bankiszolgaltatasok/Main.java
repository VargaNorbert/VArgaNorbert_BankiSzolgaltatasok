package hu.petrik.bankiszolgaltatasok;

public class Main {
    public static void main(String[] args) {
        Bank OTP = new Bank();
        Tulajdonos t1 = new Tulajdonos("Teszt Elek");
        Tulajdonos t2 = new Tulajdonos("Gipsz Jakab");

        OTP.szamlaNyitas(t1,150000);
        OTP.szamlaNyitas(t2,150000);

        System.out.println(OTP.getOsszegyenleg(t1));
    }
}
