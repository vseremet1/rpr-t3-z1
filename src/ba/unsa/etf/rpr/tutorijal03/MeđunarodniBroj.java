package ba.unsa.etf.rpr.tutorijal03;

public class MeđunarodniBroj extends  TelefonskiBroj{

    String drzava, broj_telefona;
   public MeđunarodniBroj (String drzava, String broj)
   {
       this.drzava=drzava;
       this.broj_telefona=broj;
   }

   public String Ispisi ()
   {
       return (drzava+"/"+broj_telefona);
   }
}
