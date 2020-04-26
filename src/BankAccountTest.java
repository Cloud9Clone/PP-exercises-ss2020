import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount ba = new BankAccount(200);
    private BankAccount ba2 = new BankAccount(700);

    @Test
    void testWithdrawChecked() {
        assertEquals(false,ba.withdrawChecked());           //  Schreiben Sie außerdem einen Unit-Test, der die Einhaltung der Invariante in testWithdrawChecked prüft.
    }

    @Test
    void testWithdrawChecked2() throws Exception {
        assertEquals(true,ba2.withdrawChecked());
        Method m = ba2.getClass().getDeclaredMethod("subFromBalance", int.class);
        m.setAccessible(true);
        m.invoke(ba2,300);
        assertEquals(false,ba2.withdrawChecked());
    }
}