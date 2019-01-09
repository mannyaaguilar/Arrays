package com.manny;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	/*An Array is a data structure that allows you to store a sequence of values of the same data type.
	Example:
	Array of Integers, Array of Strings, Array of Characters, etc.
	This works for all primitive types and even objects like a String.
	Declaring an array initially is similar to the way we create a variable.
	Can't put a double into an Int Array (and vice versa).
	*/

	//4 ways of doing it:

//        int [] myIntArray = new int[10];
//        myIntArray[0] = 1;
//        myIntArray[1] = 2;
//        myIntArray[2] = 3;

//        int [] myIntArray = {1, 2, 3, 4, 5, 6 7, 8, 9, 10}; //Defined an array of type int and assigned 10 elements
//        System.out.println(myIntArray[2]);
//        System.out.println(myIntArray[5]);
//        System.out.println(myIntArray[6]);

//          int [] myIntArray = new int[26];
//          for(int i=0; i<myIntArray.length; i++){
//              myIntArray[i] = i*10;
//          }
//          printArray(myIntArray);
//    }
//    public static void printArray(int[] array){
//        for(int i=0; i<array.length; i++){
//            System.out.println("Element " + i + ", value is " + array[i]);
//        }
        int[] myIntegers = getIntegers(5);
        for(int i = 0; i<myIntegers.length; i++){
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for(int i = 0; i<array.length; i++){
            sum += array[i];
        }
        return (double) sum / (double)array.length;
    }
}
