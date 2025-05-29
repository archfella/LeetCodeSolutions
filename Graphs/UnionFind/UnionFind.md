# 547. Number of Provinces

- [YouTube explanation on Union Find](https://www.youtube.com/watch?v=wU6udHRIkcc).
- Time complexity:
   1. **find(int u)**
      - Purpose: Finds the representative (root) of the component containing **u**, with path compression.
      - Amortized Time Complexity: O(α(n))
          - α(n) is the inverse Ackermann function, which grows extremely slowly—effectively constant time for any practical                 input size (e.g., α(10^80) < 5).
                How: On each call, it recursively follows parent pointers and flattens the tree by making each node point                     directly to the root.

    2. **union_sets(int u, int v)**
        - Purpose: Merges the sets containing u and v, using union by size.
        - Amortized Time Complexity: O(α(n)) Because it uses find() internally for both u and v, and merging is O(1) after finding roots.
How: It attaches the smaller tree under the root of the larger one and updates the size accordingly.
    
    3. **size(int u)**
        - Purpose: Returns the size of the component containing u.
        - Time Complexity: O(α(n)) — uses **find(u)** to get the root, and then returns -parent[root].

    4. **connected(int u, int v)**
        - Purpose: Checks whether u and v belong to the same component.
        - Time Complexity: O(α(n)) — calls find(u) and find(v) and compares them.

```cpp
class Solution {
public:
    class UnionFind {
    private:
        std::vector<int> parent;
        int count;

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
