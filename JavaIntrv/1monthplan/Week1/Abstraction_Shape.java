abstract class Caro{
    public abstract void drive(); 
    public void playMusic(){
        System.out.println("play music");
    }
}

class childClass extends Caro{

    @Override
    public void drive() {
        System.out.println("Implementation of abstract method");
    }
    
}

public class Abstraction_Shape {
    public static void main(String[] args) {
        Caro obj = new Caro();
        obj.drive();
        obj.playMusic();
    }
}
