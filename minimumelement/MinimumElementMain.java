package minimumelement;

import java.util.Scanner;

public class MinimumElementMain {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count:");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count); //assign array from the readIntegers methods to returnedArray
        int returnedMin = findMin(returnedArray);

        System.out.println("min = " + returnedMin);

    }

    private static int[] readIntegers(int count) {
        //creates an array,  initializes all element to 0
        int[] array = new int[count];
        
        for(int i = 0; i<array.length; i++) {
            System.out.println("Enter a number:");
            int number = scanner.nextInt(); //retrieve integer from console, storing it in variable called number
            scanner.nextLine(); //goes to next line after user presses "enter"
            array[i] = number; //assigning each array to a number
        }
        return array;
    }

    private static int findMin(int[] array) {

        int min = Integer.MAX_VALUE; //to ensure the minimum value receieved is input by user

        for(int i=0; i<array.length; i++) {
            int value = array[i]; // retrieve element at position i and assign to value
                                  //with each loop iteration, we compare the element with the current value of min
            if(value < min) {     //e.g array[0] is it lesser than min? if yes, assign it to min.
                min = value;      //lowest min will be gotten at end of loop
            }
        }

        return min;
    }
}