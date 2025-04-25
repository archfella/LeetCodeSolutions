# Moore Voting Algorithm

- This algorithm is used to find the ***Majority element***.
- ***Majority element*** is the element that appears more than *⊥N/2⊥* times in the array of *N* elements.
---

## Intuition

- One ***element cancels out another*** - we know that the ***Majority element*** won't be canceled out because it appears more in the array than ***all the other elements combined***.

## Explanation

- We count the number of times our current Majority element appears.
- All elements that are not equal to the Majority element decrement the counter.
- If count is 0, element that canceled us out is the new Majority element.
- We return the Majority element.

### Complexity

- Time: ***O(N)***
- Space: ***O(1)***

