import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calc;

    @Before
    public void before(){
        calc  = new Calculator();
    }

    @Test
    public void canAddTwoNumbers(){
        int result = calc.add(4,5);
        assertEquals(9, result);
    }

    @Test
    public void canSubtractTwoNumbers(){
        int result = calc.subtract(5,4);
        assertEquals(1, result);
    }

    @Test
    public void canMultiplyTwoNumbers(){
        int result = calc.multiply(5,4);
        assertEquals(20, result);
    }

    @Test
    public void canDivideTwoNumbers(){
        double result = calc.divide(20.0, 5.0);
        assertEquals(4.0, result, 0.0);
    }
}
