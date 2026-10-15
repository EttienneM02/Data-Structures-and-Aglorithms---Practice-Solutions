class Solution {
    //we need to keep track of each element postion -> check if element a == b -> RETURN TRUE
    public boolean containsDuplicate(int[] nums) {
        int x = 0, y = 0;
        for(int i = 0; i < nums.length; i++){
            int index = i;
            x = nums[i];
            for(int j = index + 1; j < nums.length;j++)
            {
                y = nums[j];
                //compare the sum
                
                if(x == y){
                    return true;
                }    
            }
        }
        return false;
    }
  //Notes:
  // the solution runs at O(n)^2 and needs to be optimized -> planning on looking at solutions to use :)
}
