class Solution {
    public int longestPalindrome(String s, String t) {
        int maxLength = 1; 
        int len1 = s.length();
        int len2 = t.length();
        
        // Check all possible substrings from s and t
        for (int i = 0; i <= len1; i++) {
            for (int j = i; j <= len1; j++) {
                String sSub = s.substring(i, j); // Substring from s
                
                for (int k = 0; k <= len2; k++) {
                    for (int l = k; l <= len2; l++) {
                        String tSub = t.substring(k, l); // Substring from t
                        
                        String combined = sSub + tSub; // Concatenate
                        
                        if (isPalindrome(combined)) {
                            maxLength = Math.max(maxLength, combined.length());
                        }
                    }
                }
            }
        }
        return maxLength;
    }

    // Function to check if a string is a palindrome
    private boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}