import java.util.*;
public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "Codecat";

        System.out.println(solve(str));
        System.out.println(solveConstant(str));
    }
    // O(N) -Space Complexity
    public static Character solve(String str){
        Map<Character, Integer> counts = new HashMap<>();
        for (char ch : str.toCharArray()) {
            counts.put(ch, counts.getOrDefault(ch, 0) + 1);
        }
        int nonRepeatingCount = 0;
        for (char ch : str.toCharArray()) {
            if (counts.get(ch) == 1) {
                return ch;
            }
        }

        return null;
    }

    public  static Character solveConstant(String str){
        int[] counts = new int[256];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            counts[ch]++;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (counts[ch] == 1) {
                return ch;
            }
        }
        return null;
    }
}

