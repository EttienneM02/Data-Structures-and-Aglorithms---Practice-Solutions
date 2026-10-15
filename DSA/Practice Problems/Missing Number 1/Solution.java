class Solution {
    public int missingNumber(int[] nums) {
        //a sum of the range == sum of the values
        int valuesum = 0;
        int rangesum = 0;
        for(int i = 0; i < nums.length;i++){
            valuesum += nums[i];
           
        }
        //get the sum of the the range
        //n(n+1)/2
        int n = nums.length;
         rangesum = (n*(n+1)/2);//get the sum of the entire range
        if(valuesum != rangesum){
            return rangesum - valuesum;
        }
    return 0;//if no value was found -> return 0
   }
}
