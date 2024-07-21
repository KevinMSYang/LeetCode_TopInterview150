//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.

package LinkedList;

public class AddTwoNumber {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode curr = ans;
        int totalNum = 0;
        
        while (l1 != null || l2 != null || totalNum > 0) {
        	if (l1 != null) {
        		totalNum += l1.val;
        		l1 = l1.next;
        	}
        	if (l2 != null) {
        		totalNum += l2.val;
        		l2 = l2.next;
        	}
        	
        	curr.next = new ListNode(totalNum % 10);
        	totalNum /= 10;
        	curr = curr.next;
        }
        return ans.next;
    }
}
