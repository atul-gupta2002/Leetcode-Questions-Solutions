class Solution {
    public boolean valid(int[] dist, double hour,double speed){
        double hr=0;
        for(int i=0;i<dist.length-1;i++){
            hr+=Math.ceil((double)(dist[i]/speed));
        }
        hr+=(double)(dist[dist.length-1]/speed);
        if(hr<=hour){
            return true;
        }
        else{
            return false;
        }
    }
    public int minSpeedOnTime(int[] dist, double hour) {
        int st=0;
        int end = (int) Math.pow(10, 7);
;
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(valid(dist,hour,mid)){
                ans=mid;
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return ans;
    }
}