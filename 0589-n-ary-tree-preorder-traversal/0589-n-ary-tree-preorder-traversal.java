/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> ans = new ArrayList<Integer>();
        
        makePreOrderTraversal(root, ans);
        return ans;
    }
    
    private void makePreOrderTraversal(Node root, List<Integer> ans) {
        
        if (root == null) {
            return;
        }
        
        ans.add(root.val);
        
        int childrenSize = root.children.size();
        
        for (int i = 0; i < childrenSize; i++) {
            Node child = root.children.get(i);      
            makePreOrderTraversal(child, ans);
        }
        
    }
}