import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();

        int num_1 = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb");
        System.out.println("num_1=" + num_1);

        int num_2 = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbbb");
        System.out.println("num_2=" + num_2);
        int num_3 = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew");
        System.out.println("num_3=" + num_3);

    }

    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();

        int max = 0;

        for (int i = 0; i < chars.length; i++) {
            HashMap<Character, Object> objects = new HashMap<>();
            for (int j = i; j < chars.length; j++) {
                if (!objects.containsKey(chars[j])) {
                    objects.put(chars[j], null);
                } else {
                    break;
                }
            }
            if (max < objects.size()) {
                max = objects.size();
            }
        }

        return max;
    }
}
