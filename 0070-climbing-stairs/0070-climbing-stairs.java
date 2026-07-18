class Solution {
    public int climbStairs(int n) {
        if (n<=2) return n;
        int x=1;
        int y=2;
        int ans=0;
        for (int i = 3; i <= n; i++) {
            ans= x+y;
            x=y;
            y=ans;
        }
        return ans;
    }
}