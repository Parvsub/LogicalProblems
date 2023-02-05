package com.LogicalProblems;

import javax.swing.*;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int i;
        int count = 0;
        System.out.println(" Enter the numbers ");
        Scanner scan = new Scanner(System.in);      //This statement will capture the user input
        int inputNumber = scan.nextInt();           //Captured input would be stored in inputNumber
        for (i = 1; i <= inputNumber; i++) {        //for loop to execute block of code till condition reached
            if (inputNumber % i == 0) {             // if statement is used to test the condition
                count++;
            }
        }
        if (count == 2) {
            System.out.println(" inputNumber is PrimeNumber ");
        } else {
            System.out.println(" inputNumber is Not a PrimeNumber");
        }
    }
}

