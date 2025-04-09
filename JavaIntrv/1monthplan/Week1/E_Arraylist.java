
import java.util.ArrayList;
import java.util.Collection;

public class E_Arraylist {
    public static void main(String[] args) {
        // Collection obj = new ArrayList<>();
        // obj.add(3);  // 3 here will be stored as objected not integer
        // System.out.println(obj);

        Collection<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(5);
        nums.add(9);
        // System.out.println(nums);

        for(int n: nums){
            System.out.println(n);
        }

    }
}
