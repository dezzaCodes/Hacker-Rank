class Solution {
    public int maxProduct(int[] nums) {
        int big = nums[0], small = nums[0];
        int max = nums[0], min = nums[0];
        int ans = nums[0];
        
        for (int i = 1 ; i < nums.length ; i++) {
            max = Math.max(nums[i], Math.max(big * nums[i], small * nums[i]));
            min = Math.min(nums[i], Math.min(big * nums[i], small * nums[i]));
            
            ans = max > ans ? max : ans;
            
            big = max;
            small = min;
        }
        return ans;
    }
}