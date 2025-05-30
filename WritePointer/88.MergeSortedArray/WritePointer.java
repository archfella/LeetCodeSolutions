/*
    Time: O(m+n)
    Space: O(1)
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n-1;
        int k = m + n - 1;

        /*  
            If there are still elements left in nums1,
            we don't need to do anything because they
            are already in their correct place.
        */
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i--];
            } else {
            nums1[k] = nums2[j--];
        }

        k--;
        }
    }
}