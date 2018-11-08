package ba.unsa.etf.rpr.tutorijal03;

import java.util.Objects;

public class MedunarodniBroj extends  TelefonskiBroj{

   private  String drzava, broj_telefona;
   public MedunarodniBroj(String drzava, String broj)
   {
       this.drzava=drzava;
       this.broj_telefona=broj;
   }

   public String ispisi ()
   {
       return (drzava+"/"+broj_telefona);
   }
    @Override
    public int compareTo(TelefonskiBroj telefonskiBroj) {

        int i= this.ispisi().compareTo(telefonskiBroj.ispisi());
        return i;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MedunarodniBroj that = (MedunarodniBroj) o;
        return Objects.equals(drzava, that.drzava) &&
                Objects.equals(broj_telefona, that.broj_telefona);
    }

    @Override
    public int hashCode() {
        return Objects.hash(drzava, broj_telefona);
    }
}
