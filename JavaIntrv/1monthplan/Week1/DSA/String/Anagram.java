package DSA.String;

public class Anagram {
    public static boolean isAnagram(String str1, String str2) {
        if(str1.length() != str2.length()) return false;

        int[] freq = new int[26]; // assuming lowercase letters only

        for(int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i) - 'a']++;
            freq[str2.charAt(i) - 'a']--;
        }

        for(int count : freq) {
            if(count != 0) return false;
        }

        return true;
    }
yjy
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";

        // HashMap<Character, Integer> map = new HashMap<>();
        
        // if(s.length() != t.length()) System.out.println("Not Anagram");
        // char freq_arr[] = {26};

        // for (var each : collection) {
            
        // }
        System.out.println(isAnagram("listen", "silent"));

    }
}
