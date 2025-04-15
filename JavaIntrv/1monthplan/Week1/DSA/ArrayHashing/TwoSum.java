package DSA.ArrayHashing;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
   
   public static int[] returning_target(int[] nums, int target) {
      HashMap<Integer, Integer> map = new HashMap<>();

      for (int i = 0; i < nums.length; i++) {
         int complement = target - nums[i];
         if (map.containsKey(complement)) {
            return new int[]{map.get(complement), i};  // return both indices
         }
         map.put(nums[i], i);  // store current number with its index
      }

      return new int[0];  // no pair found
   }

   public static void main(String[] args) {
      int[] arr = {2, 7, 9, 11, 13};
      int target = 9;
      int[] result = returning_target(arr, target);
      
      System.out.println(Arrays.toString(result));  // nicely formatted output
   }
}
