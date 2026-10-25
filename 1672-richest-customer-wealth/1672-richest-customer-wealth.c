int maximumWealth(int** accounts, int accountsSize, int* accountsColSize) {
    int sum=0,max=INT_MIN;
    for(int i=0;i<accountsSize;i++){
        sum=0;
        for(int j=0;j<accountsColSize[i];j++){
            sum+=accounts[i][j];
        }
        max=fmax(sum,max);
    }
    return max;
}