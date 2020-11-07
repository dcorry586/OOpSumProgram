package com.company;

/*
Author : Dylan Corry
Date: 23/09/2019
Description : OOP program to calculate sum of two numbers
Copyright :
 */


/*

    SO we have 2 files communicating together : CalculateClass.java, Calculator.java

    CalculateClass.java is a class for defining the logic

    CalculateClass.java is a class for in this case taking the blueprint of a calculator and instantiating an object named myCalculate
    to inherit the features of that class

 */


public class Calculator { // declaring new class
    public static void main(String[] args){  // declaring main method so computer knows where to start executing your program from
        CalculateClass myCalculate = new CalculateClass(); // ' Calculate ' -> Class Calculate | ' myCalculate ' is what you are naming the object as | ' = new Calculate() ' -> means declaring a new object of Class Calculate
        myCalculate.getUserInput(); // from object myCalculate -> I am accessing the ' getUserInput ' method!
        myCalculate.sum();
    }
}