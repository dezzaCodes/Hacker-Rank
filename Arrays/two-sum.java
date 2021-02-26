class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0 ; i < nums.length ; i++) map.put(nums[i], i);
        
        for (int i = 0 ; i < nums.length ; i++) {
            int complement = target - nums[i];
            
            if (map.containsKey(complement) && i != map.get(complement)) {
                return new int[] {i, map.get(complement)};
            }
        }
        return new int[0];
    }
}

/*

forgot how to instaniate hashmap
forgot containsKeys and get, not getValue
forgot how to return new int[] with values

*/