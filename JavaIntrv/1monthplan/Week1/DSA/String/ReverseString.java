package DSA.String;

public class ReverseString {
    public static void main(String[] args) {
        String s[] = {"h","e","l","l","o"};
        StringBuilder res = new StringBuilder();

        for (String ch : s) {
            res.append(ch);
        }

        res.reverse();
        System.out.println(res.toString());
    }
}
