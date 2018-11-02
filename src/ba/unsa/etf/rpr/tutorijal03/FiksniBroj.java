package ba.unsa.etf.rpr.tutorijal03;

public enum Grad {

    Travnik {"030"},
    Orasje {"031"},
    Zenica {"032"},
    Sarajevo{"033"},
    Livno {"034"},
    Tuzla {"035"},
    Mostar{"036"},
    Bihać {"037"},
    Goražde {"038"},
    ŠirokiBrijeg {"039"},
    Brčko {"049"},
    MrkonjićGrad {"050"},
    BanjaLuka{"051"},
    Prijedor{"052"},
    Doboj{"053"},
    Šamac{"054"},
    Bijeljina{"055"},
    Zvornik	{"056"},
    Pale{"057"},
    Foča{"058"},
    Trebinje{"059"};

    private final String pozivni;

    Grad (String pozivni)
    {
        this.pozivni=pozivni;
    }

    public String getPozivni()
    {
        return pozivni;
    }



}


public class FiksniBroj extends  TelefonskiBroj {

    Grad grad;
    String broj;

   public FiksniBroj(Grad grad, String broj)
    {
       this.grad=grad;
       this.broj=broj;
    }


    public String Ispisi ()
    {

        String s= new String (grad.getPozivni()+"/"+ this.broj);
        return s;
    }

    public String hashCode ()
    {
        return (String) broj;
    }


}
