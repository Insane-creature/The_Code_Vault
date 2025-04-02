class myproject{
    public void show(){
        System.out.println("This is my project");
    }
    public String myquote(){
        return "Hey";
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
}

class newproject extends myproject{
    @Override
    public void show(){
        System.out.println("My project");
    }
}

public class finalMethod {
    public static void main(String[] args) {
        newproject newpro = new newproject();
        newpro.show();
        System.out.println(newpro.myquote());       // using sout as the method returns string but we need to print it as well
        newpro.add(5, 5);
    }
}
