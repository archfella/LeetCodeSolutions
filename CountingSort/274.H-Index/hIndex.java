/*
    Time: O(N)
    Space: O(N)
*/
class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] cit_count = new int[n + 1];

        for (int i = 0; i < n; i++) {
            cit_count[Math.min(n, citations[i])]++;
        }

        int num_papers = 0;
        for (int h = n; h >= 0; h--) {
            num_papers += cit_count[h];
            if (num_papers >= h) {
                return h;
            }
        }

        return 0;
    }
}