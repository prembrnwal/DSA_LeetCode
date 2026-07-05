class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode (0);
        ListNode curr=dummy;
        int carry=0;
        while(l1!=null || l2!=null){
            int sum=carry;
            if(l1!=null) sum=sum+l1.val;
            if(l2!=null) sum=sum+l2.val;

            carry=sum/10;
            sum=sum%10;
            ListNode newnum=new ListNode (sum);
            curr.next=newnum;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
            curr=curr.next;

        }
        if(carry>0){
            ListNode carrywala=new ListNode (carry);
            curr.next=carrywala;
        }
        return dummy.next;
    }
}
