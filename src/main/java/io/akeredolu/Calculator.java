package io.akeredolu;

import static java.lang.Math.log;

/**
 * Created by mikailaakeredolu on 5/10/16.
 */
public class Calculator {

    public static double displayedValue = 0;
    public static double radians;
    public static double otherMemory;
   // public input = 0.0;

    public static int clearDisplay(){
        return 0;
    }

    public static double add(double input){

        displayedValue = input + displayedValue;
      return displayedValue;
    }



    public static double subtract(double input){
        displayedValue = displayedValue - input;
        return displayedValue;
    }

    public static double multiply(double input){
        displayedValue = input * displayedValue;
        return displayedValue;
    }
    public static double divide(double input){
        if(input == 0){
            System.out.println("Err");
            clearDisplay();
        }
        displayedValue =  displayedValue / input;
        return displayedValue;
    }

    public static double square(){
     displayedValue = displayedValue * displayedValue;
        return displayedValue;

    }

    public static double squareRoot(){
        displayedValue = Math.sqrt(displayedValue);
        return  displayedValue;

    }

    public static double exponents(double input){
        displayedValue = Math.pow(displayedValue,input);
        return  displayedValue;
    }

    public static double inverseIt(){
       displayedValue = 1 / displayedValue;
        return displayedValue;
    }

    public static double invertSign(){
        displayedValue =  displayedValue * -1;
        return displayedValue;

    }

    //natural logarithm
    public static double naturalLog(){
        displayedValue =  log(displayedValue);
        return  displayedValue;
    }

    //baseTenLog
    public static double baseTenLog(){
        displayedValue = Math.log10(displayedValue);
        return displayedValue;
    }

    public static double calculateSine(){
        radians = Math.toRadians(displayedValue);
        displayedValue = Math.sin(radians);
        return displayedValue;
    }

    public static double inverseSineMethod(){
        displayedValue = Math.toDegrees(Math.asin(displayedValue));
       return displayedValue;
    }

    public static double inverseCosineMethod(){
       displayedValue = Math.toDegrees(Math.acos(displayedValue));
        return displayedValue;

    }

    public static double inverseTangent(){
       displayedValue = Math.toDegrees(Math.atan(displayedValue));
        return  displayedValue;
    }

    public static double calculateTangent(){
        radians = Math.toRadians(displayedValue);
       displayedValue = Math.tan(radians);
        return displayedValue;
    }

    //add currently displayed value to memory
    public static double memoryPlusKey(){
        displayedValue = otherMemory;
        return displayedValue;
    }

    public static double mCeeKey(){

        return displayedValue = 0.0;
    }

    public static void resetMemory(){

        displayedValue = 0;
    }

    /**
     *  public void mRcKey(){
     memory = otherMemory;

     }
     */



}
