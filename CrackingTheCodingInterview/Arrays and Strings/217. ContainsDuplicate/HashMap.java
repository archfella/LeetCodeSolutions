/* 
    Time: O(N) --> Array of size N traversal.
    Space: O(N) --> HashMap of size N.
*/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num : nums){
            if(map.containsKey(num) && map.get(num) >= 1)
                return true;
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return false;
    }
}