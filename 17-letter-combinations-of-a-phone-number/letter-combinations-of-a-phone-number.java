import java.util.ArrayList;
import java.util.List;

public class Solution {
    static String[] digitMapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    static int count = 0;

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        generateCombinations(digits, 0, "", result);
        return result;
    }

    public static void generateCombinations(String digits, int index, String current, List<String> result) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }

        char digit = digits.charAt(index);
        String mapping = digitMapping[digit - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            generateCombinations(digits, index + 1, current + mapping.charAt(i), result);
        }
    }
}