package shareddigit;

public class SharedDigit {
    public static boolean hasSharedDigit(int number1, int number2) {
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            return false;
        }
                                                          //e.g. number1 = 825, number2 = 32. Start from outer loop i first and loop through inner loop j, 
                                                          //fulfiling conditions j>0 till j<0 then go back to outer loop i to start again.
        for(int i = number1; i > 0; i /= 10) {            //825  825  82  82  8   8
            for(int j = number2; j > 0; j /= 10) {        //32   3    32  3   32  3
                if(i % 10 == j % 10) {                    //compare i % 10 == j % 10 --> (5 != 2)  (5 != 3)  (2 = 2)  (2 != 3) (8 != 2) (8 != 3)
                    return true;                          //since for this scenario, we have (2 = 2) after looping, we meet if condition and return true.
                }
            }
        }
        return false;
    }
}


/* The above method can be used for any length of digits (not just 2 digits as per the question)

It's not necessary to use nested loops since we know that we are comparing 2 digits vs 2 digits.

But if the exercise was to evaluate shared digits of 2 digits with any number of digits 
(like, 127 vs 3456789), then the use of nested loops is totally correct. */