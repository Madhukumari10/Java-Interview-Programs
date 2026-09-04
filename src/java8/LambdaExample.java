package java8;

@FunctionalInterface
interface Greeting {

    void sayHello(String name);
}

public class LambdaExample {

    public static void main(String[] args) {

        Greeting greeting = name ->
                System.out.println("Hello, " + name);

        greeting.sayHello("Madhu");
    }
}
