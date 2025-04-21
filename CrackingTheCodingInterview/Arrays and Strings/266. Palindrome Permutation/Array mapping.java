/* 
    Time: O(N), N = s.length()
    Space: O(1) --> We use an int array of size 128.
*/

class Solution {
    public boolean canPermutatePalindrome(String s) {
        int[] map = new int[128];
        for(int i = 0; i < s.length(); i++){
            map[s.charAt(i)]++;
        }

        /* 
            count - Number of characters that doesn't have a match.
            There can be only ONE character that DOESN'T HAVE A MATCH.
         */
        int count = 0; 
        for(int i = 0; i < 128; i++){
            count += map[i] % 2;
        }

        return count <= 1;
    }
}