package lambdachallenge;

public class Challenge1 {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                String myString = "Let's split this up into an array";
                String[] parts = myString.split(" ");
                for (String part: parts) {
                    System.out.println(parts);
                }
            }
        };
        // Write the above anonymouse class as a lambda expression
        Runnable runnable1 = ()  -> {
            String myString = "Let's split this way up into an array";
            String[] parts = myString.split(" ");
            for (String part: parts) {
                System.out.println(part);
            }
        };
    }
}
