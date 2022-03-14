import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class Calculator_functionsTest {
    public static Calculator_functions CalcOperations;

    @BeforeClass
    public static void setup(){CalcOperations = new Calculator_functions();}
    //Test case by Pravalika
    @Test
    public void test_multiply()
    {
        assertEquals(15,CalcOperations.multiply(5,5));
    }
    //Test case by kavya
    @Test
    public void test_cuberoot(){assertEquals(2.0,CalcOperations.cubeRoot(8.0),0.001);}
    //Test case by Rohith

    @Test
    public void test_division() { assertEquals(2, CalcOperations.division(12,6)); }
    // Test case passed by Ibrahim
    @Test
    public void test_sqrt() { assertEquals(3.0, CalcOperations.sqrt(9.0),0.001); }
}