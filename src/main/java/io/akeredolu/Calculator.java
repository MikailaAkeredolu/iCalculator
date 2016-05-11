package io.akeredolu;

import static java.lang.Math.log;

/**
 * Created by mikailaakeredolu on 5/10/16.
 */
public class Calculator {

    public static double memory = 0;
    public static double radians;

    public static double otherMemory;

    public static void resetMemory(){

        memory = 0;
    }

    public static int add(int input1, int input2){
        memory = input1 + input2;
        return (int) memory;
    }

    public static int subtract(int input1, int input2){
        memory = input1 - input2;
        return (int) memory;
    }

    public static int multiply(int input1, int input2){
        memory = input1 * input2;
        return (int) memory;
    }

    public static double divide(double input1, double input2){
        memory = input1 / input2;
        return memory;
    }

    public static double square(double input1){
        memory = input1 * input1;
        return memory;
    }

    public static double squareRoot(double input1){
        memory = Math.sqrt(input1);
       return memory;
    }


    public static double exponents(double input1, double input2){

        memory= Math.pow(input1,input2);
        return  memory;
    }
    public static double inverseIt(double input1){
       memory = 1 / input1;

        return memory;
    }

    public static double invertSign(double input1){
        memory = input1 * -1;
        return memory;

    }

    //natural logarithm
    public static double naturalLog(double input1){
        memory =  log(input1);
        return  memory;
    }

    //baseTenLog
    public static double baseTenLog(double input1){
        memory = Math.log10(input1);
        return memory;
    }

    public static double calculateSine(double input1){
        radians = Math.toRadians(input1);
        memory = Math.sin(radians);
        return memory;
    }

    public static double inverseSineMethod(double input1){
        memory = Math.toDegrees(Math.asin(input1));
       return memory;
    }

    public static double inverseCosineMethod(double input1){
       memory = Math.toDegrees(Math.acos(input1));
        return memory;

    }

    public static double inverseTangent(double input1){
       memory = Math.toDegrees(Math.atan(input1));
        return  memory;
    }

    public static double calculateTangent(double input1){
        radians = Math.toRadians(input1);
       memory = Math.tan(radians);
        return memory;
    }

    //add currently displayed value to memory
    public static double memoryPlusKey(){
        memory = otherMemory;
        return memory;
    }

    public static double mCeeKey(){

        return memory = 0.0;
    }

    /**
     *  public void mRcKey(){
     memory = otherMemory;

     }
     */



}
