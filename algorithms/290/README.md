## 290. Word Pattern

Given a `pattern` and a string `str`, find if `str` follows the same pattern.

Here **follow** means a full match, such that there is a bijection between a letter in `pattern` and a **non-empty** word in `str`.

**Example 1:**
<pre>
<b>Input:</b> pattern = "abba", str = "dog cat cat dog"
<b>Output:</b> true
</pre>

**Example 2:**
<pre>
<b>Input:</b> pattern = "abba", str = "dog cat cat fish"
<b>Output:</b> false
</pre>

**Example 3:**
<pre>
<b>Input:</b> pattern = "aaaa", str = "dog cat cat dog"
<b>Output:</b> false
</pre>

**Example 4:**
<pre>
<b>Input:</b> pattern = "abba", str = "dog dog dog dog"
<b>Output:</b> false
</pre>

**Notes:**<br/>
You may assume `pattern` contains only lowercase letters, and `str` contains lowercase letters that may be separated by a single space.
