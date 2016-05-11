package io.akeredolu;
import org.junit.Test;
import static  io.akeredolu.Calculator.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by mikailaakeredolu on 5/10/16.
 */
public class CalculatorTest {


    @Test
    public void addTest(){
        Calculator.displayedValue = 2.0;
        double expected = 4.0;
        double actual = add(2.0);
        assertEquals("Adding the values of 2 plus 0", expected, actual,.01);
    }

    @Test
    public void subtractTest(){
        Calculator.displayedValue = 4.0;
        double expected = 3.0;
        double actual = subtract(1.0);
        assertEquals("Subtracting the values of 1 from 2", expected, actual,.01);
    }

    @Test
    public void multiplyTest(){
        Calculator.displayedValue = 4.0;
        double expected = 8.0;
        double actual = multiply(2.0);
        assertEquals("Multiplying the values of 2 plus 2", expected, actual,.01);
    }

    @Test
    public void divideTest(){
        Calculator.displayedValue = 10.0;
        double expected = 2.0;
        double actual = divide(5.0);
        assertEquals(expected, actual,0.1);
    }

    @Test
    public void squareTest(){
        Calculator.displayedValue = 4.0;
        double expected = 16.0;
        double actual = square();
        assertEquals(expected, actual,0.1);
    }

    @Test
    public void squareRootTest(){
        Calculator.displayedValue = 81.0;
        double expected = 9.0;
        double actual = squareRoot();
        assertEquals(expected, actual,0.1);
    }

    @Test
    public void exponentsTest(){
        Calculator.displayedValue = 3.0;
        double expected = 8.0;
        double actual = exponents(2.0);
        assertEquals(expected, actual,0.1);
    }


    @Test
    public void inverseItTest(){
        Calculator.displayedValue = 1.0;
        double expected = .25;
        double actual = inverseIt();
        assertEquals(expected, actual,0.1);
    }

    //invertTheNumber
    @Test
    public void invertTheSignTest(){
        Calculator.displayedValue = 4.0;
        double expected = -4.0;
        double actual =  invertSign();
        assertEquals(expected, actual,0.1);
    }

    //calculateLog
    @Test
    public void naturalLogTest(){
        Calculator.displayedValue = 10.0;
        double expected = 2.302585092994046;
        double actual = naturalLog();
        assertEquals(expected, actual,0.1);
    }

    //baseTenLog

    @Test
    public void baseTenLogTest(){
        Calculator.displayedValue = 10.0;
        double expected = 1;
        double actual = baseTenLog();
        assertEquals(expected, actual,0.1);
    }

    //calculateSine

    @Test
    public void calculateSineTest(){
        double expected = 0.7071067811865475;
        double actual = calculateSine();
        assertEquals(expected, actual,1e-9);
    }

    //inverseSineMethod
    @Test
    public void inverseSineMethodTest(){
        double expected = 90.0;
        double actual = inverseSineMethod();
        assertEquals(expected, actual,1e-9);
    }

    //inverseCosineMethod

    @Test
    public void inverseCosineMethodTest(){
        double expected = 45.0;
        double actual = inverseCosineMethod();
        assertEquals(expected, actual,1e-9);
    }

    //inverseTangent
    @Test
    public void inverseTangentMethodTest(){
        double expected = 45.0;
        double actual = inverseTangent();
        assertEquals(expected, actual,0.1);
    }

    //calculateTangent

    @Test
    public void calculateTangentTest(){
        double expected = 1.0;
        double actual = calculateTangent();
        assertEquals(expected, actual,.01);
    }

    //memoryPlusKey

    @Test
    public void memoryPlusKeyTest(){
        double expected = 5.0;
        double actual = memoryPlusKey();
        assertEquals(expected, actual,1e-9);
    }

    //mCeeKey()

    @Test
    public void mCeeKeyTest(){
        double expected = 0.0;
        double actual = mCeeKey();
        assertEquals(expected, actual,1e-9);
    }




    /**
     * @Test
    public void mRcKeyTest(){
    double expected = 0.0;
    double actual = mRcKey();
    assertEquals(expected, actual,1e-9);
    }
     */
    //mRcKey()


}
