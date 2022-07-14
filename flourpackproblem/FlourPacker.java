package flourpackproblem;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        // Use a nested loop with outer loop setting main condition
        if ((5 * bigCount) + smallCount >= goal) {
            if (goal % 5 <= smallCount) // Assume smallCount is 0, no matter how many bigCount we have, goal should be in multiples of 5
            return true;                // We don't need to know HOW MANY smallCount or bigCount there are
        }                               // Use goal modulo 5 to find REMAINDER of goal, which should be less than or equal to smallCount
        return false;}
}
