public class BruchTest {

    public static void main(String[] args) {

        Bruch Bruch1 = new Bruch(5,1);
        Bruch Bruch2 = new Bruch(5,-1);



        Bruch resultAdd=Bruch1.add(Bruch2);
        System.out.println(resultAdd.getDivident()+"/"+resultAdd.getDivisor());

        Bruch resultSub=Bruch1.sub(new Bruch(6,2));
        System.out.println(resultSub.getDivident()+"/"+resultSub.getDivisor());

        Bruch resultMul=Bruch1.mul(new Bruch(4,2));
        System.out.println(resultMul.getDivident()+"/"+resultMul.getDivisor());

        Bruch resultDiv=Bruch1.div(resultAdd);
        System.out.println(resultDiv.getDivident()+"/"+resultDiv.getDivisor());


    }
}
