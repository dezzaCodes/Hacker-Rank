class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int ans = 1;
        
        for (int i = 0 ; i < nums. length ; i++) dp[i] = 1;
        
        for (int i = 1 ; i < nums.length ; i++) {      
            for (int j = 0 ; j < i ; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
                
            }
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}