//Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
//
// 
//
//	Example 1:
//	Input: head = [1,2,6,3,4,5,6], val = 6
//	Output: [1,2,3,4,5]
//	Example 2:
//
//	Input: head = [], val = 1
//	Output: []
//	Example 3:
//
//	Input: head = [7,7,7,7], val = 7
//	Output: []


package ArrayString;

public class RemoveLinkedListElement {
	public class ListNode{
		int val;
		ListNode next;
		ListNode() {
			
		}
		ListNode(int val) {
			this.val = val;
		}
		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
	public ListNode removeElements(ListNode head, int val)
	{
		while (head != null && head.val == val)
		{
			head = head.next;
		}
		ListNode currentNode = head;
		while (currentNode != null && currentNode.next != null)
		{
			if (currentNode.next.val == val)
			{
				currentNode.next = currentNode.next.next;
			}
			else
			{
				currentNode = currentNode.next;
			}
		}
		return head;
	}

}
