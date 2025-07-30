package junitEx;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Junittest{

    Factorial fact = new Factorial();

    @Test
    public void testFactorialValidInputs() {
        assertEquals(1, fact.factorial(0));
        assertEquals(1, fact.factorial(1));
        assertEquals(2, fact.factorial(2));
        assertEquals(6, fact.factorial(3));
        assertEquals(24, fact.factorial(4));
        assertEquals(120, fact.factorial(5));
    }

    @Test
    
    public void testFactorialNegativeInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            fact.factorial(-1);
        });
        assertEquals("Negative numbers not allowed", exception.getMessage());
    }
}