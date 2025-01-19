class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        char[] c = s.toCharArray();
        int len = c.length;
        int cnt=0;

        for(int i=1;i<len;i++){
            if(c[i]=='('){
                cnt++;
                result.append('(');
            }else{
            if(cnt==0){
                i++;
            }
            else{
                result.append(')');
                cnt--;
            }
            }
        }
        return result.toString();
        
    }
}