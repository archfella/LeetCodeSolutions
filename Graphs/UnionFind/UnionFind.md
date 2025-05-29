# 547. Number of Provinces

- [YouTube explanation on Union Find](https://www.youtube.com/watch?v=wU6udHRIkcc).

```cpp
class Solution {
public:
    class UnionFind {
        private:
        std::vector<int> parent, rank;
        int count;

        public:
        UnionFind(int n) {
            parent.resize(n);
            rank.resize(n, 0); // all ranks start at 0
            count = n;
            for (int i = 0; i < n; ++i)
                parent[i] = i;
        }

        // Find with path compression
        int find(int u) {
            if (u != parent[u])
                parent[u] = find(parent[u]); // path compression
            return parent[u];
        }

        // Union by rank
        void union_sets(int u, int v) {
            int pu = find(u);
            int pv = find(v);
            if (pu == pv) return;

            // attach smaller tree to larger
            if (rank[pu] < rank[pv]) {
                parent[pu] = pv;
            } else if (rank[pu] > rank[pv]) {
                parent[pv] = pu;
            } else {
                parent[pv] = pu;
                rank[pu]++;
            }
            count--;
        }

        int getCount() { return count; }

        // Optional: check if two elements are in the same set
        bool connected(int u, int v) {
            return find(u) == find(v);
        }
    };

    int findCircleNum(vector<vector<int>>& isConnected) {
        int n = isConnected.size();
        UnionFind uf(n);
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(isConnected[i][j] == 1) uf.union_sets(i, j);
            }
        }
        return uf.getCount();
    }
};
```
