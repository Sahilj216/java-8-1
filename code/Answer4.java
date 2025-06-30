public class Answer4 {

    @FunctionalInterface
    interface PersonFactory {
        Person create(String name);
    }

    public static void main(String[] args) {
        PersonFactory factory = Person::new;
        Person person = factory.create("John Doe");
        System.out.println("Person Name: " + person.getName()); // Output: John Doe
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
