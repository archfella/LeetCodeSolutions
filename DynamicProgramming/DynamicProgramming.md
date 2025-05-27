# Dynamic Programming


- ***Dynamic programming*** is a method for solving complex problems by breaking them down into smaller **subproblems**, solving each subproblem only once, and saving their solutions – usually in a table – so that the same subproblems don't get solved repeatedly.

- The two main ideas behind DP are:

1. ***Overlapping Subproblems***
The problem can be broken down into smaller, repeating subproblems.
(Example: In Fibonacci numbers, fib(n) = fib(n-1) + fib(n-2), and you recompute fib(n-2) many times if you’re not careful.)

2. ***Optimal Substructure***
The solution to the whole problem depends on the solutions to its subproblems.
(Example: Shortest path problems — if you know the shortest path to a city, you can build the shortest path to a neighboring city.)

**Typical steps when solving with dynamic programming:**

- **Define the state** (what parameters describe a subproblem?)
- **Define the transition** (how do you build a solution from smaller solutions?)
- **Identify the base cases** (what are the simplest subproblems you already know the answer to?)
- Decide if you want **top-down** (with memoization) or **bottom-up** (with tabulation).

***Two ways to implement DP:***

1. ***Top-Down (Memoization)***	Solve the problem recursively. Cache (memoize) the results of subproblems.

Example: ***Recursive Fibonacci with a cache***
   ```python
   def fib_top_down(n, memo={}):
        if n <= 1:
            return n
        if n not in memo:
            memo[n] = fib_top_down(n-1, memo) + fib_top_down(n-2, memo)
   return memo[n]

print(fib_top_down(10))  # Output: 55
```

2. ***Bottom-Up (Tabulation)***	Solve all smaller subproblems first, building up to the final solution iteratively.	

Example: ***Iterative Fibonacci with a loop***

```python
def fib_bottom_up(n):
    if n <= 1:
        return n
    a, b = 0, 1
    for _ in range(2, n+1):
        a, b = b, a + b
    return b

print(fib_optimized(10))  # Output: 55

```

***Famous problems using DP:***

- Fibonacci numbers
- Knapsack problem
- Longest common subsequence (LCS)
- Shortest paths (e.g., Bellman-Ford algorithm)
- Matrix chain multiplication
- Coin change problem

***There is a great explanation on Dynamic Programming problems [here](https://www.youtube.com/watch?v=aPQY__2H3tE).***