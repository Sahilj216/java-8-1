public class Answer1 {

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
