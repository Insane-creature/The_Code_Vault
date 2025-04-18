package DSA.Array;

public class Fibonacci {
    static int fibo(int n){
        int res = 0;
        if (n < 0 ){return n;}
        else if(n ==0 || n == 1){return n;}
        else{return fibo(n-1) + fibo(n-2);}
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fibo(n));
    }
}
