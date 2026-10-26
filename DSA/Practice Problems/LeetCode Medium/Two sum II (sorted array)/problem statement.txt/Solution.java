class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int NOT_FOUND = -1;
        //constraints
        int low = 0;
        int high = numbers.length - 1;
        //keep track of the sum
        int sum = 0;
        //iterate through the array -> while low < high (never equal - we cant use the same element twice)
        while(low < high){
            sum = numbers[low] + numbers[high];
            if(sum == target){
                //indexes were found
                return new int[]{low + 1,high + 1};
            }else if(sum > target){
                //shift to the left -> get a smaller cummulative sum -> since array is sorted
                high--;
            }else if(sum < target){
                //shift to the right -> get a bigger cummulative sum
                low++;
            }

        }
        //if no value was found
        return new int[]{NOT_FOUND,NOT_FOUND};       
    }
}
