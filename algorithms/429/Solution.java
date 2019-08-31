import java.util.ArrayList;
import java.util.List;

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {

    /**
     * Time and space complexity: O(n), where n is size of the n-ary tree
     */
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        levelOrder(1, root, list);
        return list;
    }

    private void levelOrder(int level, Node root, List<List<Integer>> list) {
        if (root == null) return; // end of path, guard
        if (list.size() < level) list.add(new ArrayList<>());
        list.get(level - 1).add(root.val);  // index = level - 1
        for (Node n : root.children) {
            levelOrder(level + 1, n, list);
        }
    }
}
