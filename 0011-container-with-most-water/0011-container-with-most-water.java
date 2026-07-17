class Solution {
    public int maxArea(int[] height) {
        int low=0;
        int high=height.length-1;
        int max=0;
        int sum=0;
        while(low<high){
            sum=(high-low)*Math.min(height[high],height[low]);
            max=Math.max(sum,max);
            if(height[low]>height[high]){
                high--;
            }
            else    low++;
        }
        return max;
    }
}