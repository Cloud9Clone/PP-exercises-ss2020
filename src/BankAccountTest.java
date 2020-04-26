import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testScenario1() {
        BankAccount ba = new BankAccount(200);
        ba.withdraw(100);
        ba.withdraw(200);
        ba.withdraw(500);
        assertEquals(0,ba.getBalance());
    }

    @Test
    void testScenario2() {
        BankAccount ba = new BankAccount(200);
        ba.withdraw(220);
        ba.withdraw(220);
        assertEquals(0,ba.getBalance());
    }

    @Test
    void testScenario3() {
        BankAccount ba = new BankAccount(200);
        ba.withdraw(220);
        ba.withdraw(460);
        ba.withdraw(180);
        assertEquals(0,ba.getBalance());
    }

    @Test
    void testScenario4(){
        BankAccount ba = new BankAccount();
        ba.withdraw(200);
        assertEquals(300,ba.getOverdraft());
    }

    @Test
    void testScenario5(){
        BankAccount ba = new BankAccount(200);
        ba.withdraw(400);
        ba.deposit(200);
        ba.withdraw(100);
        ba.withdraw(150);
        assertEquals(0,ba.getBalance());
    }

    @Test
    void testScenario6(){
        BankAccount ba = new BankAccount(500);
        ba.withdraw(500);
        ba.withdraw(500);
        assertEquals(0,ba.getBalance());
    }

}