package sortedarray;

import java.util.Scanner;

public class SortedArray {
    
    public static int[] getIntegers(int capacity) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[capacity];
     
        for (int i = 0; i < intArray.length; i++) {
          System.out.printf("Enter %d integer value: ", i);
          intArray[i] = scanner.nextInt();
        }
     
        scanner.close();
        return intArray;
    }
    
    public static void printArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Element " + i + " contents " + intArray[i]);
        }
    }
    
    public static int[] sortIntegers (int[] intArray) {
        int[] sortedArray = new int[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            sortedArray[i] = intArray[i];
        }
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }   
}
