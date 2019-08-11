## 112. Path Sum

Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

**Note:** A leaf is a node with no children.

**Example:**

Given the below binary tree and `sum = 22`,
<pre>
      <b>5</b>
     <b>/</b> \
    <b>4</b>   8
   <b>/</b>   / \
  <b>11</b>  13  4
 /  <b>\</b>      \
7    <b>2</b>      1
</pre>
return true, as there exist a root-to-leaf path `5->4->11->2` which sum is 22.