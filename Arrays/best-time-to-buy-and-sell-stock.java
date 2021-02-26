class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0], profit = 0;
        
        for (int num : prices) {
            min = num < min ? num : min;
            profit = num - min > profit ? num - min : profit;
        }
        return profit;
    }
}

/*

forgot ternary operators

*/