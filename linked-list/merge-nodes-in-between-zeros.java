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
    public ListNode mergeNodes(ListNode head) {
        // Base case: if there are no more nodes after this zero, return null
        if (head == null || head.next == null) {
            return null;
        }

        // Initialize sum for the current block between zeros
        int sum = 0;
        ListNode p = head.next;

        // Collect the sum until reaching the next zero node
        while (p != null && p.val != 0) {
            sum += p.val;
            p = p.next;
        }

        // Create a new node with the accumulated sum
        ListNode newNode = new ListNode(sum);

        // Recursively calculate and link the next blocks
        newNode.next = mergeNodes(p);

        return newNode;
    }
}
