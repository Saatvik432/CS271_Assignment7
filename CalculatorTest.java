import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(5, Calculator.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, Calculator.subtract(3, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, Calculator.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2, Calculator.divide(6, 3));
    }

    @Test
    public void testDivideByZero() {
        assertEquals(0, Calculator.divide(1, 0));
    }
}
