package io.akeredolu;

import java.util.Scanner;

/**
 * Created by mikailaakeredolu on 5/10/16.
 */
public class Display {

    public static Scanner input = new Scanner(System.in);

    //switch message of 4 different modes and use the .decimal modes

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

    /*
    public static void printBinary(int n){
        System.out.println(Integer.toBinaryString(n));
    }


    //if mode is  binary then convert answer to binary

    public static String askForStringInput(){
        return input.nextLine();
    }

    */



}
