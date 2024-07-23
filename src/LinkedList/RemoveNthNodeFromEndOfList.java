//Question:19
//Given the head of a linked list, remove the nth node from the end of the list and return its head.

package LinkedList;

public class RemoveNthNodeFromEndOfList {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode curr = head;
        while (curr != null || curr.next != null) {
        	curr = curr.next;
        	length++;
        }
        ListNode dummy = new ListNode(0, head);
        ListNode pre = dummy;
        for (int i = 0; i < length - n; i++) {
        	pre = pre.next;
        }
        
        ListNode tail = pre.next;
        ListNode cache = tail.next;
        pre.next = cache;
        return dummy.next;
    }
    
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        ListNode slow = head;
//        ListNode fast = head;
//
//        while (n-- > 0)
//          fast = fast.next;
//        if (fast == null)
//          return head.next;
//
//        while (fast.next != null) {
//          slow = slow.next;
//          fast = fast.next;
//        }
//        slow.next = slow.next.next;
//
//        return head;
//      }
}
