/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
         ListNode temp2=headB;
         int l1=0;
         int l2=0;
         while(temp1!=null){
            l1++;
            temp1=temp1.next;
         }
         while(temp2!=null){
            l2++;
            temp2=temp2.next;
         }

         if(l1>l2){
            int l=l1-l2;
           for(int i=0;i<l;i++){
            headA=headA.next;
           }
           while(headA!=null && headB!=null){
            if(headA==headB){
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
           }
         }else{
             int l=l2-l1;
           for(int i=0;i<l;i++){
            headB=headB.next;
           }
           while(headA!=null && headB!=null){
            if(headA==headB){
                return headA;
            }
            headA=headA.next;
            headB=headB.next;

         }
        
    }
    return null;
}
}