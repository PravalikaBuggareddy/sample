import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class Calculator_functionsTest {
    public static Calculator_functions CalcOperations;

    @BeforeClass
    public static void setup(){CalcOperations = new Calculator_functions();}

    @Test
    public void test_multiply(){
        assertEquals(20,CalcOperations.multiply(4,5));
    }

}