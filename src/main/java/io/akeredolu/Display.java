package io.akeredolu;

import java.util.Scanner;

import static io.akeredolu.Calculator.*;
import static io.akeredolu.Calculator.displayedValue;
import static io.akeredolu.Calculator.factorial;

/**
 * Created by mikailaakeredolu on 5/10/16.
 */
public class Display {

    /**
     * Declaration of Enums to switch display modes
     */
  //  public double degrees;
    public Display.calculatorModes defaultMode = Display.calculatorModes.BINARY;
    Display.calculatorModes currentMode = defaultMode;

    public enum calculatorModes{

        BINARY, OCTAL, DECIMAL, HEXADECIMAL
    }


    public  void switchDisplay()
    {

        switch (currentMode)
        {
            case BINARY:
                System.out.println("You are in  "+ Display.calculatorModes.DECIMAL + " mode");
                currentMode = Display.calculatorModes.DECIMAL;
                break;
            case DECIMAL:
                System.out.println(Display.calculatorModes.OCTAL);
                currentMode = Display.calculatorModes.OCTAL;
                break;
            case OCTAL:
                System.out.println(Display.calculatorModes.HEXADECIMAL);
                currentMode = Display.calculatorModes.HEXADECIMAL;
                break;
            case HEXADECIMAL:
                System.out.println("You are in  "+ Display.calculatorModes.BINARY + " mode");
                currentMode = Display.calculatorModes.BINARY;
                break;
            default:
                System.out.println("You are in  "+ Display.calculatorModes.DECIMAL + " mode");
        }

    }

    /**
     * Overloaded switch display mode method to ask user for choice of diaply mode and calculate mode
     */

    public void switchDisplay(String mode){
        Scanner input = new Scanner(System.in);
        System.out.println("enter a mode such as | binary | decimal | octal | hexadecimal ");
        mode = input.nextLine();
        switch (mode)
        {
            case "binary":
                System.out.println("You are now in " + Display.calculatorModes.BINARY + " Mode and the binary of " + displayedValue + " is = " +  Integer.toBinaryString(binaryConverter()));
                break;
            case "decimal":
                System.out.println("You are now in " + Display.calculatorModes.DECIMAL + "Mode");
                break;
            case "octal":
                System.out.println("You are now in " + Display.calculatorModes.OCTAL +  " Mode and the octal of " + displayedValue + " is = " +  Integer.toOctalString(octalConverter()));
                break;
            case "hexadecimal":
                System.out.println("You are now in " + Display.calculatorModes.HEXADECIMAL + " Mode and the hexadecimal of "  + displayedValue +  " is = " + Integer.toHexString(hexConverter()));
                break;
            default:
                System.out.println("You are now in " + Display.calculatorModes.DECIMAL + " Mode");
        }

    }

    /**
     * Switch Trig Unit Modes enum
     */

    public enum trigModes{
        RADIANS,DEGREES
    }

   public static trigModes defaultTrigMode = trigModes.RADIANS;
    public static trigModes currentTrigMode = defaultTrigMode;

    public void switchUnitsMode(){

        switch(currentTrigMode){
            case DEGREES:
                currentTrigMode = trigModes.RADIANS;
                System.out.println("You are currently in " + trigModes.RADIANS);
                break;
            case RADIANS:
                currentTrigMode = trigModes.DEGREES;
                System.out.println("You are currently in " + trigModes.DEGREES);
                break;
                default:
                    System.out.println("You can only use degrees and radians trig modes with sine, cosine and tangents");
        }
    }


    public void switchUnitMode(String unit){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter degrees or radians to switch unit mode");
        unit = userInput.nextLine();
        switch (unit){
            case "degrees":
                System.out.println("You are now in " + trigModes.DEGREES + " Mode " + calculateCosine());
                break;
            case "radians":
                System.out.println("You are now in " + trigModes.RADIANS + " Mode ");
                break;
            default:
                System.out.println("You can only use degrees and radians trig modes with sine, cosine and tangents");
        }
    }


    /**
     * Mode converter methods
     */

    public int octalConverter(){
        return (int) displayedValue;
    }

    public int hexConverter(){
        return (int) displayedValue;
    }

    public int binaryConverter(){
        return (int) displayedValue;
    }

    /**
     * Application engine and command line User Interface.
     */

    public void engine(){
        boolean flag = true;

        while(flag){
            //print display value printDisplay(display)
            int choice = promptUserForInt("\nPress (1) to add (2)subtract (3)multiple (4)divide (5) square (6) squareRoot \n (7)reset Memory (8)exponent (9)inverse (10)inverse the sign\n(11)natural Log (12)base10Log (13)Calculate Sine (14)ArcSin \n (15)ArcCos (16)ArcTan (17)Tan (18)M+ Key (19)Cosine (20)MRC \n(21)Factorial (22)RotateUnitModes (23) enter unit mode(30)switchDisplayMode \n(31)selectDisplayMode(99)Clear(0)exit");
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
                    break;
                case 22:
                    switchUnitsMode();
                    break;
                case 23:
                    switchUnitMode("radians");
                    break;
                case 30:
                    switchDisplay();
                    break;
                case 31:
                    switchDisplay("binary");
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
     * Scanner for prompt methods to prompt user for inputs
     */

    public static Scanner input = new Scanner(System.in);


    public static int promptUserForInt(String msg){
        promptUser(msg);
        return input.nextInt();
    }

    public static double promptUserForDouble(String msg){
        promptUser(msg);
        return input.nextDouble();
    }

    public static void promptUser(String msg){

        System.out.println(msg);
    }

    /**
     * Display method calls for UI and for conversions
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

            promptUserForDouble("You just calculated the Cosine of the displayed value and in degrees the result is " + calculateCosine());
    }
/*
    public double flipToDegrees(){
        Math.toDegrees(displayedValue);
        displayedValue = Math.cos(degrees);
        return displayedValue;
    }
    */

    public void inverseSineMethodNumber(){
        promptUserForDouble("You just did an inverse the Sine of the currently displayed value and the result is " + inverseSineMethod());
    }

    public void inverseCosineNumber(){
        promptUserForDouble("You have just reversed the Cosine of the displayed value and the result is " + inverseCosineMethod());
    }

    public void inverseTangentNumber(){
        promptUserForDouble("You have just reversed the tangent of teh displayed value and the result is " + inverseTangent());
    }

    public void calculateTangentNumber(){
        promptUserForDouble("Calculate the tangent of the displayed value and the result is " + calculateTangent());

    }

    public void mCeeKeyResetsMemory(){
        promptUserForDouble("You have just reset memory to 0" + resetMemoryMCKey());
    }

    public void memoryPlusKeyNumber(){
        promptUserForDouble("you have stored the displayed value to memory " + memoryPlusKey(getDisplayedValue()));
    }

    public void recallMemoryMRCKeyNumbers(){
        promptUserForDouble("The store value in memory is : " + getMemory());
    }

    public void factorialNumbers(){
        promptUserForDouble("The factorial of the " + displayedValue + " is = " + factorial(displayedValue));
    }

}
