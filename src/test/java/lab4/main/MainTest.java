package lab4.main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    Main main;

    @BeforeEach
    void setUp() {
        main = new Main();
    }

    @Test
    void testMySqrt() {
        double x = 2.0;
        double expected = 1.4142;
        double result = main.mySqrt(x);
        assertEquals(expected, result, 1e-4);
    }
}