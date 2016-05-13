package io.akeredolu;

import static  io.akeredolu.Calculator.*;
import static  io.akeredolu.Display.*;

/**
 * Created by mikailaakeredolu on 5/10/16.
 */


/**
 * Display to user to get prompts
 */

public class Application {


    public void engine(){
        boolean flag = true;
        while(flag){
            int choice = promptUserForInt("\nPress (1) to add (2)subtract (3)multiple (4)divide (5) square \n(6) squareRoot (7)reset Memory (8)exponent (9)inverse (10)inverse the sign\n(11)natural Log (12)base10Log (13)Calculate Sine (14)ArcSin \n (15)ArcCos (16)ArcTan (17)Tan (18)M+ Key (19)Cosine (20)MRC \n(21)Factorial (30)switchDisplayMode (99)Clear(0)exit");
            switch(choice){
                case 1:
                    addNumbers();
                    break;
                case 2:
                    subtractNumbers();
                    break;
                case 3:
                    multiplyNumbers();
                    break;
                case 4:
                    divideNumbers();
                    break;
                case 5:
                   squareNumbers();
                    break;
                case 6:
                    squareRootNumbers();
                    break;
                case 7:
                    mCeeKeyResetsMemory();
                    break;
                case 8:
                    exponentOfNumber();
                    break;
                case 9:
                   inverseNumber();
                    break;
                case 10:
                    inverseTheSignNumber();
                    break;
                case 11:
                    naturalLogNumber();
                    break;
                case 12:
                    baseTenLogNumber();
                    break;
                case 13:
                    calculateSineNumber();
                    break;
                case 14:
                    inverseSineMethodNumber();
                    break;
                case 15:
                    inverseCosineNumber();
                    break;
                case 16:
                    inverseTangentNumber();
                    break;
                case 17:
                    calculateTangentNumber();
                    break;
                case 18:
                    memoryPlusKeyNumber();
                    break;
                case 19:
                    calculateCosineNumber();
                    break;
                case 20:
                  recallMemoryMRCKeyNumbers();
                    break;
                case 21:
                    factorialNumbers();
                case 30:
                    switchDisplay();

                case 99:
                    clearDisplay();
                    break;
                case 0:
                    promptUser("Good Bye...");
                    flag = false;
                    break;
            }
        }
    }

    /**
     * Display Current Memory and Value
     *   public void displayCurrentMemoryValue(){

     promptUser("The previous value is " + getDisplayedValue());
     }
     *
     */


    public void addNumbers(){
        double a = promptUserForDouble("Enter a number to Add to the currently displayed value");
        double num = add(a);
        promptUser("The addition is " + "= " + num);
    }

    public void subtractNumbers(){
        double a = promptUserForDouble("Enter a number to Subtract from currently displayed value");
        double num = subtract(a);
        promptUser("The difference is " + "= " + num);
    }

    public void multiplyNumbers(){
        double a = promptUserForDouble("Enter a number to Multiply by the currently displayed number");
        double num = multiply(a);
        promptUser("The product is " + "= " + num);
    }

    public void divideNumbers(){
        double a = promptUserForDouble("Enter a number to Divide the currently displayed number ");
        double num = divide(a);
        promptUser("The division is " + "= " + num);
    }


    public void squareNumbers(){
       promptUserForDouble("You just squared the currently displayed value and the result is " + square());
    }

    public void squareRootNumbers(){
      promptUserForDouble("You just calculated the square root of the currently displayed value and the result is " + squareRoot());
    }


    public void exponentOfNumber(){
        double a = promptUserForDouble("Enter a number to Calculate the exponent of currently displayed number ");
        double num = exponents(a);
        promptUser("The exponent of " +  a + " raised to the power of  " + a + " is = " + num);
    }

//inverseIt

    public  void inverseNumber(){
       promptUserForDouble(" You just did an inverse on the displayed number and the result is " + inverseIt());
    }

    public void inverseTheSignNumber(){
     promptUserForDouble("You just switched the currently displayed number to a  negative number and the result is " + invertSign());
    }

    public void naturalLogNumber(){
        promptUserForDouble("You just calculated the natural log of the number currently displayed and the result is " + naturalLog());

    }


    public void baseTenLogNumber(){
    promptUserForDouble("You just calculated the base10Log for existing number displayed and the result is " + baseTenLog());
    }


    public void calculateSineNumber(){
      promptUserForDouble("You just calculated the sine of the displayed value and the result is " + calculateSine());

    }

    public void calculateCosineNumber(){
        promptUserForDouble("You just calculated the Cosine of the displayed value and the result is " + calculateCosine());
    }

    public void inverseSineMethodNumber(){
        promptUserForDouble("You just did an inverse the Sine of the currently displayed value and the result is " + inverseSineMethod());
        //double num = inverseSineMethod();
        //promptUser("The inverse sine of  " + displayedValue + "is = " + num);
    }

    public void inverseCosineNumber(){
       promptUserForDouble("You have just reversed the Cosine of the displayed value and the result is " + inverseCosineMethod());
       // double num = inverseCosineMethod();
        //promptUser("The inverse of cosine " + displayedValue + "is = " + num);
    }

    public void inverseTangentNumber(){
     promptUserForDouble("You have just reversed the tangent of teh displayed value and the result is " + inverseTangent());
        //double num = inverseTangent();
        //promptUser("The inverse of tangent " + displayedValue +  " is = " + num);
    }

    public void calculateTangentNumber(){
     promptUserForDouble("Calculate the tangent of the displayed value and the result is " + calculateTangent());
        //double num = calculateTangent();
        //promptUser("The Tangent for "+ displayedValue + "is = " + num);
    }

    public void mCeeKeyResetsMemory(){
        promptUserForDouble("You have just reset memory to 0" + resetMemoryMCKey());
    }

    public void memoryPlusKeyNumber(){
        promptUserForDouble("you have stored the displayed value to memory " + memoryPlusKey(getDisplayedValue()));
       // double num = memo;
        //promptUser("The product is " + "= " + num);
    }

    public void recallMemoryMRCKeyNumbers(){
        promptUserForDouble("The store value in memory is : " + getMemory());
    }

    public void factorialNumbers(){
        promptUserForDouble("The factorial of the " + displayedValue + " is = " + factorial(displayedValue));
    }

    /**
     * Enum to switch modes
     */

    public enum calculatorModes{

        BINARY, OCTAL, DECIMAL, HEXADECIMAL
    }

    public  calculatorModes change = calculatorModes.BINARY;



    public  void switchDisplay()
    {

        switch (change)
        {
            case BINARY:
                System.out.println("You are in  "+ calculatorModes.DECIMAL + " mode");
                break;
            case DECIMAL:
                System.out.println(calculatorModes.OCTAL);
                break;
            case OCTAL:
                System.out.println(calculatorModes.HEXADECIMAL);
            default:
                System.out.println("You are in  "+ calculatorModes.DECIMAL + " mode");
        }

    }


    public void switchDisplay(String mode){
        promptUser("Enter binary, decimal,octal or hexadecimal to switch modes");
        switch (mode)
        {
            case "binary":
                System.out.println(calculatorModes.BINARY);
                break;
            case "decimal":
                System.out.println(calculatorModes.DECIMAL);
                break;
            case "octal":
                System.out.println(calculatorModes.OCTAL);
            case "hexadecimal":
                System.out.println(calculatorModes.HEXADECIMAL);
            default:
                System.out.println(calculatorModes.DECIMAL);
        }

    }


    /**
     *
     * MAIN to create object and call engine to run calculator
     */


    public static void main(String[] args){
        Application app = new Application();
        app.engine();
        //Display display = new Display();
        //app.switchDisplay();
        //app.switchDisplay(" ");
        //display.askForStringInput();

    }
}
