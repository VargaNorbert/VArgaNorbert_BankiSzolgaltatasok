package hu.petrik.bankiszolgaltatasok;

public class MegtakaritasSzamla extends Szamla{
    private double kamat;
    public static double alapKamat= 10;

    public MegtakaritasSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        this.kamat=alapKamat;
    }

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    @Override
    public boolean kivesz(int osszeg) {

        if (super.getAktualisEgyenleg()-osszeg>=0){
            this.aktualisEgyenleg-=osszeg;
            return true;
        }else{
            return false;
        }

    }

    public void kamatJovairas(){
       super.aktualisEgyenleg =(int) (super.aktualisEgyenleg*(1+(this.kamat/100)));
    }
}
