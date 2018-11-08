package ba.unsa.etf.rpr.tutorijal03;

import java.util.Set;

public class Program {

    public static  void main(String[] args)
    {
        Imenik telefonskiBrojevi= new Imenik ();
        FiksniBroj fiksniBroj= new FiksniBroj(FiksniBroj.Grad.SARAJEVO, "456123" );
        ((Imenik) telefonskiBrojevi).dodaj("Suzana", fiksniBroj);

        System.out.println ("Broj od Suzana je: " + ((Imenik) telefonskiBrojevi).dajBroj("Suzana"));

        Set<String> izGrada = telefonskiBrojevi.izGrada(FiksniBroj.Grad.SARAJEVO);





    }



}
