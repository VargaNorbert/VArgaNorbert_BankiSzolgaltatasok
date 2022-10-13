package hu.petrik.bankiszolgaltatasok;

public class HitelSzamla extends Szamla {
    private int hitelKeret;

    public HitelSzamla(Tulajdonos tulajdonos, int hitelKeret) {
        super(tulajdonos);
        this.hitelKeret = hitelKeret;
    }

    public int getHitelKeret() {
        return hitelKeret;
    }

    @Override
    public boolean kivesz(int osszeg) {

        if (super.getAktualisEgyenleg()-osszeg>=0-this.hitelKeret){
            super.aktualisEgyenleg-=osszeg;
            return true;
        }else{
            return false;
        }

    }
}
