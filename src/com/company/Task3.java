package com.company;

import java.util.Scanner;

public class Task3 {

    public void calculate() {

/**
 Write a program that takes an integer from the user and prints all its
 divisors in the console, each divisor in separate line. For example,
 for the number 21, the program should write in the console the numbers:
 1, 3, 7, 21 (in new line each). Get the data from the user in the console
 using the Scanner class.
  */

        System.out.println("Task 3");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input the number: ");
        int input = scanner.nextInt();

        //Loops through the numbers from 1 to the value before input to print the one that can divide input without reminder
        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                System.out.println(i);
            }
        }


    }
}
