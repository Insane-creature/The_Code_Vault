package BasicProblem;

// 9 is a neon number because 9 squared is 81, and 8 + 1 = 9. 
// square = n ** n;
// sum = 


public class NeonNumber {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n = 9;

        int square = n * n;       
        int temp = square;        
        int sum = 0;
        
        while(square != 0){
            temp = square % 10;      // 1
            sum = sum + temp;       // 1
            square = square/10;         // 81
        }

        if(n == sum){
            System.out.println("Is neon number");
        }
        else System.out.println("Isn't neon number");

    }
}
