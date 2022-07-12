package lastdigitchecker;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (num1 < 10 || num1 > 1000 || num2 < 10 || num2 > 1000 || num3 < 10 || num3 > 1000) {
            return false;
        }
        else if (num1 % 10 == num2 % 10 || num1 % 10 == num3 % 10 || num2 % 10 == num3 % 10) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isValid(int num4) {
        if (num4 < 10 || num4 > 1000) {
            return false;
        }
        else {
            return true;
        }
    }
}
