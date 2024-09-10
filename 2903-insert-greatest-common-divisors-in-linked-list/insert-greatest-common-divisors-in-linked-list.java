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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null)
        {
            return head;
        }
        else
        {
ListNode curr=head;

  while (curr != null && curr.next != null)
{
    int gcd=GCD(curr.val,curr.next.val);
ListNode node=new ListNode(gcd);
node.next=curr.next;
curr.next=node;
curr=node.next;
}

return head;
        }
    }


    public int GCD(int a,int b)
     {
        int i;
        if (a < b)
            i = a;
        else
            i = b;
 
      
        for (i = i; i > 1; i--) {
 
    
            if (a % i == 0 && b % i == 0)
                return i;
        }
 
        return 1;
    }
}