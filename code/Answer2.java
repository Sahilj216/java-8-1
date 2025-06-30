public class Answer2 {

    @FunctionalInterface
    interface OperationInterface {
        int operation(int a, int b);
    }

    public static void main(String[] args) {
        InstanceClass ic = new InstanceClass();

        // Instance Method Reference
        OperationInterface adding = ic::sum;
        OperationInterface subtract = ic::subtract;

        // Static Method Reference
        OperationInterface multiply = InstanceClass::multiply;

        System.out.println("Add: " + adding.operation(5, 2));      // Output: 7
        System.out.println("Subtract: " + subtract.operation(5, 2)); // Output: 3
        System.out.println("Multiply: " + multiply.operation(5, 2)); // Output: 10
    }
}

class InstanceClass {
    public int subtract(int a, int b) {
        return a - b;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}
