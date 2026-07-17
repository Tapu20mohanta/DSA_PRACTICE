class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s=strs[0];
        int idx=strs[0].length();
        boolean pre=true;
        while(idx>=0){
            String sub=s.substring(0,idx);
            pre=true;
            for(int i=1;i<strs.length;i++){
                if(!strs[i].startsWith(sub)){
                    pre =false;
                }
            }
            if(pre) return sub;
            idx--;
        }
        return "";
    }
}