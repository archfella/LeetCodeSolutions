## [std::unordered_set](https://en.cppreference.com/w/cpp/container/unordered_set.html)

## Link between set and hashmap
- We can look at a set as a hashmap(frequency map) where each elements frequency is 1.
  
# Essential:

## Construction
  unordered_set<int> set1(nums1.begin(), nums1.end());
    - Time: O(N) = O(N)*O(1), N insertions each with O(1) time.

## Capacity

- ***size*** - Returns the number of elements.
- ***empty*** - Checks whether the container is empty.

**Note**: **size** and **length** do the exact same thing. We can use them interchangeably.

## Operations

- **insert** - Inserts an element into the set.
  - Time: O(1) - Uses hash-keys.

- **erase** - Inserts an element into the set.
  - Time: O(1) - Uses hash-keys.
 
- **find(key)** - Finds element with specific key.
  - Time: O(1) - Uses hash-keys.
 
- **count(key)** - Returns the number of elements matching specific key.
  - Time: O(1) - Returns the number of elements matching specific key.


## Element access

- **operator[]** - Get character of string.
  - Time: O(1) --> direct access (uses constant time pointer arithmetic).

## Iterators
- **begin** - Returns an iterator to the beginning.
- **end** - Returns an iterator to the end.
