class Solution {
    public ListNode middleNode(ListNode head) {
        int size=0;
        // ListNode temp=new ListNode();
        ListNode temp =head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        temp=head;
        for(int i=0;i<(size/2);i++){
            temp=temp.next;            
        }
        return temp;
    }
}