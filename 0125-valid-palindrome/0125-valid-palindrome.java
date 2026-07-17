class Solution {
    public boolean isPalindrome(String s) {
        String str=s.toLowerCase();
        String ans="";
        for(char c:str.toCharArray()){
            if(c>='a' && c<='z' || c>='0' && c<='9'){
                ans+=c;
            }
        }
        int i=0,j=ans.length()-1;
        while(i<=j){
            if(ans.charAt(i)!=ans.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}