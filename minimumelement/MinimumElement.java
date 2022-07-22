package minimumelement;

import java.util.Scanner;

public class MinimumElement {
    
    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int read = scanner.nextInt();
        return read;
        
    }

    private static int[] readElements(int values) {
        int[] intArray = new int[values];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < intArray.length; i++) {
            int read = scanner.nextInt();
            scanner.nextLine();
            intArray[i] = read;
           
        }
        
        return intArray;
    }

    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
 

}
