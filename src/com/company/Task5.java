package com.company;

import java.util.Scanner;

public class Task5 {

    public void calculate() {

/**
 Write a program that counts how many times each of the numbers has
 appeared in the prepared table and prints a summary in the console. An
 array can contain ** only ** numbers from 1 to 10.
 For example, for the table [6 5 4 5 10 5 8 3 10 6 6 6 4 3 2 8 1 3 4 7]
 the program should write in the console the number of occurrences of
 each number:
        1 - 1
        2 - 1
        3 - 3
        4 - 3
        5 - 3
        6 - 4
        7 - 1
        8 - 2
        9 - 0
        10 - 2
 An array containing numbers is prepared as the variable numbers.
  */

        System.out.println("Task 5");

        int table[] = {6, 5, 4, 5, 10, 5, 8, 3, 10, 6, 6, 6, 4, 3, 2, 8, 1, 3, 4, 7};

        //Array table2 will store frequencies of element
        int table2[] = new int [table.length];
        int counted = -1;
        for(int i = 0; i < table.length; i++){
            int counter = 1;
            for(int j = i+1; j < table.length; j++){
                if(table[i] == table[j]){
                    counter++;
                    //To avoid counting same element again
                    table2[j] = counted;
                }
            }
            if(table2[i] != counted)
                table2[i] = counter;
        }

        //Displays the frequency of each element present in array
        System.out.println("The number of occurrences of each number: ");
        for(int i = 0; i < table2.length; i++){
            if(table2[i] != counted)
                System.out.println("    " + table[i] + " - " + table2[i]);
        }



    }
}
