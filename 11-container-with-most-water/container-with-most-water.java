class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxi=Integer.MIN_VALUE;
         while(left<right){
            int mini=Math.min(height[left],height[right]);
            int width=right-left;
            int area=mini*width;
            maxi=Math.max(maxi,area);

            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
         }

        return maxi;
        
    }
}