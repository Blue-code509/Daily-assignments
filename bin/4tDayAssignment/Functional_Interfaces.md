   -----Java 8: Functional Interfaces------


A functional interface is an interface that has exactly one abstract method but can have multiple default or static methods. It is primarily used in conjunction with lambda expressions.

Key Points:

Functional interfaces enable the use of lambda expressions, making code more readable and concise.
The @FunctionalInterface annotation is used to indicate that an interface is functional.

Some built-in functional interfaces in Java 8 include:
Runnable (from Java 7) – void run()
Callable<T> – T call()
Comparator<T> – int compare(T o1, T o2)
Consumer<T> – void accept(T t)
Example:
@FunctionalInterface
interface MyFunctionalInterface {
    void sayHello();  // Only one abstract method
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Using lambda expression
        MyFunctionalInterface obj = () -> System.out.println("Hello, Java 8!");
        obj.sayHello();
    }
}