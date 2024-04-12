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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode middle=middle(head);
        ListNode temp=middle.next;
        middle.next=null;
        ListNode x=sortList(head);
        ListNode y=sortList(temp);
        return mergeTwoLists(x,y);   
    }

    public ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
         }
         return slow;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode (-1);
        ListNode temp=dummy;
        while (l1!=null && l2!=null) {
            if (l1.val < l2.val) {
                dummy.next=l1;
                dummy=dummy.next;
                l1=l1.next;
            }
            else {
                dummy.next=l2;
                l2=l2.next;
                dummy=dummy.next;
            }
        }

        if (l1!=null) {
            dummy.next=l1;
        }

        if (l2!=null) {
              dummy.next=l2;
        }
        return temp.next;
    }
}