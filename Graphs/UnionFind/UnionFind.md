# 547. Number of Provinces

- [YouTube explanation on Union Find](https://www.youtube.com/watch?v=wU6udHRIkcc).

```cpp
class Solution {
public:
    class UnionFind {
        private:
        std::vector<int> parent;
        int count;

        // Optional: return size of set containing u
        int size(int u) {
            return -parent[find(u)];
        }

        public:
        UnionFind(int n) {
            parent.assign(n, -1);  // each node is its own root with size 1
            count = n;
        }

         // Find with path compression
        int find(int u) {
            if (parent[u] < 0) return u;  // u is root
            return parent[u] = find(parent[u]);  // path compression
        }

        // Union by size (stored as negative values)
        void union_sets(int u, int v) {
            u = find(u);
            v = find(v);
            if (u == v) return;

            // Make the larger set the new root
            if (parent[u] > parent[v]) std::swap(u, v);

            parent[u] += parent[v];  // update size
            parent[v] = u;           // merge v into u

            count--;
        }


        int getCount() { return count; }
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
