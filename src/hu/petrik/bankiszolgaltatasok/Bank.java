package hu.petrik.bankiszolgaltatasok;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Szamla> szamlaLista;

    public Bank() {
        this.szamlaLista= new ArrayList<>();
    }

    public Szamla szamlaNyitas(Tulajdonos tulajdonos,int hitelKeret){

        if (hitelKeret==0){
            MegtakaritasiSzamla szamla = new MegtakaritasiSzamla(tulajdonos);
            szamlaLista.add(szamla);
            return szamla;
        }else{
            HitelSzamla szamla= new HitelSzamla(tulajdonos,hitelKeret);
            szamlaLista.add(szamla);
            return szamla;
        }

    }

    public int getOsszegyenleg(Tulajdonos tulajdonos){
        int i=0;
        for(Szamla sz : szamlaLista){
            if (sz.getTulajdonos()==tulajdonos){
                i+=sz.getAktualisEgyenleg();
            }
        }

        return i;
    }

    public Szamla getLegnagyobbEgyenleguSzamla(Tulajdonos tulajdonos){
        int index=0;
        int max= szamlaLista.get(0).aktualisEgyenleg;
        for (int i = 1; i < szamlaLista.size(); i++) {
            if (szamlaLista.get(i).aktualisEgyenleg>max){
                max=szamlaLista.get(i).aktualisEgyenleg;
                index=i;
            }
        }

        return szamlaLista.get(index);
    }

    public long getOsszHitelkeret(){
        long ossz=0;
        for(Szamla sz : szamlaLista){
            if (sz instanceof HitelSzamla){
                ossz +=((HitelSzamla) sz).getHitelKeret();
            }
        }
        return ossz;
    }


}
