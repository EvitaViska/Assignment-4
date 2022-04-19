package com.company;

public class Task7 {

    public void calculate() {

/**
 Write a Java program to get the difference between the largest and
 smallest values in an array of integers. The length of the array must
 be 1 and above.
  */

        System.out.println("Task 7");

        int table[] = {1, 2, 2, 3, 4, 10, 6, 20};

        int largest = table[0];
        int smallest = table[0];
        int difference;

        for (int num: table) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }

        difference = largest - smallest;

        System.out.println("The difference between the smallest and largest value is " + difference);

    }
}
