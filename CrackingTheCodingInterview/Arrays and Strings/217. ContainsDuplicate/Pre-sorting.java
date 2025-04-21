/* 
    Time: O(N*log(N)) --> Sorting.
    Space: O(1) --> No additional data structures used.
*/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        for(int i = 1; i < len; i++){
            if(nums[i] == nums[i-1])
                return true;
        }

        return false;
    }
}