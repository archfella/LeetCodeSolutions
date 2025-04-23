/*
    Time: O(N)
    Space: O(1)
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n <= 2){
            return n;
        }

        int write = 2;
        for(int i = 2; i < n; i++){
            /*
                For each element, we compare it to the element that is two places before in the write position: nums[write - 2].
                
                Why?
                    - Because you are only allowed at most 2. If the current element is the same as the one two spots before,
                    it means adding it would give you 3+ of the same, which you don't want.
                    
                    - If it's different, it means it's either a new number, or the second appearance of this number.
                    So, it's okay to keep.
                    You put it at nums[write] and move write forward.
            */
            if(nums[i] != nums[write-2]){
                nums[write++] = nums[i];
            }
        }
        return write;
    }
}