
class Solution {
    public ListNode reverseList(ListNode head) {
        //base case
        if(head==null || head.next==null){
            return head;
        }
        //smaller problem
        ListNode x= reverseList(head.next);
        //small calculation
        ListNode temp = head.next;
        temp.next = head;
        head.next = null;
        return x;
        
    }
}