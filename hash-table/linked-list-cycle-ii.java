/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
        public int lengthcycle(ListNode head)
    {
        ListNode fast= head;
        ListNode slow= head;
        while(fast.next!=null && slow.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            
        
            ListNode temp=slow;
            int count=0;
            do {
                    temp=temp.next;
                    count++;
                }while(temp!=slow);
            return count;
        
       
    }
     return 0;
    }
    public ListNode detectCycle(ListNode head)
    {
        int length=0;
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
            {
                length=lengthcycle(slow);
                break;
            }
        }
         
        if(length==0)
        {
            return null;
        }
        ListNode f=head;
        ListNode s=head;

        while(length>0)
        {
            s=s.next;
            length--;
        }
        while(f!=s)
        {
            f=f.next;
            s=s.next;
        }
return s;
    }
        
    }
