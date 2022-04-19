package com.company;

import java.util.Scanner;

public class Task1 {

    public void calculate() {

/**
 Write a program that takes numbers from the user as long as
 the number 0 is not given. When the number 0 is given, the
 program calculates the sum of the numbers given and prints
 it in the console. For example, for a series of given numbers:
 3, 2, 5, 1, 0, the program should write the number 11 in the
 console. Get the data from the user in the console using
 the Scanner class
  */

        System.out.println("Task 1");
        System.out.println("Please input numbers if you write '0' program ends");
        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;

        do {
            number = scanner.nextInt();
            sum += number;
        } while(number != 0);

        System.out.println("Sum is : " + sum);


       /*David
        int total = 0;
        int input;

        do {
            System.out.println("Input a number");
            input = scanner.nextInt();
            total = total + input;
        } while (input != 0);

        System.out.println("Sum is : " + total);*/

    }
}
