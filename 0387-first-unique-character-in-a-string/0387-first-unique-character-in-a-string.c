int firstUniqChar(char* s) {
    int arr[26];
    int i=0;
    while(s[i]!='\0'){
        arr[s[i++]-'a']++;
    }
    i=0;
    while(s[i]!='\0'){
        if(arr[s[i]-'a']==1){
            return i;
        }
        i++;
    }
    return -1;
}