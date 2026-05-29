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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode dummy= new ListNode(0);
        dummy.next=head;
        ListNode current=dummy;
        while(head!=null)
        {
            ListNode f=head;
            ListNode s=head.next;
            if(s==null || f.val!=s.val)
            {
                current.next=f;
                current=current.next;
                head=head.next;
            }
            else
            {
                while(s!=null && f.val==s.val)
            {
                s=s.next;
            }
            
            current.next=s;
            head=s;

        }
        
    }
    return dummy.next;
}
}