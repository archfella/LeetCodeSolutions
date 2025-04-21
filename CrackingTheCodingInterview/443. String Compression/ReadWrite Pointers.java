/* 
    Time: O(N), N = chars.length()
    Space: O(1) --> No additional data structures.
*/

class Solution {
    public int compress(char[] chars) {
        int write = 0, read = 0;
        int n = chars.length;

        while (read < n) {
            char curr = chars[read];
            int count = 0;
            
            // Count consecutive characters.
            while (read < n && chars[read] == curr) {
                read++;
                count++;
            }

            // Modify the input array.
            chars[write++] = curr;

            // If more than one consecutive digit, write each digit to the input array.
            if (count > 1) {
                for (char d : String.valueOf(count).toCharArray()) {
                    chars[write++] = d;
                }
            }
        }

        return write;
    }
}