class Solution {
    public String minRemoveToMakeValid(String s) {
        char[] ch = s.toCharArray();
        int balance = 0;  
        // first pass for extra )
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '(') {
                balance++;
            } else if (ch[i] == ')') {
                if (balance == 0) {
                    ch[i] = 0; // mark invalid 
                } else {
                    balance--;
                }
            }
        }
        // second pass for extra (
        balance = 0;
        for (int i = ch.length - 1; i >= 0; i--) {
            if (ch[i] == ')') {
                balance++;
            } else if (ch[i] == '(') {
                if (balance == 0) {
                    ch[i] = 0; // mark invalid 
                } else {
                    balance--;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : ch) {
            if (c != 0) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}