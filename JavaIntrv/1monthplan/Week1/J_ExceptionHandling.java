public class J_ExceptionHandling {
    public static void main(String[] args) {
        int i = 0;
        int j = i/2;
        try {
            System.out.println(j);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}
