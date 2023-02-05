package com.LogicalProblems;

import java.util.Scanner;

public class Perfect_number {
    public static void main(String[] args) {
        int sum = 0; // Initialization of variables
        int inputvalue = 0;
        int i;
        System.out.println(" Enter any number");
        Scanner scan = new Scanner(System.in);  //This statement will capture the user input
        int inputValue = scan.nextInt();        //Captured input would be stored in inputValue
        for (i = 1; i < inputvalue; i++) {  //for loop to execute block of code till condition reached
            if (inputvalue % i == 0) {          // if statement is used to test the condition
                sum = sum + i;
                System.out.println(" numbers : " + i);
            }
        }

        if (sum == inputvalue) {
            System.out.println(" inputvalue is a Perfect number ");
        } else {
            System.out.println(" inputvalue is not perfect number");
        }
    }
}

