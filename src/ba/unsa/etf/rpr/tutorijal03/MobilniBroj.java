package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj{

    int pozivni;
    String broj_telefona;


   public MobilniBroj(int mobilnaMreza, String broj)
    {
        this.pozivni=mobilnaMreza;
        this.broj_telefona=broj;

    }

    public String Ispisi ()
    {
       return (pozivni+"/"+broj_telefona);
    }
}
