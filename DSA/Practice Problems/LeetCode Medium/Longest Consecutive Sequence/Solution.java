class Solution {
    public int longestConsecutive(int[] nums) {
        //using a hashset to stor elements uniquely
        
        Set<Integer> set = new HashSet<>();
        int longest = 0;
        int count = 0;
        //add all the values into the set
        for(int i : nums){
            set.add(i);//set will skip duplicate values
        }

        //iterate through the set
        for(Integer i : set){
            //chek if the current value of the set if a starting point -> starting points have no left neighbour -> prev = curr - 1 (consequtively)
            if(!set.contains(i - 1)){
                //no left niegbours -> starting point was found
                count = 0;
                while(set.contains(i + count)){
                    count++;
                }
            }
            longest = Math.max(longest,count);
        }
        return longest;
    }
}
