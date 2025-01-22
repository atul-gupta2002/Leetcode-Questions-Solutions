class Solution {
    public int reverse(int n) {
        long ans=0;
       while(n!=0){
            int digit=n%10;
            ans = ans *10 + digit;
            n/=10;
        }
        return (ans<Integer.MIN_VALUE || ans>Integer.MAX_VALUE ? 0:(int) ans);
      
        
    }
}