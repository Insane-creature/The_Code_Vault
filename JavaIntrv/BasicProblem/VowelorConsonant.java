package BasicProblem;

public class VowelorConsonant {

    static  String Vowel_Or_Consonant(char ch){
        String str = "aeiouAEIOU"; 
        return (str.indexOf(ch) != -1) ? "Vowel": "Consonant";
    }

    public static void main(String[] args) {
        // char ch = 'a';
        System.out.println(Vowel_Or_Consonant('a'));

    }
}
