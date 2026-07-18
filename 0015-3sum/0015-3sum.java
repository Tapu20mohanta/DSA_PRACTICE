class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> set=new HashSet<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            int low=i+1;
            int high=n-1;
           
            while(low<high){
                int total=nums[low]+nums[high]+nums[i];
                if(total==0){
                    List<Integer> li=Arrays.asList(nums[i],nums[low],nums[high]);
                    Collections.sort(li);
                    set.add(li);
                    low++;
                    high--;
                }
                else if(total<0){
                    low++;

                }
                else    high--;
            }
        }
        return new ArrayList<>(set);
    }
}