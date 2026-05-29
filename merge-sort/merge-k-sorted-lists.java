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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0)
        return null;
        return mergelists(lists,0,lists.length-1);
    }
    public ListNode mergelists(ListNode[] lists,int left,int right)
    {
        if(left==right)return lists[left];
        if(left>right)return null;
        int mid=(left+right)/2;
        //divide th list array
        ListNode l1=mergelists(lists,left,mid);
        ListNode l2=mergelists(lists,mid+1,right);

        return mergepair(l1,l2);

        }
    public ListNode mergepair(ListNode l1,ListNode l2)
    {
        ListNode dummy= new ListNode(0);
        ListNode current=dummy;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // Add remaining nodes
        if (l1 != null) current.next = l1;
        if (l2 != null) current.next = l2;

        return dummy.next;
}
}