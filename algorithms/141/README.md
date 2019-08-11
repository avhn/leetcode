## 141. Linked List Cycle

Given a linked list, determine if it has a cycle in it.

To represent a cycle in the given linked list, we use an integer `pos` which represents the position (0-indexed) in the linked list where tail connects to. If `pos` is `-1`, then there is no cycle in the linked list.
<br/>
<br/>

**Example 1:**
<pre>
<b>Input:</b> head = [3,2,0,-4], pos = 1
<b>Output:</b> true
<b>Explanation:</b> There is a cycle in the linked list, where tail connects to the second node.
</pre>

![example 1](../../assets/Problem141.png)
<br/>

**Example 2:**
<pre>
<b>Input:</b> head = [1,2], pos = 0
<b>Output:</b> true
<b>Explanation:</b> There is a cycle in the linked list, where tail connects to the first node.
</pre>

![example 1](../../assets/Problem141-2.png)
<br/>

**Example 3:**
<pre>
<b>Input:</b> head = [1], pos = -1
<b>Output:</b> false
<b>Explanation:</b> There is no cycle in the linked list.
</pre>

![example 1](../../assets/Problem141-3.png)
<br/>

**Follow up:**

Can you solve it using *O(1)* (i.e. constant) memory?
