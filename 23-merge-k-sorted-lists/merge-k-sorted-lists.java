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
    public ListNode mergeKLists(ListNode[] lists) {
         // PriorityQueue to hold the nodes, ordered by their value (smallest to largest)
        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                // Compare node values to maintain the min-heap order
                return o1.val - o2.val;
            }
        });

        // Add the head of each list into the priority queue, if it's not null
        for (ListNode ll : lists) {
            if (ll != null) {
                pq.add(ll);
            }
        }

        // Create a dummy node to help construct the final merged list
        ListNode dummy = new ListNode();
        ListNode temp = dummy;

        // Process the priority queue until it's empty
        while (!pq.isEmpty()) {
            // Extract the node with the smallest value
            ListNode smallestNode = pq.poll();
            temp.next = smallestNode; // Add it to the result list
            temp = temp.next;         // Move temp to the next node
            
            // If the extracted node has a next node, add it to the priority queue
            if (smallestNode.next != null) {
                pq.add(smallestNode.next);
            }
        }

        // Return the merged list starting from the next of dummy node
        return dummy.next;
    

        
    }
}