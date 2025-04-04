class firstCal{
    public int add(int n1, int n2) {return n1+n2;}
    public int sub(int n1, int n2){return n1-n2;}
}

class AdvCalc extends firstCal{
    public int mul(int n1, int n2){return n1*n2;}
    public int div(int n1, int n2){return n1/n2;}
}

public class Calc {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int n1 = 200, n2 = 2;
        int r1 = obj.add(n1, n2);
        int r2 = obj.sub(n1, n2);
        int r3 = obj.mul(n1, n2);
        int r4 = obj.div(n1, n2);
        
        System.out.println(r1 + " " + r2 + " " + r3+ " " + r4);
    }
        
}
