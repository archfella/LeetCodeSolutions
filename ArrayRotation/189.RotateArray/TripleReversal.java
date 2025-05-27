/*
    Time: O(N)
    Space: O(1)
*/
class Solution {
    private void reverse(int[] nums, int left, int right){
        /*
            Time: O(N)
            Space: O(1)
        */
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    public void rotate(int[] nums, int k) {
        k %= nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
}
