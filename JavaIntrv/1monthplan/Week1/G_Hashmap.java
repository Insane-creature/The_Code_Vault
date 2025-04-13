
import java.util.HashMap;

public class G_Hashmap {
    public int[] TwoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            if (mpp.containsKey(complement)) {
                return new int[] { mpp.get(complement), i };
            }
            mpp.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[] args) {
        int nums[] = {2,9,3,12,1};
        int target = 11;

        G_Hashmap obj = new G_Hashmap();
        int[] result = obj.TwoSum(nums, target);

        System.out.println(result[0] + ", " + result[1]);

    }
}
