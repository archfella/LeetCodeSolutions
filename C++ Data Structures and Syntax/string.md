[**CPP Reference - std::string**](https://cplusplus.com/reference/string/string/)

# Essential:

## Capacity

- ***size*** - Returns the length of a string.
- ***length*** - Returns the length of a string.

**Note**: **size** and **length** do the exact same thing. We can use them interchangeably.

## Operations

- **operator+=** - Appends a string at the and of a string.
  - Time: O(size of the appended string)
- **push_back** - Appends a character at the end of a string.
  - Time: O(1)
- **pop_back** - Deletes the last character of a string.
  - Time: O(1)

## Element access

- **operator[]** - Get character of string.
  - Time: O(1) --> direct access (uses constant time pointer arithmetic).
- **back** - Access last character.
  - Time: O(1)
- **front** - Access first character.
  - Time: O(1)
 
## String operations
- **substring** - Generate substring.
  - string substr (size_t pos = 0, size_t len = npos) const;
    
    --> Return the substring of lentgh **len** of a string starting (inclusive) from **pos**.

