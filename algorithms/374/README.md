## 374. Guess Number Higher or Lower

We are playing the Guess Game. The game is as follows:

I pick a number from **1** to <b><i>n</i></b>. You have to guess which number I picked.

Every time you guess wrong, I'll tell you whether the number is higher or lower.

You call a pre-defined API `guess(int num)` which returns 3 possible results (`-1`, `1`, or `0`):
<pre>
-1 : My number is lower
 1 : My number is higher
 0 : Congrats! You got it!
</pre>
 
**Example :**
<pre>
<b>Input:</b> n = 10, pick = 6
<b>Output:</b> 6
</pre>
