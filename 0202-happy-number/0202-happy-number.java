class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        set.add(n);
        while(n!=1){
            int x=n;
            int ans=0;
            while(x!=0){
                int y=x%10;
                x=x/10;
                ans+=y*y;
            }
            if(set.contains(ans))   return false;
            n=ans;
            set.add(ans);
        }
        return true;
    }
}