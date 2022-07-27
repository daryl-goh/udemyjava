package lambdachallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge2 {

    public static void main(String[] args) {
        
        // Challenge 8: There are many interfaces in the Java SDK, and sometimes we can use a
        // lambda expression instead of creating an instance that implements the interface we want to use.
        // Given a specific interface, how can we tell whether we can map a lambda expression to it?

        // Answer:
        // The interface has to be a functional interface and can only have a single method that must be implemented.
        // A functional interface can contain more than one method but all the method but one must have default implementations.
        
        // Can we use a lambda expression to represent an instance of the java.util.concurrent.Callable interface?
        // Answer: Yes as it has only one method that has to be implemented - the call() method.

        // Is the java.util.Comparator interface a functional interface?
        // Answer: Yes despite containing over 10 methods, only one method has to be implemented - compare() hence it's a functional interface.


        // Challenge 9: Write code to print the items in the list below in sorted order, with the first letter in each name
        // upper-case. The name "harry" should be printed as "Harry" and should be printed after "Emily" and before "Isla"
        // Use lambda expression whenever possible.

        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );

        List<String> firstUpperCaseList = new ArrayList<>();
        topNames2015.forEach(name ->
                firstUpperCaseList.add(name.substring(0,1).toUpperCase() + name.substring(1)));
        firstUpperCaseList.sort((s1, s2) -> s1.compareTo(s2));
        firstUpperCaseList.forEach(s -> System.out.println(s));

        // Challenge 10: Change the code so that it uses METHOD references. A method reference looks like this Class::MethodName

        firstUpperCaseList.sort(String::compareTo);
        firstUpperCaseList.forEach(System.out::println);

        // Challenge 11: Do the same thing (uppercase first letter, then sort and print list) using a stream and a
        // chain of stream operations

        topNames2015
                .stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .sorted(String::compareTo)
                .forEach(System.out::println);

        // Challenge 12: Instead of printing out the sorted names, print out how many names begin with the letter "A"

        long namesBeginningWithA = topNames2015
                .stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .filter(name -> name.startsWith("A"))
                .count();

        System.out.println("Number of names beginning with A is: " + namesBeginningWithA);

        topNames2015
                .stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .peek(System.out::println)
                .sorted(String::compareTo)
                .collect(Collectors.toList());
    }

}
