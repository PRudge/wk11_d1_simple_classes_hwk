
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before(){
        this.calculator = new Calculator(4, 2);
    }

    @Test
    public void hasFirstNum() {
        assertEquals(4, calculator.getFirstNum());
    }

    @Test
    public void hasSecondNum() {
        assertEquals(2, calculator.getSecondNum());
    }

    @Test
    public void canAdd(){
        assertEquals(6, calculator.add());
    }

    @Test
    public void canSubtract(){
        assertEquals(2, calculator.subtract());
    }

    @Test
    public void canMultiply(){
        assertEquals(8, calculator.multiply());
    }

    @Test
    public void canDivide(){
        assertEquals(2, calculator.divide());
    }


}
