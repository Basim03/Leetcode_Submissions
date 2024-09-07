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
    int size=0;
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode curr=head;
        while(curr!=null)
        {
            curr=curr.next;
            size+=1;
        }
        curr=head;
   size=size-n;
   int i=0;
           if (size == 0) {
    return head.next; // This means we're removing the head node
}
   while(size>1)
   {
    curr=curr.next;
    size--;
   }
curr.next=curr.next.next;
//    System.out.println(curr.val);
        return head;
        
    }
}