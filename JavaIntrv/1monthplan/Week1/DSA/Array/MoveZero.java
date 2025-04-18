package DSA.Array;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int nums[] = {0,4,1,0,3,12};
        int n = nums.length;

        int left = 0;   // 0-0
        for (int right = 0; right < n; right++){    // right -> 1
            if(nums[right] != 0){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
        System.out.println(Arrays.toString(nums));

    }
}

