package com.company;

public class Task6 {

    public void calculate() {

/**
 Write a Java program to find the duplicate values of an array of
 integer values.
  */

    System.out.println("Task 6");

    int table[] = {1, 2, 2, 3, 4, 1};

    System.out.println("Duplicate values of an array: ");
    //Searches for duplicate element
        for(int i = 0; i < table.length; i++) {
            for(int j = i + 1; j < table.length; j++) {
                if (table[i] == table[j])
                    System.out.println(table[j]);
            }
        }


    }
}
