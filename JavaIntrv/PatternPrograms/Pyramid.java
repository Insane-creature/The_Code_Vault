package PatternPrograms;

//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 

public class Pyramid {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= n-i; i++){
                System.out.println(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.println("*");
            }
            System.out.println();
        }

    }
}
