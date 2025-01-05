public class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] shiftEffect = new int[n + 1];
        
        // Build the shiftEffect array
        for (int[] shift : shifts) {
            int start = shift[0], end = shift[1], direction = shift[2];
            int shiftValue = (direction == 1) ? 1 : -1;
            shiftEffect[start] += shiftValue;
            if (end + 1 < n) {
                shiftEffect[end + 1] -= shiftValue;
            }
        }
        
        // Compute the cumulative shift
        int cumulativeShift = 0;
        for (int i = 0; i < n; i++) {
            cumulativeShift += shiftEffect[i];
            shiftEffect[i] = cumulativeShift;
        }
        
        // Apply the shifts to the string
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char originalChar = s.charAt(i);
            int newCharIndex = (originalChar - 'a' + shiftEffect[i]) % 26;
            if (newCharIndex < 0) {
                newCharIndex += 26; // Handle negative shifts
            }
            char newChar = (char) ('a' + newCharIndex);
            result.append(newChar);
        }
        
        return result.toString();
    }
}