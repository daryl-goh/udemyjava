package lambdachallenge;


import java.util.function.Function;
import java.util.function.Supplier;


public class Challenge1 {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                String myString = "Let's split this up into an array";
                String[] parts = myString.split(" ");
                for (String part: parts) {
                    System.out.println(part);
                }
            }
        };
         // Challenge 1: Write the above anonymouse class as a lambda expression

        Runnable runnable1 = () -> {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            for (String part: parts) {
                System.out.println(part);
            }
        };

        // public static String everySecondChar(String source) {
        //     StringBuilder returnVal = new StringBuilder();
        //     for (int i = 0; i < source.length(); i++) {
        //         if (i % 2 == 1) {
        //             returnVal.append(source.charAt(i));
        //         }
        //     }
        //     return returnVal.toString();
        // };
    
        // Challenge 2: Write the above anonymouse class as a lambda expression

        Function<String, String> lambdaFunction =  s -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }

            return returnVal.toString();
        };
        
        // Challenge 3: The above function doesn't do anything. Write the code that will execute the function
        // with an argument of "1234567890"

        System.out.println(lambdaFunction.apply("1234567890"));

        // Challenge 4: Instead of executing this function directly, suppose we want to pass it to a method. 
        // Write a method called everySecondCharacter that accepts the function as a parameter
        // and executes it with the argument "1234567890".

        
        // public static String everySecondCharacter(Function<String, String> func, String source) {
        //     return func.apply(source);
        // }

        // Challenge 5: Call the method with the lambdaFunction we created and the string "1234567890" and 
        // print the result returned from the method.

        // String result = everySecondCharacter(lambdaFunction, "1234567890");
        // System.out.println(result);

        // Challenge 6: Write a lambda expression that maps to the java.util.Supplier interface. This lambda should return 
        // the string "I love Java!". Assign it to a variable called iLoveJava.
        // Supplier<String> iLoveJava = () -> "I love Java!"; this is an alternative without return and curly braces
        
        Supplier<String> iLoveJava = () -> { return "I love Java!"; };

        // Challenge 7: As with Function, the Supplier won't do anything until we use it. Use this supplier to assign the string
        // "I love Java!" to a variable called supplierResult. Then print the variable to the console.
       
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);
    }

    
}