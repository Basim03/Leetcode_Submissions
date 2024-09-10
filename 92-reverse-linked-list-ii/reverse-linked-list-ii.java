class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left >= right) {
            return head;  // No need to reverse if the list is empty or left >= right
        }

        // Dummy node to handle edge cases where the head might change
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        // Step 1: Traverse to the node just before the 'left' position
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // `prev` is now at the node just before the 'left' position
        ListNode leftt = prev.next;
        ListNode curr = leftt;
        ListNode rightt = leftt;
        
        // Step 2: Traverse to the 'right' position node
        for (int i = left; i < right; i++) {
            rightt = rightt.next;
        }

        // `rightt` is now at the 'right' position node

        // Step 3: Reverse the sublist between `leftt` and `rightt`
        ListNode afterRight = rightt.next;  // Keep the node after 'right' position
        ListNode prevSublist = null;

        while (curr != afterRight) {
            ListNode next = curr.next;
            curr.next = prevSublist;
            prevSublist = curr;
            curr = next;
        }

        // Step 4: Reconnect the reversed part with the rest of the list
        prev.next = prevSublist;  // Connect the part before 'left' to the new head of reversed sublist
        leftt.next = afterRight;  // Connect the end of reversed sublist to the part after 'right'

        return dummy.next;  // Return the new head of the list
    }
}
