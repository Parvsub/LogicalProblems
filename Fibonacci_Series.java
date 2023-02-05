package com.LogicalProblems;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        // local variables
        int a = 0;
        int b = 1;
        int sum;
        Scanner scan = new Scanner(System.in); //This statement will capture the user input
        int term = scan.nextInt();             //Captured input would be stored in term
        for (int i = 2; i < term; i++) {       //for loop to execute block of code till condition reached
            sum = a + b;
            System.out.println(" " + sum);
            a = b;
            b = sum;
        }
    }
}

