public class Getraenk { }

class AlkoholischesGetraenk extends  Getraenk{

    private double alkoholGehalt;

    public double getAlkoholGehalt(){return alkoholGehalt; }

    public void setAlkoholGehalt(double t){ alkoholGehalt=t; }


}

class Wein extends AlkoholischesGetraenk{
    //constructor
   Wein(){
       super();
   }
   private String Rebsorte;

   public String getRebSorte(){return Rebsorte;}
   public void setRebsorte(String r){Rebsorte=r;}

}

class Bier extends AlkoholischesGetraenk{
    //constructor
    Bier(){
        super();
    }
    private String Brauerei;

    public String getBrauerei(){return Brauerei;}
    public void setBrauerei(String r){Brauerei=r;}

}

class Whisky extends AlkoholischesGetraenk{
    //constructor
    Whisky(){
        super();
    }
    private String Distille;

    public String getDistille(){return Distille;}
    public void setDistille(String r){Distille=r;}

}

class AlkoholfreiesGetraenk extends Getraenk{

}

class Wasser extends AlkoholfreiesGetraenk{}

class Cola extends  AlkoholfreiesGetraenk{
    Cola(){
        super();
    }
    private double zucker;

    public double getZucker() {
        return zucker;
    }

    public void setZucker(double zucker) {
        this.zucker = zucker;
    }
}

class Saft extends  AlkoholfreiesGetraenk{
    Saft(){
        super();
    }

    private String obstSorte;

    public String getObstSorte() {
        return obstSorte;
    }

    public void setObstSorte(String obstSorte) {
        this.obstSorte = obstSorte;
    }
}