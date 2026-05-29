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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1=reverse(l1);
        l2=reverse(l2);
        ListNode result=null;
        int carry=0;
        while(l1!=null || l2!=null || carry>0)
        {
            int val1=(l1!=null)?l1.val:0;
            int val2=(l2!=null)?l2.val:0;
            int sum=val1+val2+carry;
            carry=sum/10;

            ListNode newNode= new ListNode(sum%10);
            newNode.next=result;
            result=newNode;
            if(l1!=null)l1=l1.next;
            if(l2!=null)l2=l2.next;
        }
        return result;

    }
     private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
