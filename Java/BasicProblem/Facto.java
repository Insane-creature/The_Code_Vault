package BasicProblem;

public class Facto {
    static int factorial(int x){

        if (x == 0 || x == 1) { 
            return 1;
        }
        return x * factorial(x-1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
        // System.out.println(5);

    }
}
