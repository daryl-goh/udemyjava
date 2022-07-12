package numberpalindrome;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number *= -1;
        }
        int reverse = 0;
        int stored = number;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }
        if (stored == reverse) {
            return true;
        }
        else {
            return false;
        }
    }
    
}


/*int reverse = 0;
        int stored = number;
        while (number != 0) {                      -----> for example, number is 123, it goes through while loop:
            int lastDigit = number % 10;           -----> lastDigit = 123 % 10 = 3
            reverse = (reverse * 10) + lastDigit;  -----> (0*10 + 3 = 3), (3*10 + 12%10 = 30 + 2 = 32), (32*10 + 1 = 321)
            number /= 10;                          -----> (123/10 = 12), (12/10 = 1), (1/10 = 0)
        }
Therefore reverse = 321

 */
