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
    public ListNode partition(ListNode head, int x) {
        ListNode lessdummy = new ListNode(0);
        ListNode greaterdummy = new ListNode(0);
        ListNode less=lessdummy;
        ListNode greater=greaterdummy;
        while (head!= null)
            {
                
            if(head.val>=x)
            {
                greater.next=head ;
                greater =greater.next;
            }
                else
            {
                less.next= head;
                less= less.next;
            }
            head=head.next;
            } 
        greater.next=null;
        less.next=greaterdummy.next;
        return lessdummy.next;
    }
}