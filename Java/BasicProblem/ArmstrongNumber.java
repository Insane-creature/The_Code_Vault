package BasicProblem;

public class ArmstrongNumber {
    static int power(int r, int n){
        if(n == 0){return 1;}
        int halfpower = power(r, n / 2);
        if (n % 2 == 0){
            return halfpower * halfpower;
        }
        return  r * halfpower * halfpower;

    }   

    static int order(int x)
    {
        int n = 0;
        while (x != 0) {
            n++;
            x = x / 10;
        }
        return n;
    }
    public static void main(String[] args) {
        int x = 1;
        int sum = 0;
        int n = order(x);
        int temp = x;
        while(temp != 0){
            int r = temp % 10;
            sum += power(r, n);
            temp /= 10;
        }
        if (sum == x){System.out.println("Is Armstrong number");}
        else System.out.println("Not an Armstrong number");



        // System.out.println(sum);

    }
}
