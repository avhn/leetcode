## 509. Fibonacci Number

The **Fibonacci numbers**, commonly denoted `F(n)` form a sequence, called the **Fibonacci sequence**, such that each number is the sum of the two preceding ones, starting from `0` and `1`. That is,

<pre>
F(0) = 0,   F(1) = 1
F(N) = F(N - 1) + F(N - 2), for N > 1.
</pre>

Given `N`, calculate `F(N)`.

<br>

**Example 1:**
<pre>
<b>Input:</b> 2
<b>Output:</b> 1
<b>Explanation:</b> F(2) = F(1) + F(0) = 1 + 0 = 1.
</pre>

**Example 2:**
<pre>
<b>Input:</b> 3
<b>Output:</b> 2
<b>Explanation:</b> F(3) = F(2) + F(1) = 1 + 1 = 2.
</pre>

**Example 3:**
<pre>
<b>Input:</b> 4
<b>Output:</b> 3
<b>Explanation:</b> F(4) = F(3) + F(2) = 2 + 1 = 3.
</pre> 

<br>

**Note:**

0 ≤ `N` ≤ 30.
