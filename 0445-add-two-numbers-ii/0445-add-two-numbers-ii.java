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
    public ListNode Reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode nxt = null;
        while (curr != null) {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = Reverse(l1);
        l2 = Reverse(l2);
        int sum = 0;
        int carry = 0;
        ListNode Dummy = new ListNode(0);
        ListNode temp = Dummy;
        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            sum = x + y + carry;
            carry = sum / 10;
            sum = sum % 10;

            ListNode node = new ListNode(sum);
            temp.next = node;
            temp = node;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
           
           
        }
         if (carry > 0) {
                temp.next = new ListNode(carry);
            }
        return Reverse(Dummy.next);

    }
}