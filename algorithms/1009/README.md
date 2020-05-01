## 1009. Complement of Base 10 Integer

Every non-negative integer `N` has a binary representation.  For example, `5` can be represented as `"101"` in binary, 11 as "1011" in binary, and so on.  Note that except for `N = 0`, there are no leading zeroes in any binary representation.

The *complement* of a binary representation is the number in binary you get when changing every `1` to a `0` and `0` to a `1`.  For example, the complement of `"101"` in binary is `"010"` in binary.

For a given number `N` in base-10, return the complement of it's binary representation as a base-10 integer.

<br>

**Example 1:**
<pre>
<b>Input:</b> 5
<b>Output:</b> 2
<b>Explanation:</b> 5 is "101" in binary, with complement "010" in binary, which is 2 in
base-10.
</pre>

**Example 2:**
<pre>
<b>Input:</b> 7
<b>Output:</b> 0
<b>Explanation:<b> 7 is "111" in binary, with complement "000" in binary, which is 0 in base-10.
</pre>

**Example 3:**
<pre>
<b>Input:</b> 10
<b>Output:</b> 5
<b>Explanation:</b> 10 is "1010" in binary, with complement "0101" in binary, which is 5 in base-10.
 </pre>

**Note:**
    1. `0 <= N < 10^9`
    2. This question is the same as 476: https://leetcode.com/problems/number-complement/`
