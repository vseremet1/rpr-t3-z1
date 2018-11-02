package ba.unsa.etf.rpr.tutorijal03;

import java.util.Set;

public class Program {

    public static  void main(String[] args)
    {
        Imenik telefonskiBrojevi= new Imenik ();
        ((Imenik) telefonskiBrojevi).dodaj("Suzana", "033/458-465");

        System.out.println ("Broj od Suzana je: " + ((Imenik) telefonskiBrojevi).dajBroj("Suzana"));

        Set<String> izGrada = telefonskiBrojevi.izGrada("Sarajevo");





    }



}
