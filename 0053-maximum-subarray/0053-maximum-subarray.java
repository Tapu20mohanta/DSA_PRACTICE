class Solution {
    public int maxSubArray(int[] nums) {
        int ans=Integer.MIN_VALUE;
        int pre=0;
        for(int i=0;i<nums.length;i++){
            pre=pre+nums[i];
            pre=Math.max(pre,nums[i]);
            ans=Math.max(pre,ans);
        }
        return ans;
    }
}