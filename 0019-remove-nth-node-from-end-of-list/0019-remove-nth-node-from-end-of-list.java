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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode h=head;
        while(h!=null){
            count=count+1;
            h=h.next;
        }
        h=head;
        int num=count-n;
         if (num == 0) {
            return head.next;
        }

        while(num>1){

            h=h.next;
            num=num-1;
        }
        h.next=h.next.next;
        return head;
        
    }
}