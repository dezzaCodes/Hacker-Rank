class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int curr = -1;
        
        for (int num : nums) {
            curr = curr < 0 ? num : curr + num;
            max = curr > max ? curr : max;
        }
        return max;
    }
}