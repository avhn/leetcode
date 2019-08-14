## 235. Lowest Common Ancestor of a Binary Search Tree

Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.

According to the [definition of LCA on Wikipedia](https://en.wikipedia.org/wiki/Lowest_common_ancestor): “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow **a node to be a descendant of itself**).”

Given binary search tree:  root = [6,2,8,0,4,7,9,null,null,3,5]

![image](../../assets/235.png)

**Example 1:**
<pre>
<b>Input:</b> root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
<b>Output:</b> 6
<b>Explanation:</b> The LCA of nodes 2 and 8 is 6.
</pre>

**Example 2:**
<pre>
<b>Input:</b> root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
<b>Output:</b> 2
<b>Explanation:</b> The LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.
</pre>

**Note:**

- All of the nodes' values will be unique.
- p and q are different and both values will exist in the BST.
