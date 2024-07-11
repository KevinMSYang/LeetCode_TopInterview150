//Given the head of a linked list, rotate the list to the right by k places.
//
//Input: head = [1,2,3,4,5], k = 2
//Output: [4,5,1,2,3]
//		
//Input: head = [0,1,2], k = 4
//Output: [2,0,1]
				

package ArrayString;

public class RotateList {
	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
    public ListNode rotateRight(ListNode head, int k) {
    	if (head == null || head.next == null)
    	{
    		return head;
    	}
    	int len = 0;
    	ListNode pre = null;
    	ListNode cur = head;
    	
    	while (cur != null)
    	{
    		pre = cur;
    		cur = cur.next;
    		len++;
    	}
    	
    	cur = head;
    	pre.next = cur;
    	
    	int rotate = len - (k % len);
    	
    	for (int i = 0; i < rotate; i++)
    	{
    		pre = cur;
    		cur = cur.next;
    	}
    	pre.next = null;
    	
    	return cur;
    }
}
