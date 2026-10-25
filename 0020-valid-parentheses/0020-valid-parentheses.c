bool isValid(char* s) {
    char stack[10001];
    int top=-1;
    int i=0;
    char c,stop;
    while(s[i]!='\0'){
        char c=s[i];
        if(c=='(' || c=='{' || c=='['){
            stack[++top]=c;
        }
        else{
            if(top==-1){
                return false;
            }
            else{
                stop=stack[top];
                if((stop=='(' && c!=')') || (stop=='{' && c!='}') || (stop=='[' && c!=']')){
                    return false;
                }
                top--;
            }
        }
        i++;
    }
    return top==-1;
}