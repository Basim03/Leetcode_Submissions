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
    public ListNode getIntersectionNode(ListNode pointerA, ListNode pointerB) {
     ListNode headA = pointerA;
        ListNode headB = pointerB;
  while(headA!=headB)
  {
      if(headA==null)
      {
      headA=pointerB;
      }
      else
      {
      headA=headA.next;
      }
      if(headB==null)
      {
           headB=pointerA;
     
      }
      else
      {
      headB=headB.next;
      }
  }
return headA;

    
    }
}