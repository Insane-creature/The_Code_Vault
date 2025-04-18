package DSA.Array;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int facto = 1;

        if (n < 0) {
            System.out.println("Doesn't exist.");
        } else {
            int i = 1;
            while (i <= n) {
                facto *= i;
                i++;
            }
            System.out.println("Factorial of " + n + " is: " + facto);
        }

    }
}
