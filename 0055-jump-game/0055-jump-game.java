class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return true;
        boolean[] dp = new boolean[nums.length];
        Arrays.fill(dp, false);
        dp[0] = true;
        for (int i = 0; i < n; i++) {
            if (dp[i] == true) {

                int num = nums[i];
                for (int j = i + 1; j <= i + num && j < n; j++) {
                    dp[j] = true;
                }
            }
            else return false;

        }
        return dp[n - 1];
    }
}