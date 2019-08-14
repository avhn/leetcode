## 237. Delete Node in a Linked List

Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

Given linked list -- head = [4,5,1,9], which looks like following:

![image](../../assets/237.png)

<br/>

**Example 1:**
<pre>
<b>Input:</b> head = [4,5,1,9], node = 5
<b>Output:</b> [4,1,9]
<b>Explanation:</b> You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.
</pre>

**Example 2:**
<pre>
<b>Input:</b> head = [4,5,1,9], node = 1
<b>Output:</b> [4,5,9]
<b>Explanation:</b> You are given the third node with value 1, the linked list should become 4 -> 5 -> 9 after calling your function.
</pre>

**Note:**

- The linked list will have at least two elements.
- All of the nodes' values will be unique.
- The given node will not be the tail and it will always be a valid node of the linked list.
- Do not return anything from your function.
