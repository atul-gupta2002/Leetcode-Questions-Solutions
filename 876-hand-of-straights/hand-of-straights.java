class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n=hand.length;
        if(n%groupSize!=0){
            return false;
        }
        Arrays.sort(hand);
        for(int i=0;i<n;i++){
            if(hand[i] >=0){
                if(!check(hand,groupSize,i)){
                    return false;
                }
            }
        }
        return true;
        
    }
    boolean check(int[] hand, int groupSize,int i){
        int n=hand.length;
        int x=hand[i]+1;
        hand[i]=-1;
        int count=1;
        i++;
        while(count<groupSize && i<n){
            if(hand[i]== x){
                x=hand[i]+1; 
                hand[i]=-1;
                count++;
            }
            i++;
        }
        if(count!=groupSize){
            return false;
        }
        else{
            return true;
        }
    }
}