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
    public ListNode middleNode(ListNode head)
    {
        ListNode s=head;
        ListNode f=head;
        while(f!=null && f.next != null)
        {
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
    public static ListNode reverse(ListNode head)
    {
        if(head==null)
        {
            return head;
        }
        ListNode prev=null;
        ListNode present=head;
        ListNode next=present.next;
        
        while(present!=null)
        {
            present.next=prev;
            prev=present;
            present=next;
            if(next!=null)
            {
                next=next.next;
            }
        }
        head=prev;
        return head;

    }

   public boolean isPalindrome(ListNode head) {
        ListNode mid= middleNode(head);
        ListNode secondHead=reverse(mid);
        ListNode rereverse= secondHead;

        while(head!= null && secondHead!= null)
        {
            if(head.val != secondHead.val)
            {
                break;
            }
            head=head.next;
            secondHead=secondHead.next;
        }
        reverse(rereverse);
        if(head==null || secondHead==null)
        {
            return true;
        }
        return false;
    }
}