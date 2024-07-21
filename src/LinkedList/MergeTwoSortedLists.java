//You are given the heads of two sorted linked lists list1 and list2.
//
//Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
//
//Return the head of the merged linked list.

package LinkedList;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode(0);
        ListNode curr = ans;
        
        while (list1 != null || list2 != null) {
        	if (list1 != null && list2 != null) {
        		if (list1.val <= list2.val) {
        			curr.next = new ListNode(list1.val);
        			list1 = list1.next;
        		}
        		else {
        			curr.next = new ListNode(list2.val);
        			list2 = list2.next;
        		}
        	}
        	else if (list1 == null && list2 != null) {
        		curr.next = new ListNode(list2.val);
        		list2 = list2.next;
        	}
        	else if (list1 != null && list2 == null) {
        		curr.next = new ListNode(list1.val);
        		list1 = list1.next;
        	}
        	curr = curr.next;
        }
        return ans.next;
    }
    
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        if (list1 == null || list2 == null)
//          return list1 == null ? list2 : list1;
//        if (list1.val > list2.val) {
//          ListNode temp = list1;
//          list1 = list2;
//          list2 = temp;
//        }
//        list1.next = mergeTwoLists(list1.next, list2);
//        return list1;
//      }
}
