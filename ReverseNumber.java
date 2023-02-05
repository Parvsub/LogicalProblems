package com.LogicalProblems;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 0;
        int reverse_number = 0;
        System.out.println(" Enter the number");
        Scanner scan = new Scanner(System.in); //This statement will capture the user input
        number = scan.nextInt();                 //Captured input would be stored in number

        while (number != 0) {                      //While Loop: Logic to find out the reverse number
            reverse_number = reverse_number * 10;
            reverse_number = reverse_number + number % 10;
            number = number / 10;
        }
        System.out.println("Reverse of input number is: " + reverse_number);
    }
}
