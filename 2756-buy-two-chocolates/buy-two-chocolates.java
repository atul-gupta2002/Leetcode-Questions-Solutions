class Solution {
    public int buyChoco(int[] prices, int money) {
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(min1>prices[i]){
                min2=min1;
                min1=prices[i];
            }else{
                min2=Math.min(min2,prices[i]);
            }
        }
        if(min1+min2<=money){
            return money-(min1+min2);
        }
        return money;  
        
    }
}