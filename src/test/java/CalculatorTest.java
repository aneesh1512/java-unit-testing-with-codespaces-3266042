import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        int expected = 3;

        int actual = calculator.add(1, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void testSub() {
        int expected = -1;
        int actual = calculator.subtract(3, 4);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply() {
        int expected = 4;
        int actual = calculator.multiply(2, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void testDiv() {
        // int expected = 0;
        // int actual = calculator.divide(0, 0);

        assertThrows(ArithmeticException.class, () -> calculator.divide(0, 0));
        // assertEquals(expected, actual);
    }

}
