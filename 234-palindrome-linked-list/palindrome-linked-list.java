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
    public boolean isPalindrome(ListNode head) {
ListNode curr=head;
ListNode curr2=head;
int size=0;
boolean ans=true;
        // System.out.println(slowval);
        while(curr!=null)
        {
            size++;

            curr=curr.next;
        }
int arr[]=new int[size];
curr=head;
int i=0;
while(curr2!=null)
{
    arr[i]=curr2.val;
    curr2=curr2.next;
    i++;
}
System.out.println(Arrays.toString(arr));
i=0;
int j=arr.length-1;
while(i<j)
{
    if(arr[i]==arr[j])
    {
        ans=true;
    
    }
    else
    {
        ans=false;
        break;
    
    }
        i++;
        j--;

    }
    return ans;
}
}