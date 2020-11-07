package com.company;


import java.util.Scanner;

public class CalculateClass {

    // 3 variables defined
    int number1, number2; // can think of these as global variables

    // method to acquire 3 numbers from user
    public void getUserInput(){ // public method,   return type is Void,    name is getUserInput() // getUserInput method declaration and definition

        // Create object of scanner class in order to use it
        Scanner input = new Scanner(System.in); // ' input ' == object of scanner class // taking user input will be as simple as input ' . ' something!


        System.out.println("Enter first integer: ");
        number1 = input.nextInt(); // now able to call input = object of scanner!

        System.out.println("Enter second integer: ");
        number2 = input.nextInt(); // bringing input from keyboard and assigning it to variable number ..1, 2, 3



    }

    // SUM method
    public void sum(){

        System.out.printf("The sum is  %d%n" , number1 + number2);

    }

}

/*

    IN order to use method to get user input...YOU have to call the method.

    no main...SO create CalculateTest file

 */
