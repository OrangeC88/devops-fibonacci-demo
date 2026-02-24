

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.example.Main;

public class MainTest {

    @Test
    void testFibonacciZero() {
        assertEquals(0, Main.fibonacci(0));
    }

    @Test
    void testFibonacciOne() {
        assertEquals(1, Main.fibonacci(1));
    }

    @Test
    void testFibonacciTen() {
        assertEquals(55, Main.fibonacci(10));
    }
}