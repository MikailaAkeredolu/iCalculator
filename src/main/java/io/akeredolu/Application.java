package io.akeredolu;

import static  io.akeredolu.Calculator.*;
import static  io.akeredolu.Display.*;

/**
 * Created by mikailaakeredolu on 5/10/16.
 */
public class Application {

    public void engine(){
        boolean flag = true;
        while(flag){
            displayCurrentMemoryValue();
            int choice = promptUserForInt("\nPress 1)to add 2)subtract 3)multiple 4)divide 5) square 6) squareRoot 7)reset 0)exit");
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
                   resetMemory();
                    break;
                case 7:
                 squareRootNumbers();
                    break;
                case 0:
                    promptUser("Good Bye...");
                    flag = false;
                    break;

            }
        }
    }

    public void displayCurrentMemoryValue(){

        promptUser("The previous value is " + memory);
    }


    public void addNumbers(){
        int a = promptUserForInt("Please enter and integer to add to current value");
        int sum = add((int) memory ,a);
        promptUser("The sum  " + a  + " is  = "+ num);
    }

    public void subtractNumbers(){
        int a = promptUserForInt("Please enter and integer to subtract to current value");
        int num = subtract((int) memory ,a);
        promptUser("The difference  " + a  + " is  = "+ num);
    }

    public void multiplyNumbers(){
        int a = promptUserForInt("Please enter and integer to multiply to current value");
        int num = multiply((int) memory ,a);
        promptUser("The product of " + a  + " is  = "+ num);
    }

    public void divideNumbers(){
        double a = promptUserForDouble("Please enter and double to divide to current value");
        double num = divide(memory ,a);
        promptUser("The division  of " + a  + " is  = "+ num);
    }


    public void squareNumbers(){
        double a = promptUserForDouble("Please enter and double to square to current value");
        double num = square(a);
        promptUser("The square  of " + a  + " is  = "+ num);

    }

    public void squareRootNumbers(){
        double a = promptUserForDouble("Please enter and double to find the squareRoot");
        double num = squareRoot(a);
        promptUser("The square root of " + a  + " is  = "+ num);
    }

















    public static void main(String[] args){
        Application app = new Application();
        app.engine();
    }
}
