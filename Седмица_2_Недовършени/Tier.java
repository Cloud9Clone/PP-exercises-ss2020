public class Tier { }

class Saugetier extends Tier{ }

class Vogel extends Tier{}

class Hund extends Saugetier{}
class Elefant extends Saugetier{}

class Kaefig <T>{
    private T tier;

    public T getTier(){
        return this.tier;
    }

    public void set(T t1){
        this.tier=t1;
    }

    public static void main(String args[]){
        //cages
        Kaefig <Hund> cage1 = new Kaefig<>();
        Kaefig <Vogel> cage2 = new Kaefig<>();
        Kaefig <Elefant> cage3 = new Kaefig<>();

        Kaefig <Saugetier> cage4 = new Kaefig<>();

        //Animals
        Hund dog = new Hund();
        Elefant el = new Elefant();
        Vogel bird = new Vogel();
        Hund doggy = new Hund();



        cage1.set(dog);
        cage2.set(bird);
        cage3.set(el);
        cage4.set(doggy);


    }

}