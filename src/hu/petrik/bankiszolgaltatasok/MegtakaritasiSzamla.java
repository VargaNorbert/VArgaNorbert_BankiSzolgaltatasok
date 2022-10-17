package hu.petrik.bankiszolgaltatasok;

public class MegtakaritasiSzamla extends Szamla{
    private double kamat;
    public static double alapKamat= 110;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
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
       super.aktualisEgyenleg =(int) (super.aktualisEgyenleg*(this.kamat/100));
    }
}
