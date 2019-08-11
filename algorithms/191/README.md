## 191. Number of 1 Bits

Write a function that takes an unsigned integer and return the number of `'1'` bits it has (also known as the [Hamming weight](https://en.wikipedia.org/wiki/Hamming_weight)).

<br/>

**Example 1:**
<pre>
<b>Input:</b> 00000000000000000000000000001011
<b>Output:</b> 3
<b>Explanation:</b> The input binary string <b>00000000000000000000000000001011</b> has a total of three '1' bits.
</pre>

**Example 2:**
<pre>
<b>Input:</b> 00000000000000000000000010000000
<b>Output:</b> 1
<b>Explanation:</b> The input binary string <b>00000000000000000000000010000000</b> has a total of one '1' bit.
</pre>

**Example 3:**
<pre>
<b>Input:</b> 11111111111111111111111111111101
<b>Output:</b> 31
<b>Explanation:</b> The input binary string <b>11111111111111111111111111111101</b> has a total of thirty one '1' bits.
</pre>

<br/>

**Note:**

- Note that in some languages such as Java, there is no unsigned integer type. In this case, the input will be given as signed integer type and should not affect your implementation, as the internal binary representation of the integer is the same whether it is signed or unsigned.
- In Java, the compiler represents the signed integers using [2's complement notation](https://en.wikipedia.org/wiki/Two%27s_complement). Therefore, in **Example 3** above the input represents the signed integer `-3`.
 
<br/>

**Follow up:**

If this function is called many times, how would you optimize it?
