class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        ArrayList<String> dict = new ArrayList<>(wordDict);
        
        dp[0] = true;
        for (int i = 1 ; i <= s.length() ; i++) {
            for (int j = 0 ; j < i ; j++) {
                if (dp[j] && dict.contains(s.substring(j, i))) dp[i] = true;
            }
        }
        return dp[s.length()];
    }
}