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

    public void reorderList(ListNode head) {
        if(head==null && head.next==null)
        {
            return ;
        }
        ListNode mid=middleNode(head);
        ListNode headSecond=reverse(mid);
        ListNode hf=head;
        
        while(hf!=null && headSecond!=null)
        {
            ListNode temp=hf.next;
            hf.next=headSecond;
            hf=temp;

            temp=headSecond.next;
            headSecond.next=hf;
            headSecond=temp;
        }
        if(hf!=null)
        {
            hf.next=null;
        }
    
        }
}