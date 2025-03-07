// The year is multiple of 400.
// The year is a multiple of 4 and not a multiple of 100.


package BasicProblem;

public class LeapYear {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n = 2020;

        if((n%400 == 0 || n%4 == 0)&&n%100 != 0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a Leap year");
        }
        
    }
}
