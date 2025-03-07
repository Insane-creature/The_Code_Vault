package BasicProblem;

public class AddTwoBinaryStrings {
    public static void main(String[] args) {
        String a1 = "10", a2 = "01";
        System.out.println("hey");

        int num1 = Integer.parseInt(a1);
        int num2 = Integer.parseInt(a2);

        // System.out.println(num1+" "+num2);

        int sum = num1 + num2;

        System.out.println(Integer.toBinaryString(sum));

    }
}
