class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int n=s.length-1;
        char temp=0;
        while(i<=n/2){
            temp=s[i];
            s[i]=s[n-i];
            s[n-i]=temp;
            i++;
        }
    }
}