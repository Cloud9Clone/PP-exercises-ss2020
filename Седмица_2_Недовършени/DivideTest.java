
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class DivideTest {

    @org.junit.jupiter.api.Test()
    void divide() {
       Divide o = new Divide();
        assertThrows(DivideByZeroException.class, ()-> o.divide(1,0));
    }
}