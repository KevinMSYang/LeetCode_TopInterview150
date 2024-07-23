//Question:92
//Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.

package LinkedList;

public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0, head);
        ListNode pre = dummy;
        
        for (int i = 0; i < left -1; i++) {
        	pre = pre.next;
        }
        
        ListNode tail = pre.next;
        for (int i = 0; i < right - left; i++) {
        	ListNode cache = tail.next;
        	tail.next = cache.next;
        	cache.next = pre.next;
        	pre.next = cache;
        }
        return dummy.next;
    }
}
