package BasicProblem;

import java.util.Scanner;

public class OneToNPrimenumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Prime numbers from 1 to " + n + ":");
        
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
} 

