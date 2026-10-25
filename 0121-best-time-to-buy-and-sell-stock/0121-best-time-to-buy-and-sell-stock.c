int maxProfit(int* prices, int pricesSize) {
    int pre[pricesSize];
    int post[pricesSize];
    pre[0]=prices[0];
    post[pricesSize-1]=prices[pricesSize-1];
    for(int i=1;i<pricesSize;i++){
        pre[i]=fmin(prices[i],pre[i-1]);
    }
    for(int i=pricesSize-2;i>=0;i--){
        post[i]=fmax(prices[i],post[i+1]);
    }
    int min=0;
    for(int i=0;i<pricesSize;i++){
        min=fmax(min,post[i]-pre[i]);
    }
    return min;
}