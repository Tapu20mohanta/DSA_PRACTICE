class Solution {
    public int lengthOfLongestSubstring(String s) {
       
        int size=0;
        HashSet<Character> set=new HashSet<>();
        int idx=0;
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                size=Math.max(size,set.size());
                while(s.charAt(idx)!=s.charAt(i)){
                    set.remove(s.charAt(idx++));
                   
                }
                idx++;
                // set.remove(s.charAt(idx++));
                
            }
            else    set.add(s.charAt(i));
        }
        return Math.max(size,set.size());
    }
}