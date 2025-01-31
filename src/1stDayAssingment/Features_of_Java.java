public class Features_of_Java {

    /*Lambda Expressions – Allows writing concise functions.
Example: (a, b) -> a + b;

Streams API – Enables functional-style operations on collections.
Example: list.stream().filter(s -> s.equals("b")).forEach(System.out::println);

Default Methods in Interfaces – Interfaces can have method implementations.
Example:

java
Copy
Edit
interface MyInterface {
    default void show() {
        System.out.println("Default method");
    }
}
Method References – Shorter way to refer to methods.
Example: list.forEach(System.out::println);

Functional Interfaces – Predefined interfaces like Predicate, Function, Consumer.
Example: Function<Integer, Integer> square = x -> x * x;

Optional Class – Avoids NullPointerException.
Example: Optional<String> name = Optional.of("John");

New Date and Time API – Improved date handling.
Example: LocalDate today = LocalDate.now();

Collectors – Helps collect stream results.
Example: List<String> result = list.stream().collect(Collectors.toList());

 */
}
