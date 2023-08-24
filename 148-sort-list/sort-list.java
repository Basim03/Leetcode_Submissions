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
    // ListNode cur1=new ListNode(-1);
    ListNode temp=head;
  ListNode temp2=head;
  ListNode temp3=head;
    int size=0;
    while(temp!=null)
    {
        size+=1;
temp=temp.next;
    }
    int arr[]=new int[size];
    for(int i=0;i<size;i++)
    {
arr[i]=temp2.val;
temp2=temp2.next;
    }
    Arrays.sort(arr);
    head=temp3;
    //  System.out.println(Arrays.toString(arr));
    for(int i=0;i<size;i++)
    {
        
        // System.out.println(head.val);
    temp3.val=arr[i];
        // System.out.println(head.val);
        temp3=temp3.next;
    }

    

return head;
    }
}