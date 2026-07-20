class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int [] right=new int[n];
        int [] left=new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(st.size()>0 && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            right[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        Stack<Integer>str=new Stack<>();
        for(int i=0;i<n;i++){
            while(str.size()>0 && heights[str.peek()]>=heights[i]){
                str.pop();
            }
            left[i]=str.isEmpty()?-1:str.peek();
            str.push(i);
        }
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,heights[i]*(right[i]-left[i]-1));
        }
        return max;
    }
}