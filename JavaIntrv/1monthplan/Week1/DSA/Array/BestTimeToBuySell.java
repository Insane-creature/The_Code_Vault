package DSA.Array;

public class BestTimeToBuySell {
    public static void main(String args[]){
        int []arr = {7,1,5,3,6,4};
        int n = arr.length;

        int min_price = Integer.MAX_VALUE;
        int max_profit = 0;

        for (int price : arr) {
            if (price < min_price) {
                min_price = price;
            } else if (price - min_price > max_profit) {
                max_profit = price - min_price;
            }
        }
        System.out.println(max_profit);

    }
}
