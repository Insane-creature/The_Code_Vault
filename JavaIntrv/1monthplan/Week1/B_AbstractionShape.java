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

public class B_AbstractionShape {
    public static void main(String[] args) {
        childClass obj = new childClass();
        obj.drive();
        obj.playMusic();
    }
}
