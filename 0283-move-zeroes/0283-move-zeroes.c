void moveZeroes(int* nums, int numsSize) {
    int i=0;
    int j=0;
    for(j=0;j<numsSize;j++){
        if(nums[j]!=0){
            nums[i++]=nums[j];
        }
    }
    for(i;i<numsSize;i++){
        nums[i]=0;
    }
}