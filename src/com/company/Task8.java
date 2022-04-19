package com.company;

public class Task8 {

    public void calculate() {

 /**
 Write a Java program to find the sum of the two elements of a given array
 which is equal to a given integer. Sample array:[1,2,4,5,6].
 Target value: 6
 */

        System.out.println("Task 8");

        int numbers[] = {1, 2, 4, 5, 6};
        int target = 6;

        for (int i = 0; i < numbers.length-1; i++){
            for (int j = i+1; j < numbers.length; j++){
                if (numbers[i] + numbers[j] == target)
                    System.out.println("Index: " + i +" Index: " + j);
            }
        }



    }
}
