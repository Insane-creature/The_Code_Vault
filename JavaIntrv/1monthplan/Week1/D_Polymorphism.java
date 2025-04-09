class firstClass{
    
    // Method overloading: same name different parameters
    public int add(int n1, int n2){
        return n1+n2;
    }
    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    public void firstproject(){
        System.out.println("Some feature");
    }
}

class secondclass extends firstClass{
    @Override
    public void firstproject(){
        System.out.println("Other feature");
    }
}

public class D_Polymorphism {
    public static void main(String[] args) {
        firstClass obj = new firstClass();
        int n1 = 3, n2 = 4, n3 = 6;
        // System.out.println(obj.add(n1, n2));
        // System.out.println(obj.add(n1, n2, n3));
        secondclass obj1 = new secondclass();
        obj1.firstproject();
    }
}

