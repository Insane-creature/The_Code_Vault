package Java;

class Human{
    private int age = 18;
    private String name = "Anshika";

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setName("Soni");

        System.out.println(obj.getName());
    }
    
}
