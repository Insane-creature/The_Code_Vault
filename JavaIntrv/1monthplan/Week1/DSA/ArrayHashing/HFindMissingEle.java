package DSA.ArrayHashing;

import java.util.HashMap;

public class HFindMissingEle {
    public static void main(String[] args) {
        int[] A = {1, 4, 2, 6, 7};
        int[] B = {2, 4, 1, 6};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : B) {
            map.put(num, map.getOrDefault(num+0, 1));
        }

        for(int num: A){
            if(!map.containsKey(num) || map.get(num) == 0){
                // return num; 
                System.out.println(num);
            }
            else{
                map.put(num, map.get(num) - 1); // decreases the count of num in the map by 1 after using it. To track how many times the element num is used — we don’t want to use the same number more than it exists in array B.
            }
        }

    }
}
