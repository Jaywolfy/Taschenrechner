///---------------------------------------------------------------------------------
///	Package:        calculator
///	Class:          Calculator
///	Program:        Calculator for basic operations
///	Description:    Calculator - Function: Basic basic operations (+, -, *, /)
///
///	Input:          Two numbers and an operator for calculation
///	Output:         The result of the two numbers in relation to the operator
///	Author:         Jason Wolf
///	Date:           28.06.2025
///---------------------------------------------------------------------------------

package calculator;

import java.util.Scanner;

/**
 * 
 * @author Jason Wolf
 */
public class Calculator {

    /**
     * 
     * 
     * @param args Kommandozeilenparameter
     */
    public static void main(String[] args) {
        
        /*Deklaration der Attribute und Objekte*/
        int myFirstNumber;
        int mySecondNumber;
        char operator;
        Scanner sc;

        /*Initialisierung der Attribute und Objekte*/
		myFirstNumber = 0;
        mySecondNumber = 0;
        operator = ' ';
        sc = new Scanner(System.in);

        /*Eingabeteil*/
        System.out.println("\n\t\tCalculator for basic operations (+, -, *, /)");

		System.out.print("\n\nPlease enter the first number: ");
        myFirstNumber = sc.nextInt();

        System.out.print("Please enter the second number: ");
        mySecondNumber = sc.nextInt();
        
        System.out.print("\nPlease enter the operator: ");
        operator = sc.next().charAt(0);

        /*Verarbeitungsteil*/
        if (operator == '+') {
            System.out.println("\nThe result is: " + (myFirstNumber + mySecondNumber));
        } else if (operator == '-') {
            System.out.println("\nThe result is: " + (myFirstNumber - mySecondNumber));
        } else if (operator == '*') {
            System.out.println("\nThe result is: " + (myFirstNumber * mySecondNumber));
        } else if (operator == '/') {
            if (mySecondNumber == 0) {
                System.out.println("\n\nError: Division by zero is not allowed.");
            } else {
                System.out.println("\nThe result is: " + (myFirstNumber / mySecondNumber));
            }
        } else { 
            System.out.println("\n\nInvalid operator");
        }
		
        /*Ausgabe*/
        sc.close();
    }
}
