import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private final Main main=new Main();

    @org.junit.jupiter.api.Test
    void main() {
    }

    @org.junit.jupiter.api.Test
    void divideNumbers() {
        assertEquals(-1, main.divideNumbers(-6,6));
    }
}