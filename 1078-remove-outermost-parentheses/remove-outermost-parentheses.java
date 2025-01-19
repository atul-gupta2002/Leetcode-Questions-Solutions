class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int cnt=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                cnt--;
            }
            if(cnt!=0){
                result.append(s.charAt(i));
            }
            if(s.charAt(i)=='('){
                cnt++;
            }
        }
        return result.toString();
        
    }
}