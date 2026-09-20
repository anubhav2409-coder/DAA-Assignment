class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
         int maxSum=Integer.MIN_VALUE;


         boolean flag=true;
         int newSum=0;
         for(int i=0; i<n; i++){
            if(nums[i]>0){
                flag=false;
                break;
            } 
            newSum+=nums[i];
            maxSum=Math.max(maxSum, nums[i]);
         }
         if(flag) return maxSum;


         int currSum=0;
        for(int i=0; i<n; i++){
            currSum+=nums[i];
            if(currSum<0){
                currSum=0;
            }
            maxSum=Math.max(currSum, maxSum);
        }
        return maxSum;
    }
}