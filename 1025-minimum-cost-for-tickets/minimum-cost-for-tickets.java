class Solution {
    HashSet<Integer> set = new HashSet<>();
    public int mincostTickets(int[] days, int[] costs) {
        int lastDay = days[days.length - 1] + 30;
        int dp[] = new int[lastDay + 1];
        Arrays.fill(dp, -1);
        for (int day : days) {
            set.add(day);
        }
        return recur(dp, days, costs, days[0]);
       
    }

    int recur(int[] dp, int[] days, int[] costs, int currDay) {
        // base case
        if (currDay > days[days.length - 1]) {
            dp[currDay] = 0;
            return 0;
        }
        if (dp[currDay] != -1) {
            return dp[currDay];
        }
        
        if (!set.contains(currDay)) {
            dp[currDay] = recur(dp, days, costs, currDay + 1); 
            return dp[currDay];
         
        }
       
        int oneDay = costs[0] + recur(dp, days, costs, currDay + 1);
        int sevenDay = costs[1] + recur(dp, days, costs, currDay + 7);
        int thirtyDay = costs[2] + recur(dp, days, costs, currDay + 30);
        dp[currDay] = Math.min(oneDay, Math.min(sevenDay, thirtyDay));
        return dp[currDay];
    }
}