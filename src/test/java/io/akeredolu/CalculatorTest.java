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
        int expected = 4;
        int actual = add(2,2);
        assertEquals("Adding the values of 2 plus 2", expected, actual);
    }

    @Test
    public void subtractTest(){
        int expected = 4;
        int actual = subtract(6,2);
        assertEquals("Subtracting the values of 2 plus 2", expected, actual);
    }

    @Test
    public void multiplyTest(){
        int expected = 4;
        int actual = multiply(2,2);
        assertEquals("Multiplying the values of 2 plus 2", expected, actual);
    }

    @Test
    public void divideTest(){
        double expected = 2.5;
        double actual = divide(5,2);
        assertEquals(expected, actual,0.1);
    }

    @Test
    public void squareTest(){
        double expected = 16.0;
        double actual = square(4.0);
        assertEquals(expected, actual,0.1);
    }

    @Test
    public void squareRootTest(){
        double expected = 9.0;
        double actual = squareRoot(81.0);
        assertEquals(expected, actual,0.1);
    }

    @Test
    public void exponentsTest(){
        double expected = 8.0;
        double actual = exponents(2.0,3.0);
        assertEquals(expected, actual,0.1);
    }


    @Test
    public void inverseItTest(){
        double expected = .25;
        double actual = inverseIt(4.0);
        assertEquals(expected, actual,0.1);
    }

    //invertTheNumber
    @Test
    public void invertTheSignTest(){
        double expected = -4.0;
        double actual =  invertSign(4.0);
        assertEquals(expected, actual,0.1);
    }

    //calculateLog
    @Test
    public void naturalLogTest(){
        double expected = 2.302585092994046;
        double actual = naturalLog(10.0);
        assertEquals(expected, actual,0.1);
    }

    //baseTenLog

    @Test
    public void baseTenLogTest(){
        double expected = 1;;
        double actual = baseTenLog(10.0);
        assertEquals(expected, actual,0.1);
    }

    //calculateSine

    @Test
    public void calculateSineTest(){
        double expected = 0.7071067811865475;
        double actual = calculateSine(45.0);
        assertEquals(expected, actual,1e-9);
    }

    //inverseSineMethod
    @Test
    public void inverseSineMethodTest(){
        double expected = 90.0;
        double actual = inverseSineMethod(1.0);
        assertEquals(expected, actual,1e-9);
    }

    //inverseCosineMethod

    @Test
    public void inverseCosineMethodTest(){
        double expected = 45.0;
        double actual = inverseCosineMethod(0.7071);
        assertEquals(expected, actual,1e-9);
    }

    //inverseTangent
    @Test
    public void inverseTangentMethodTest(){
        double expected = 45.0;
        double actual = inverseTangent(1);
        assertEquals(expected, actual,0.1);
    }

    //calculateTangent

    @Test
    public void calculateTangentTest(){
        double expected = 1.0;
        double actual = inverseTangent(45.0);
        assertEquals(expected, actual,1e-9);
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
