class Solution {
    public int maxProfit(int[] prices) {
        int ans=0;
        int size=prices.length;
        int [] min=new int[size];
        int [] max=new int[size];
        min[0]=prices[0];
        for(int i=1;i<size;i++){
           min[i]=Math.min(min[i-1],prices[i]);
        }
        max[size-1]=prices[size-1];
        for(int i=size-2;i>=0;i--){
           max[i]=Math.max(max[i+1],prices[i]);
        }
        for(int i=0;i<size;i++){
            ans=Math.max(max[i]-min[i],ans);
        }
        return ans;
    }
}