# Iterators in C++

## Overview
Iterators are general-purpose objects (similar to pointers) that allow you to traverse elements of C++ Standard Library (STL) containers in a uniform way. They abstract away the underlying data structure, enabling you to write generic algorithms and container-agnostic loops.

- **Dereference**: `*it` returns a reference to the element the iterator points to.
- **Increment**: `++it` advances to the next element.
- **Comparison**: `it != container.end()` checks whether you have reached the end.

## Iterator Categories
1. **Input Iterator**  
   - Can read elements in one pass (e.g., `std::istream_iterator`).  
   - Supports:  
     - `++it`  
     - `*it`  
     - `it == other`, `it != other`

2. **Output Iterator**  
   - Can write elements in one pass (e.g., `std::ostream_iterator`).  
   - Supports:  
     - `++it`  
     - `*it = value`

3. **Forward Iterator**  
   - Can read or write, multiple passes allowed, only moves forward (e.g., `std::forward_list::iterator`).  
   - Supports:  
     - All of Input + Output operations  
     - Copy-constructible, multi-pass guarantee

4. **Bidirectional Iterator**  
   - Forward Iterator plus the ability to move backward via `--it` (e.g., `std::list::iterator`, `std::map::iterator`).  
   - Supports:  
     - `++it`, `--it`  
     - All Forward Iterator operations

5. **Random‐Access Iterator**  
   - Strongest guarantees: can jump arbitrarily with `it + n`, `it – n`, compare with `<`, `>`, etc.  
   - Examples: raw pointers (`T*`), `std::vector<T>::iterator`.  
   - Supports:  
     - All Bidirectional Iterator operations  
     - `it + n`, `it - n`, `it[n]`  
     - Relational comparisons: `it < other`, `it >= other`, etc.

> **Note:** `std::unordered_map` and `std::unordered_set` provide **forward iterators**, so you can increment (`++it`) but not do random jumps or comparisons like `<`.

---

## Obtaining Iterators
- `container.begin()` → iterator to the first element (or `end()` if empty).  
- `container.end()` → “one‐past‐the‐last” sentinel; do not dereference.  
- `container.cbegin()`, `container.cend()` → `const_iterator` versions (read-only).

Example:
```cpp
std::vector<int> vec = {10, 20, 30};
auto itBegin = vec.begin();   // std::vector<int>::iterator
auto itEnd   = vec.end();     // one-past-the-last
