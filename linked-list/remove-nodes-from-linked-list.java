/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
        ListNode rev= reverse(head);

        int max=rev.val;
        ListNode curr=rev;
        ListNode newNode= new ListNode();
        ListNode newList=newNode;
        while(curr!=null)
        {
            if (curr.val >= max) {
                max = curr.val;
                newList.next = curr; // keep this node
                newList = newList.next;
            }
            curr = curr.next;
        }
        newList.next=null;
        return reverse(newNode.next);
  
    }
    public ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null)
        {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
