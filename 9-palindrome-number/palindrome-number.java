class Solution {
    public boolean isPalindrome(int x) {
        int copy = x;
        int ans =0;
        if(x<0){
            return false;
        }
        while(x!=0){
            int digit=x%10;
            ans=ans*10+digit;
            x/=10;
        }
    
        if(copy==ans){
            return true;
        }else{
            return false;
        }
        
    }
}