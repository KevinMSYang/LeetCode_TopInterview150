//Question: 61
//Given the head of a linked list, rotate the list to the right by k places.

package LinkedList;

import LinkedList.RemoveNthNodeFromEndOfList.ListNode;

public class RotateList {
	public ListNode rotateRight(ListNode head, int k) {
		if (head == null || head.next == null) {
			return head;
		}
		int length = 0;
		ListNode cur = head;
		while (cur != null) {
			cur = cur.next;
			length++;
		}
		
		int move = k % length;
		while (move > 0) {
			cur = head;
			ListNode pre = null;
			while (cur.next != null) {
				pre = cur;
				cur = cur.next;
			}
			cur.next = head;
			head = cur;
			pre.next = null;
			move--;
		}

		return head;
	}
	
//	  public ListNode rotateRight(ListNode head, int k) {
//		    if (head == null || head.next == null || k == 0)
//		      return head;
//
//		    int length = 1;
//		    ListNode tail = head;
//		    for (; tail.next != null; tail = tail.next)
//		      ++length;
//		    tail.next = head; // Circle the list.
//
//		    final int t = length - k % length;
//		    for (int i = 0; i < t; ++i)
//		      tail = tail.next;
//		    ListNode newHead = tail.next;
//		    tail.next = null;
//
//		    return newHead;
//		  }
}
