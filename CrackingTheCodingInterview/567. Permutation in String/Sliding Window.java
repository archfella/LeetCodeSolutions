/* 
    Time: O(N), N = s2.length();
    Space: O(1) --> We use an int array of size 26.
*/

class Solution {
    public boolean zeroCount(int[] map){
        for(int i = 0; i < 26; i++){
            if(map[i] != 0) return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int len_s1 = s1.length(), len_s2 = s2.length();

        if(len_s1 > len_s2) return false;

        int[] map = new int[26];

        // Window initialization.
        for(int i = 0; i < len_s1; i++){
            map[s1.charAt(i) - 'a']++; // Chars from s1 --> increment value.
            map[s2.charAt(i) - 'a']--; // Chars from s2 --> decrement value.
        }
        if(zeroCount(map)) return true;

        for(int i = len_s1; i < len_s2; i++){
            /* 
                We move a window by one char to the right:
                    -> Increment the left of the window.
                    -> Decrement the right of the window.
            */
            map[s2.charAt(i - len_s1) - 'a']++; // Left side of the window.
            map[s2.charAt(i) - 'a']--; // Right side of the window.

            if(zeroCount(map)) return true; 
        }

        return false;
    }
}