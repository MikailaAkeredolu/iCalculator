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
            displayCurrentMemoryValue();
            int choice = promptUserForInt("\nPress (1) to add (2)subtract (3)multiple (4)divide (5) square \n(6) squareRoot (7)reset (8)exponent (9)inverse (10)inverse the sign\n(11)natural Log (12)base10Log (13)Calculate Sine (14)Arcsin \n (15)Arccos (0)exit");
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
                    resetMemory();
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
                case 0:
                    promptUser("Good Bye...");
                    flag = false;
                    break;
            }
        }
    }


    /**
     * Display Current Memory and Value
     */

    public void displayCurrentMemoryValue(){

        promptUser("The previous value is " + memory);
    }


    public void addNumbers(){
        int a = promptUserForInt("Please enter and integer to add to current value");
        int num = add((int) memory ,a);
        promptUser("The addition is " + "= " + num);
    }

    public void subtractNumbers(){
        int a = promptUserForInt("Please enter and integer to subtract to current value");
        int num = subtract((int) memory ,a);
        promptUser("The difference is " + "= " + num);
    }

    public void multiplyNumbers(){
        int a = promptUserForInt("Please enter and integer to multiply to current value");
        int num = multiply((int) memory ,a);
        promptUser("The product is " + "= " + num);
    }

    public void divideNumbers(){
        double a = promptUserForDouble("Please enter and double to divide to current value");
        double num = divide(memory ,a);
        promptUser("The division is " + "= " + num);
    }


    public void squareNumbers(){
        double a = promptUserForDouble("Please enter and double to square to current value");
        double num = square(a);
        promptUser("The square is " + "= " + num);

    }

    public void squareRootNumbers(){
        double a = promptUserForDouble("Please enter and double to find the squareRoot");
        double num = squareRoot(a);
        promptUser("The square root is " + "= " + num);
    }


    public void exponentOfNumber(){
        double a = promptUserForInt("Please enter the number you want to find the exponent of ");
        double b = promptUserForInt("Please enter the number ou want to raise it to");
        double num = exponents(a,b);
        promptUser("The exponent of " +  a + " raised to the power of  " + b + " is = " + num);
    }

//inverseIt

    public void inverseNumber(){
        double a = promptUserForDouble("Please enter the number you want to inverse");
        double num = inverseIt(a);
        promptUser("The inverse is " + "= " + num);
    }

    public void inverseTheSignNumber(){
        double a = promptUserForDouble("Please enter the positive number whose sign you want to switch to negative");
        double num = invertSign(a);
        promptUser("The result of making the sign inverse is " + num);
    }

    public void naturalLogNumber(){
        double a = promptUserForDouble("Please enter the number whose log you want to calculate");
        double num = naturalLog(a);
        promptUser("The log of " + a + "is " + num);

    }


    public void baseTenLogNumber(){
        double a = promptUserForDouble("Enter the number you want to calculate the base10Log for ");
        double num = baseTenLog(a);
        promptUser("The base10Log for " + a + " is = " + num);
    }


    public void calculateSineNumber(){
        double a = promptUserForDouble("Enter a number to calculate the sine");
        double num = calculateSine(a);
        promptUser("The sine of " + a + "is =  " + num);
    }

    public void inverseSineMethodNumber(){
        double a = promptUserForDouble("Enter the number whose sine you want to inverse");
        double num = inverseSineMethod(a);
        promptUser("Te inverse sine of  " + a + "is = " + num);

    }

    public void inverseCosineNumber(){
        double a = promptUserForDouble("Enter the Cosine you want reversed ");
        double num = inverseCosineMethod(a);
        promptUser("The inverse of cosine " + a + "is = " + num);
    }

    /**
     *
     * MAIN to create object and call engine to run calculator
     */

    public static void main(String[] args){
        Application app = new Application();
        app.engine();
    }
}
