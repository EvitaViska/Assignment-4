package com.company;

import java.util.Scanner;

public class Task2 {

    public void calculate() {

/**
    Write a program that retrieves integers from the user. Receiving data
    ends with the number 0 (not included in the data). Then, the program
    calculates the sum of the largest and smallest of the given numbers
    and their arithmetic average and prints them in the console. For example,
    for a series of given numbers: 1, -4, 2, 17, 0, the program should write
    in the console the numbers: 13, 6.5. Get the data from the user in the
    console using the Scanner class.
 */

//next.line -> is used only for strings

        System.out.println("Task 2");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the amount of numbers to expect");
        int num_of_inputs = scanner.nextInt();

        int[] numbers = new int[num_of_inputs];
        int counter = 0;
        int input;

        //Create a loop that runs for the amount of inputs to expect
        do {
            System.out.println("Input a number to add or input zero to calculate");
            input = scanner.nextInt();

            //Add int to array
            if (input == 0) {
                break;
            }
            numbers[counter++] = input;
        } while (input != 0 && counter < num_of_inputs);

        int largest = numbers[0];
        int smallest = numbers[0];
        double sum;

        for (int num: numbers) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }

        sum = largest + smallest;
        double arithmetic_min = sum / 2;

        System.out.println(sum + " is the sum of both the smallest and largest value");
        System.out.println(arithmetic_min + " is the arithmetic mean");
    }

}
