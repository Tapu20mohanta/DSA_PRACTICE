class Solution {
    public int lengthOfLongestSubstring(String s) {
       
        int size=0;
        HashSet<Character> set=new HashSet<>();
        int idx=0;
        for(int i=0;i<s.length();i++){
            
                while(set.contains(s.charAt(i))){
                    size=Math.max(size,set.size());
                    set.remove(s.charAt(idx++));
                   
                }
                // idx++;
                // set.remove(s.charAt(idx++));
                
            
             set.add(s.charAt(i));
        }
        return Math.max(size,set.size());
    }
}