package BasicProblem;

// 0, 1, 1, 2, 3, 5, 8, 13, 21, 

public class sumofFibonacci {
    static void printFibonacci(int x){
        // if (x == 0 || x == 1) { // Base case
        //     return 1;
        // }
        int sum = 0;
        int num1 = 0, num2 = 1;
        for(int i = 0; i < x; i++){
            System.out.print(num1 + ", ");      // 0, 1, 1

            sum = sum + num1;

            int num3 = num1+num2;   // 1
            num1 = num2;            // 1
            num2 = num3;            // 1
        }
        System.out.println(" Sum is: "+sum);
        
    }
    public static void main(String[] args) {
        int n = 9;
        printFibonacci(n);
    }
}
