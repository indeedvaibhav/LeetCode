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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k<=1 || head==null)
        return head;
        ListNode current=head;
        ListNode prev=null;
        while(true)
        {
            //checking if k nodes exist
            ListNode check = current;
            int count = 0;
            while (count < k && check != null) {
                check = check.next;
                count++;
            }
            if (count < k) break; 

            ListNode last=prev;
            ListNode newEnd=current;
            ListNode next=null;
            for(int i=0;current!= null && i<k;i++)
            {
                next=current.next;
                current.next=prev;
                prev=current;
                current= next;
            
            }   
            if(last!=null)
            {
                last.next=prev;
            }
            else
            head=prev;

            newEnd.next=current;

            if(current==null)
            break;
            prev=newEnd;
        }
        return head;
    }
}