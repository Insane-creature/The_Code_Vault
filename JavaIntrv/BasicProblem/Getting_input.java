package BasicProblem;

import java.io.IOException;
import java.util.Scanner;

public class Getting_input {
    public static void main(String[] args)
        throws IOException
    {
        // BufferedReader r = new BufferedReader(
        //     new InputStreamReader(System.in));

        // String s = r.readLine();

        // System.out.println("Printing the input data: "+s);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = scanner.nextLine();

        System.out.printf("You entered string " + s);
    }
}
