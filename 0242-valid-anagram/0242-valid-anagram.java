class Solution {
    public boolean isAnagram(String s, String t) {
     char [] s1=s.toCharArray();
     char[] t1=t.toCharArray();
     Arrays.sort(s1);
     Arrays.sort(t1);
      String ans1=new String(s1);  
      String ans2=new String(t1); 
      return ans1.equals(ans2); 
      
      
    }
}