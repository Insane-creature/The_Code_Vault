package Java;

class A{
    public A(){
        System.out.println("constructor: object creation");
    }
    public void show(){
        System.out.println("I'm in show");
    }
}

public class Anonymous {
    public static void main(String[] args) {
        // A obj = new A();
        // obj.show();

        new A();    // anonymous object creation
        new A().show();

        // Note: Everytime you write new a() it will create a new object

    }
}
