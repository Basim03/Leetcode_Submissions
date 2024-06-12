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
    ListNode dummy=new ListNode(0);
    ListNode head=dummy;
    List<Integer> ans=new ArrayList<>();
  
        for(ListNode list: lists)
        {
            while(list!=null)
            {
        ans.add(list.val);
        list=list.next;
            }
        }
        
    Collections.sort(ans);
for(int val:ans){
dummy.next=new ListNode(val);
dummy=dummy.next;

}
return head.next;
   
        }
}