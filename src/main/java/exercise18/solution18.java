/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jorge Paez
 *
 * Pseudocode:
 * A program that will convert celsius to fahrenheit and vice versa. Prompting the user to
 * select either measurement.
 *
 */
package exercise18;
import java.util.*;

public class solution18 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in); //user input
        System.out.println("Press C to convert from Fahrenheit to Celsius. ");
        System.out.println("Press F to convert Celsius to Fahrenheit. ");
        System.out.print("Your selection: ");
        char selection = sc.next().toUpperCase().charAt(0); //makes it so both lowercase and uppercase are read

        if (selection == 'f'){ //for converting into fahrenheit
            System.out.print("Enter the temperature in Celsius: ");
            double temperature = sc.nextDouble(); //userInput
            double end = ((temperature * 1.8) + 32); //celsius to fahrenheit formula
            System.out.printf("The temperature in Fahrenheit: ", end);
        } else{ //fahrenheit to celsius
            System.out.print("Enter the temperature in Fahrenheit: ");
            double temperature = sc.nextDouble(); //input
            double end = (temperature - 32)/1.8; //fahrenheit to celsius
            System.out.println("The temperature in Celsius: " + end);
        }
    }
}
