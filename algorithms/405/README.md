## 405. Convert a Number to Hexadecimal

Given an integer, write an algorithm to convert it to hexadecimal. For negative integer, [two’s complement method](https://en.wikipedia.org/wiki/Two%27s_complement) is used.

**Note:**

1. All letters in hexadecimal (`a-f`) must be in lowercase.
2. The hexadecimal string must not contain extra leading `0`s. If the number is zero, it is represented by a single zero character `'0'`; otherwise, the first character in the hexadecimal string will not be the zero character.
3. The given number is guaranteed to fit within the range of a 32-bit signed integer.
4. You **must not use any method provided by the library** which converts/formats the number to hex directly.

**Example 1:**
<pre>
<b>Input:</b>
26

<b>Output:</b>
"1a"
</pre>

**Example 2:**
<pre>
<b>Input:</b>
-1

<b>Output:</b>
"ffffffff"
</pre>
