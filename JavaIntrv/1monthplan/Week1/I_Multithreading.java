 class A extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi from B");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class I_Multithreading {
    public static void main(String[] args) {
        A obj = new A();
        B obj1 = new B();

        // Every thread has some priority: range-> 1 to 10: 5 is mid
        // System.out.println(obj1.getPriority());

        // Setting priority to 2 means high 
        // You can't exactly set the priority but jsut suggest it to schedular to run this on priority
        // obj1.setPriority(2);
        // obj1.setPriority(Thread.MAX_PRIORITY);


        obj.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException ex) {
        }
        obj1.start();

    }
}
