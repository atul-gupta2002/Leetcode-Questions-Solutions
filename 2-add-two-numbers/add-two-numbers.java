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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int s=0;
        int carry=0;
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(l1!=null && l2!=null){
            s=l1.val+l2.val+carry;
            carry=s/10;
            ListNode n=new ListNode(s%10);
            dummy.next=n;
            dummy=dummy.next;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
             s=l1.val+carry;
            carry=s/10;
            ListNode n=new ListNode(s%10);
            dummy.next=n;
            dummy=dummy.next;
            l1=l1.next;
        }
        while(l2!=null){
              s=l2.val+carry;
            carry=s/10;
            ListNode n=new ListNode(s%10);
            dummy.next=n;
            dummy=dummy.next;
            l2=l2.next;
        }
        if(carry!=0){
            ListNode n=new ListNode(carry);
            dummy.next=n;
        }
        return temp.next;

        
    }
}