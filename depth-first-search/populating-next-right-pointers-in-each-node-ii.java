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
        if(root==null)
            return null;
        
        Node leftMost=root;
        while(leftMost.left!=null)
        {
            Node current= leftMost;
            while(current!=null)
            {
                if(current.left!=null){
                    if(current.right!=null)
                        current.left.next= current.right;
                    else
                    {
                        if(current.next.left!=null)
                            current.left.next= current.next.left;
                        else if(current.next.right!=null)
                            current.left.next=current.next.right;
                    }
                }
                    
                if(current.next!=null){
                    if(current.next.left!=null)
                        current.right.next= current.next.left;
                    else
                        current.right.next= current.next.right;
                }
                current= current.next;
            }
            leftMost=leftMost.left;
        }
        return root;


        
    }
}