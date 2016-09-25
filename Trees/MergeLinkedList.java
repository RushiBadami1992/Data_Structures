public class MergeLinkedList{
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
     if(l1 == null) return l2;
		if(l2 == null) return l1;
		if(l1.val < l2.val){
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else{
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
	}

 public ListNode swapPairs(ListNode node) {
         if (node == null || node.next == null) {
            return node;
        }
 
        // Initialize previous and current pointers
        ListNode prev = node;
        ListNode curr = node.next;
 
        node = curr;  // Change head before proceeeding
 
        // Traverse the list
        while (true) {
            ListNode next = curr.next;
            curr.next = prev; // Change next of current as previous node
 
            // If next NULL or next is the last node
            if (next == null || next.next == null) {
                prev.next = next;
                break;
            }
 
            // Change next of previous to next next
            prev.next = next.next;
 
            // Update previous and curr
            prev = next;
            curr = prev.next;
}

return node;
}
}

