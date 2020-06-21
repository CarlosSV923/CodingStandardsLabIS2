// Copyright (C) 2020
// All rights reserved

package labcodingstandards;

import java.util.Scanner;


/**
 * @author Carlos Sesme Vera
 *
 */
public class Calculator {


    /**
     * @param args the command line arguments
     */
//CHECKSTYLE: OFF
    public static void main(final String[] args) {
//CHECKSTYLE: ON



        Scanner reader = new Scanner(System.in);

        System.out.print("1. +\n2. -\n3. *\n4. /\nEnter an operator: ");

        char operator = reader.nextLine().charAt(0);
        double first;
        double second;
        String input;

        while (true) {
            System.out.print("Enter first number: ");
            input = reader.nextLine();

            try {
                first = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not valid!");
            }
        }

        while (true) {
            System.out.print("Enter second number: ");
            input = reader.nextLine();

            try {
                second = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not valid!");
            }
        }

        Calculator cal = new Calculator();
        String result = cal.operation(first, second, operator);

        System.out.printf(result);
        reader.close();
     }

    /**
     * @param first of type double to do an operation
     * @param second of type double to do an operation
     * @param operator of type char defines the type of operation to be done
     * @return String of type string that returns the result message
     */
    private String operation(final double first,
                             final double second,
                             final char operator) {

        double result = 0;
        switch (operator) {
            case '1':
                result = first + second;
                break;
            case '2':
                result = first - second;
                break;
            case '3':
                result = first * second;
                break;
            case '4':
                result = first / second;
                break;
            default:
                return "Error! operator is not correct";
        }
        return "The result is: " + result;
    }
}
