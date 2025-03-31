package Java;

class A{
    public A() {
        super();
        System.out.println("In A");
    }
    public A(int n) {
        super();
        System.out.println("In A int");
    }
}

class B extends A{
    public B() {
        super();
        System.out.println("In B");
    }
    public B(int n) {
        super();
        System.out.println("In B int");
    }
}

public class MultiInheritance{
    public static void main(String[] args) {
        B obj = new B();
    }
}