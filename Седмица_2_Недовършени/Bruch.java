import java.util.Objects;

public class Bruch {
    public int getDivisor() {
        return divisor;
    }

    public int getDivident() {
        return divident;
    }

    public Bruch(int d1, int d2) {
        assert d2 !=0;
        divident = d1;
        divisor = d2;
        if (divisor < 0){
            divident = -divident;
            divisor = -divisor;
        }
        assert divisor > 0;
        assert divisor !=0;
    }

    public Bruch add(Bruch b) {
        int zaehler= divident*b.getDivisor()+ divisor* b.getDivident();
        int nenner = divisor* b.getDivisor();
        return new Bruch(zaehler,nenner);
    }
    public Bruch sub(Bruch b) {
        int zaehler= divident*b.getDivisor() - divisor* b.getDivident();
        int nenner = divisor* b.getDivisor();
        return new Bruch(zaehler,nenner);
    }
     public Bruch mul(Bruch b) {
        int zaehler = divident *b.getDivident();
        int nenner=divisor*b.getDivisor();
        return new Bruch(zaehler,nenner);
    }
    public Bruch div(Bruch b) {
        assert  b.getDivident() !=0 :"Durch 0 darf man nicht teilen!";
        int nenner= divisor* b.getDivident();
        int zaehler= divident * b.getDivisor();
        return new Bruch(zaehler,nenner);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bruch bruch = (Bruch) o;
        return divisor == bruch.divisor &&
                divident == bruch.divident;
    }

    @Override
    public int hashCode() {
        return Objects.hash(divisor, divident);
    }

    private int ggT(int a, int b) {

        int h;
        while(b != 0){
            h = a%b;
            a = b;
            b = h;
        }
        return a;

    }

    private int divisor;
    private int divident;

    public static void main(String[] args) {}
}