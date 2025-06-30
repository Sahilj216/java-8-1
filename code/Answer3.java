public class Answer3 {

    public static void main(String[] args) {
        Testing1 obj = new Testing1();
        obj.methodA(); // Output: Method A from InterfaceA
        obj.methodB(); // Output: Method B from InterfaceB
    }
}

interface InterfaceA {
    default void methodA() {
        System.out.println("Method A from InterfaceA");
    }
}

interface InterfaceB {
    default void methodB() {
        System.out.println("Method B from InterfaceB");
    }
}

class Testing1 implements InterfaceA, InterfaceB {
    @Override
    public void methodA() {
        InterfaceA.super.methodA();
    }

    @Override
    public void methodB() {
        InterfaceB.super.methodB();
    }
}
