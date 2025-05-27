# Greedy Algorithms

- ***Greedy algorithms*** are a class of algorithms that make locally optimal choices at each step with the hope of finding a ***globally optimal solution***. In these algorithms, ***decisions are made based on the information available at the current moment without considering the consequences of these decisions in the future***.
- The key idea is to select the best possible choice at each step, leading to a solution that may not always be the most optimal but is often good enough for many problems.

---

## When does a Greedy Algorithm work?

- There are ***2 conditions that need to be true for a greedy algorithm to work***:
1. ***Greedy choice property***: A global optimal solution can be reached by choosing the optimal choice at each step.
2. ***Optimal substructure***: A problem has an optimal substructure if an optimal solution to the entire problem contains the optimal solution to the sub-problems.

    - In other words - ***if solving smaller sub-problems optimally leads to the optimal solution of the problem - the greedy algorithm works***.

## When to use a Greedy Approach?

- When ***we don't know which way to go about making a choice, it's probably best if we make a greedy choice*** because the Greedy solution will always be close to optimal or even fully optimal solution.

## Knapsack problem

- Check out a great explanation [**here**](https://www.youtube.com/watch?v=lfQvPHGtu6Q).
  
## 122. Best Time to Buy and Sell Stock

- ***Greedy approach*** is to sell a stock whenever we can make a profit.
- I don't know how to prove that the Greedy Approach leads to an optimal solution - just try a few cases and see for yourself.

