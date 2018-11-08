package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;


public class Imenik {


    private HashMap<String, TelefonskiBroj> telefonskiImenik = new HashMap<String, TelefonskiBroj>();



    public Imenik() {

    }

    public void dodaj(String ime, TelefonskiBroj brojTel) {
        telefonskiImenik.put(ime, brojTel);

    }

    public String dajBroj(String ime) {
        return (telefonskiImenik.get(ime).ispisi());
    }

    public String dajIme(TelefonskiBroj broj) {
        for (String key : telefonskiImenik.keySet())
            if (telefonskiImenik.get(key) == broj) return key;

        String s = "Broj se ne nalazi u imeniku!";  // Ok ?
        return s;
    }

    TreeSet<String> izGrada(FiksniBroj.Grad g) {


        TreeSet<String> skup = new TreeSet<String>();
        String pozivniBroj = g.getPozivni();


        for (String s : telefonskiImenik.keySet()) { // prolazimo for petljom kroz imenik

            // for (Map.Entry<String,Integer> pair: ocjene.entrySet())  // pair.getKey() i pair.getValue()


            // očitati cijeli broj iz mape
            TelefonskiBroj brojTelefona =  telefonskiImenik.get(s);
            // uzimamo brojTelefona za svakog u imeniku
            if (brojTelefona instanceof  FiksniBroj) {
                FiksniBroj fiksnibrojTelefona = (FiksniBroj) brojTelefona;

                if (pozivniBroj.equals(fiksnibrojTelefona.grad.getPozivni()))  // ako taj broj iz imenika ima isti pozivni g
                {
                    String ime = dajIme(brojTelefona);  // uzmi ime
                    skup.add(ime); // dodaj ime skupu
                }
            }



        }

        // Class Student  implements Comparable<Student>
        // mora se implementirati   public int compareTo (student other)
        // if (prosjek>other.prosjek) return -1 isto i za < i ==

        return skup;
    }


    Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g) {

        Set<TelefonskiBroj> skup = new TreeSet<TelefonskiBroj>();
        String pozivniBroj = g.getPozivni();

        for (String s : telefonskiImenik.keySet()) {

            TelefonskiBroj brojTelefona = telefonskiImenik.get(s); // uzima broj telefona iz imenika

            if (brojTelefona instanceof FiksniBroj) {

                if (pozivniBroj.equals( ((FiksniBroj) brojTelefona).grad.getPozivni() )) {
                    skup.add(telefonskiImenik.get(s));
                }
            }
        }

        return skup;
    }




    String naSlovo(char s) {

       String imePrezime="";
       char [] slova;
       int i=0;

       for (String s2: telefonskiImenik.keySet())
       {
           slova= s2.toCharArray();

           if (slova[0]==s){  i++;  imePrezime += i+". " + s2+ " - " + telefonskiImenik.get(s2)+ "\n";}


       }

    return imePrezime;
    }

}


