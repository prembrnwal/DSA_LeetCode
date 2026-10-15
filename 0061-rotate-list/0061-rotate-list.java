class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode temp=head;
        int count=1;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        temp.next=head;
        k=k % count;
        int pos =count -k;
        ListNode temp2=head;
        for(int i=1;i<pos;i++){
            temp2=temp2.next;
        }
        
        ListNode newhead=temp2.next;
        temp2.next=null;
        return newhead;
    }
}