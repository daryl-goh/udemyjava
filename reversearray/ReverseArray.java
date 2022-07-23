package reversearray;

import java.util.Arrays;
 
class Main {
 
	public static void main(String[] args) {
		int[] newArray = new int[] { 1, 2, 3, 4, 5 };
		System.out.println("The initial array is: " + Arrays.toString(newArray));
		reverse(newArray);
		System.out.println("The reversed array is: " + Arrays.toString(newArray));
	}
 
	private static void reverse(int[] array) { // pass in reference type variable pointing at the object in memory, newArray...so we modify newArray via array
		int maxIndex = array.length - 1; // maximum index that we can use
		int halfLength = array.length / 2; // to loop till halfway point of array. dont have to loop fully else it will be back to original
		for (int i = 0; i < halfLength; i++) {
			int temp = array[i]; // assign to temporary variable
			array[i] = array[maxIndex - i];  // swap from first to last
			array[maxIndex - i] = temp;  // as i progresses from 0 to index to half of the length, each element swaps with its mirror element
		}
	}
}
 