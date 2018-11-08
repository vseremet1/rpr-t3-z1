package ba.unsa.etf.rpr.tutorijal03;

import java.util.Objects;

public class MobilniBroj extends TelefonskiBroj{

    private int pozivni;
    private String broj_telefona;


   public MobilniBroj(int mobilnaMreza, String broj)
    {
        this.pozivni=mobilnaMreza;
        this.broj_telefona=broj;

    }

    @Override
    public int compareTo(TelefonskiBroj telefonskiBroj) {

      int i= this.ispisi().compareTo(telefonskiBroj.ispisi());
return i;


            }

    public String ispisi ()
    {
       return (pozivni+"/"+broj_telefona);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MobilniBroj that = (MobilniBroj) o;
        return pozivni == that.pozivni &&
                Objects.equals(broj_telefona, that.broj_telefona);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pozivni, broj_telefona);
    }

    @Override
    public String toString ()
    {


        String s= pozivni+ "";


        if (s.length()== 1 ) s="00"+s;
        if (s.length()==2) s="0"+s;

        return s +"/" +broj_telefona;

    }
}
