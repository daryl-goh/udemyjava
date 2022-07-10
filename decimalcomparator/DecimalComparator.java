package decimalcomparator;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double doubleone, double doubletwo) {

        int doubleonecheck = (int) (doubleone * 1000);
        int doubletwocheck = (int) (doubletwo * 1000);

        if (doubleonecheck - doubletwocheck == 0) {
            return true;
        }
        else 
            return false;
    }
}
