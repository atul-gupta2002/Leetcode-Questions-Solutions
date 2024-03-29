class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        
        // Move the second pointer so that the gap between first and second is n nodes apart
        for (int i = 1; i <= n + 1; i++) {
            second = second.next;
        }
        
        // Move first to the rightmost node before the target node
        while (second != null) {
            first = first.next;
            second = second.next;
        }
        
        // Skip the target node
        first.next = first.next.next;
        
        return dummy.next;
    }
}