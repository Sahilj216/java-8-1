# Question 1 Write the following a functional interface and implement it using lambda:

1. To check whether the first number is greater than second number or not, Parameter (int ,int ) Return type boolean

2. Increment the number by 1 and return incremented value Parameter (int) Return int

3. Concatination of 2 string Parameter (String , String ) Return (String)

4. Convert a string to uppercase and return . Parameter (String) Return (String)

# Answer 1

```java
public class Main {

    @FunctionalInterface
    interface NumComparator {
        boolean isGreater(int a, int b);
    }

    @FunctionalInterface
    interface Incrementer {
        int increment(int x);
    }

    @FunctionalInterface
    interface StrConvert {
        String concat(String a, String b);
    }

    @FunctionalInterface
    interface UpCaseConvert {
        String toUpper(String s);
    }

    public static void main(String[] args) {
        NumComparator comparator = (a, b) -> a > b;
        System.out.println(comparator.isGreater(10, 5));  // true

        Incrementer inc = x -> x + 1;
        System.out.println(inc.increment(5));             // 6

        StrConvert sc = (a, b) -> a + b;
        System.out.println(sc.concat("Hello, ", "World")); // Hello, World

        UpCaseConvert converter = s -> s.toUpperCase();
        System.out.println(converter.toUpper("hello"));    // HELLO
    }
}
```

# Question 2 Using (instance) Method reference create and apply add and subtract method and using (Static) Method reference create and apply multiplication method for the functional interface created

# Answer 2

```java
public class Java8 {

    @FunctionalInterface
    interface OperationInterface {
        int operation(int a, int b);
    }

    public static void main(String[] args) {
        InstanceClass ic = new InstanceClass();

        // Instance Method Reference
        OperationInterface adding = ic::sum;

        // Instance Method Reference
        OperationInterface substract = ic::substract;

        // Static Method Reference
        OperationInterface multiply = InstanceClass::multiply;

        System.out.println(adding.operation(5, 2)); // Output: 7
        System.out.println(substract.operation(5, 2)); // Output: 3
        System.out.println(multiply.operation(5, 2)); // Output: 10
    }

}

class InstanceClass {

    public int substract(int a, int b) {
        return a - b;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}
```

# Question 3 Implement multiple inheritance with default method inside interface.

# Answer 3 

```java

public class Testing {

    public static void main(String[] args) {
        Testing1 testing1 = new Testing1();
        testing1.methodA(); // Calls methodA from InterfaceA
        testing1.methodB(); // Calls methodB from InterfaceB
    }
}

interface InterfaceA {
    default void methodA(){
        System.out.println("Method A from InterfaceA");
    };

}

interface InterfaceB {
    default void methodB(){
        System.out.println("Method B from InterfaceB");
    };
}

class Testing1 implements InterfaceA, InterfaceB {

    @Override
    public void methodA() {
        System.out.println("Method A from InterfaceA");
    }

    @Override
    public void methodB() {
        System.out.println("Method B from InterfaceB");
    }
}

```

# Question 4 Write a program to implement constructor reference

# Answer 4

```java

public class ConstructorReference {

    @FunctionalInterface
    interface PersonFactory {
        Person create(String name);
    }

    public static void main(String[] args) {
        // Using constructor reference to create a Person object
        PersonFactory factory = Person::new;
        Person person = factory.create("John Doe");
        System.out.println(person.getName()); // Output: John Doe
    }
}

class Person {
    private String name;

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }
}

```
