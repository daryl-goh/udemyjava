package sortedarray;

import java.util.Scanner;
import java.util.Arrays;

 
public class SortedArray {
 
  public static int[] getIntegers(int capacity) {
    Scanner scanner = new Scanner(System.in);
    int[] array = new int[capacity];
 
    for (int i = 0; i < array.length; i++) {
      System.out.printf("Enter %d integer value: ", i);
      array[i] = scanner.nextInt();
    }
 
    scanner.close();
 
    return array;
  }
 
  public static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.printf("Element %d contents %d\n", i, array[i]);
    }
  }
 
  public static int[] sortIntegers(int[] array) {
    int[] sortedArray = Arrays.copyOf(array, array.length);
 
    boolean flag = true;
    int tmp;
    while (flag) {
      flag = false;
      for (int i = 0; i < sortedArray.length - 1; i++) {
        if (sortedArray[i] < sortedArray[i + 1]) {
          tmp = sortedArray[i];
          sortedArray[i] = sortedArray[i + 1];
          sortedArray[i + 1] = tmp;
          flag = true;
        }
      }
    }
 
    return sortedArray;
  }
}