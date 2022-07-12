package evendigitsum;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) //first if checks if number is less than 0
            return -1; //returns negative 1 if true.
 
        int sum = 0; //have to initialize sum outside of while loop ?
 
        while (number > 0) { //loop runs while number is greater than 0
            if (number % 2 == 0) { // if statement checks for even number if even runs next line
                sum += number % 10;//adds the remainder of number to sum
            } // if if statement false/odd passes line ten and skips to line 12
                number /= 10; //reduces number by one decimal point by setting number equal to number divided by 10.
            }
            return sum; //returns sum of all even numbers processed by loop
        }
    }