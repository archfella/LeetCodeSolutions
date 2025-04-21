/* 
    Time: O(N), N = s.length() = t.length()
    Space: O(N), HashMap with N entries
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        int len_s = s.length(), len_t = t.length();

        if(len_s != len_t) return false;

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(char c : t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) - 1);
        }
        for(int val : map.values()){
            if(val != 0) return false;
        }

        return true;
    }
}