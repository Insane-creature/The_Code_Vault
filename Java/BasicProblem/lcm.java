package BasicProblem;

public class lcm {
    public static void main(String[] args) {
        int a = 15, b = 25;

        int ans = (a > b) ? a : b;

        while (true) {
            if (ans % a == 0 && ans % b == 0){
                break;
            }
            ans++;
        }
        System.out.println(ans);

    }
}


// GCD - Greatest common divisior

// a x b == LCM(a, b) x GCD(a, b)
// LCM(a, b) = (a x b) / GCD(a, b)

