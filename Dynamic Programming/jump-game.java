class Solution {
    public boolean canJump(int[] nums) {
        boolean[] dp = new boolean[nums.length];
        
        dp[0] = true;
        for (int i = 1 ; i < nums.length ; i++) {
            for (int j = 0 ; j < i ; j++) {
                dp[i] = nums[j] >= i - j ? dp[j] : dp[i];
            }
        }
        return dp[nums.length - 1];
    }
}