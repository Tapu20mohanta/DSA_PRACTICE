int maxProfit(int* prices, int pricesSize) {
    int min=prices[0];
    int result=0;
    for(int i=1;i<pricesSize;i++){
       min=fmin(min,prices[i]);
       result=fmax(result,prices[i]-min);
    }
    return result;
}