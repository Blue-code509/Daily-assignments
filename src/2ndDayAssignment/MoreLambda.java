@FunctionalInterface
interface  A {
    void show(int i );
}

public class MoreLambda {
    public static void main(String[] args) {
        A obj = (int i)->System.out.println("my name is the Ayushman Giri   " + i);
        obj.show(5);
    }
}
