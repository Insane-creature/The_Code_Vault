package Java;

class Calc{
    public int add(int n1, int n2){
        return n1+n2;
    }
}

class AdvCalc{
    public int add(int n1, int n2){
        return n1+n2+1;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(3, 4);
        System.out.println(r1);

        Calc obj1 = new Calc();
        int r2 = obj1.add(4, 5);
        System.out.println(r2);

    }
}
