int maxProfit(int* prices, int pricesSize) {
    int min=prices[0];
    int result=0;
    for(int i=1;i<pricesSize;i++){
       if(prices[i]<min){
            min=prices[i];
       }
       else if(prices[i]-min>result){

        result=fmax(result,prices[i]-min);
       }
    }
    return result;
}