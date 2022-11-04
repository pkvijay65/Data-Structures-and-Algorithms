/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Node temp1 = root;
        
        if (root == null){
            return root;
        }

        while (temp1.left !=null){
            Node temp2 = temp1;

            while (true){
                temp2.left.next = temp2.right;
                if (temp2.next == null){
                    break;
                }
                temp2.right.next = temp2.next.left;
                temp2 = temp2.next;
            }

            temp1 = temp1.left;
        }
    return root;
    }
}