 1. Default Methods
A default method in an interface has a body (implementation). It allows adding new methods to an interface without breaking existing implementations.

interface Vehicle {
    default void start() {  // Default method
        System.out.println("Vehicle is starting...");
    }
}

class Car implements Vehicle {
    // No need to override start() unless we want a different behavior
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();  // Calls the default method from Vehicle
    }
}
Output:

Vehicle is starting...
 Why use default methods? 
 
 
 If a new method is added to an interface, old classes don’t need to implement it, helping in backward compatibility.

2. Static Methods
A static method in an interface belongs to the interface itself (not to implementing classes). It can be called without creating an object.

java
Copy
Edit
interface MathUtils {
    static int add(int a, int b) {  // Static method
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        int result = MathUtils.add(5, 10); // Calling static method
        System.out.println("Sum: " + result);
    }
}
Output:

makefile
Copy
Edit
Sum: 15
Why use static methods? 

Useful for utility/helper methods related to the interface, with no need for implementation in classes.