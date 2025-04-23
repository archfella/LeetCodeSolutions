/*
    Time: O(N)
    Space: O(1)
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        int curr = nums[0];
        int write = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] != curr){
                nums[write++] = nums[i];
                curr = nums[i];
            }
        }

        return write;
    }
}