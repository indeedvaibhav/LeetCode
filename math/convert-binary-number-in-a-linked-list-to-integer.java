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
    public int getDecimalValue(ListNode head) {
        if (head == null)
            return 0;
        ListNode temp = head;
        int len = 0;
        while (temp.next != null) {
            len++;
            temp = temp.next;

        }
        int ans=0;
        while (head != null) {
            int x = head.val;
            ans += x * Math.pow(2, len--);
            head = head.next;
        }
        return ans;

    }
}