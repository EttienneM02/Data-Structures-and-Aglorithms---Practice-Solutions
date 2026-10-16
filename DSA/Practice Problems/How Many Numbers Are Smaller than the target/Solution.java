class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        //create a list to keep track of elements
        //List<Integer> targetlist = new ArrayList<>();
        int size = nums.length;

        int[] targetlist = new int[size];
        int sumvals = 0;//keep track of the number of elements smaller than target
         int currentval = 0;
         int nextval = 0;
        for(int i = 0; i < nums.length;i++){
            targetlist[i] = 0;//set the sum of all values equal to zero 
           currentval = nums[i];//get the current value
            for(int j = 0; j < nums.length;j++){
                //iterate through the second set -> i != j
                if(i == j){
                    continue;//stop the iterative process
                }
                //count the number of small values
                nextval = nums[j];
                if(nextval < currentval)
                {
                    //increment the sum
                    sumvals++;
                }
                //continue the inner iteration
            }

            //targetlist.add(sumvals);
            targetlist[i] = sumvals;
            sumvals = 0;//reset the sum
        }
        return targetlist;
    }
}
