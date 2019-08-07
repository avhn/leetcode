## 121. Best Time to Buy and Sell Stock

Say you have an array for which the *i*<sup>th</sup> element is the price of a given stock on day *i*.

If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.

**Example 1:**
<pre>
<b>Input:</b> [7,1,5,3,6,4]
<b>Output:</b> 5
<b>Explanation:</b> Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger than buying price.
</pre>

**Example 2:**
<pre>
<b>Input:</b> [7,6,4,3,1]
<b>Output:</b> 0
<b>Explanation:</b> In this case, no transaction is done, i.e. max profit = 0.
</pre>
