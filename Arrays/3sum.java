class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        
        Arrays.sort(nums);
        
        for (int first = 0 ; first < nums.length - 2 ; first++) {
            int second = first + 1;
            int third = nums.length - 1;
            while (second < third){
                int sum = nums[first] + nums[second] + nums[third];
                if (sum == 0) set.add(Arrays.asList(nums[first], nums[second++], nums[third--]));
                else if (sum < 0) second++;
                else if (sum > 0) third--;
            }
        }
        return new ArrayList<>(set);
    }
}

/*

forgot how to:
- Arrays.asList(elements)

*/