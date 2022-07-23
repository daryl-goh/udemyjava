package reversearray;

public class ReverseArray2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        
        reverse(array);
    }

    private static void reverse(int[] value) {
        //System.out.println("Array = " + value[]);
        for (int i = value.length - 1; i >= 0; i--) {
           
            System.out.print(value[i] + " ");
        }
        }
    }
