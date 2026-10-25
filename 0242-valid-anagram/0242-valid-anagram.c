bool isAnagram(char* s, char* t) {
    int ar1[26];
    int ar2[26];
    int i=0;
    while(s[i]!='\0'){
        ar1[s[i++]-'a']++;
    }
    i=0;
    while(t[i]!='\0'){
        ar2[t[i++]-'a']++;
    }
    for(i=0;i<26;i++){
        if(ar1[i]!=ar2[i]){
            return false;
        }
    }
    return true;
}