class Solution {
    public int minSubarray(int[] nums, int p) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=(sum+nums[i])%p;
        }
        int rem=sum%p;
        if(rem==0){
            return 0;
        }
        int res = nums.length;
        int curSum = 0;
        Map<Integer, Integer> remainToIdx = new HashMap<>();
        remainToIdx.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            curSum = (curSum + nums[i]) % p;
            int prefix = (curSum - rem + p) % p;
            
            if (remainToIdx.containsKey(prefix)) {
                int length = i - remainToIdx.get(prefix);
                res = Math.min(res, length);
            }

            remainToIdx.put(curSum, i);
        }
        return res == nums.length ? -1 : res;
    }
}