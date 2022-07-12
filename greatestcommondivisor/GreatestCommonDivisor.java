package greatestcommondivisor;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if (first < 10 || second < 10) {
            return -1;
        }
        int divisor = 0;
        for (int i = 1; i <= Math.min(first, second); i++) {
            if (first % i == 0 && second % i == 0) {
                divisor = i;
            }
        }
        return divisor;
    }
}



/*
 ALTERNATIVE:

 public class GreatestCommonDivisor {
 
    public static int getGreatestCommonDivisor(int first, int second) {
 
        if (first < 10 || second < 10) {
            return -1;
        }
        while (first != second) {
            if (first > second)
                first = first - second;
            else {
                second = second - first;
            }
        }
        return second;
    }
}

the code is quite easy if you understand how the Euclidean algorithm works. All you have to know is that the greatest common divisor of 
your two numbers does not change if you replace the larger one with difference of the two. The while loop keep replacing the larger number 
till the second number reaches 0. If we take the numbers 81 (first) and 153 (second) from the challenge, the while loop will handle it like this:

Step 1: After the first iteration the numbers now become 81 and 72 (153 - 81)

Step 2: After the next the numbers become 9 and 72 (81 -72)

Step 3: 9 and 63 (72 - 9)

Step 4: 9 and 54 (63 - 9)

Step 5: 9 and 45 (54 - 9)

Step 6: 9 and 36 (45 - 9)

Step 7: 9 and 27 (36 - 9)

Step 8: 9 and 18 (27 - 9)

Step 9: 9 and 9 (18 - 9)

Step 10: 9 and 0 (9 - 9)

The condition in the while loop is no longer true since the second number reached 0 and the greatest common divisor (9) is returned.
 */