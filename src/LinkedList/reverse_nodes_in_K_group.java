package LinkedList;

import java.util.*;

public class reverse_nodes_in_K_group {
	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	class Solution {
	    public ListNode reverseKGroup(ListNode head, int k) {
	        Stack<ListNode> st = new Stack<>();
	        ListNode dummy = new ListNode();
	        ListNode temp = dummy;
	        ListNode start = null;
	        while(head != null) {
	        	if(st.size() == 0)
	        		start = head;
	        	st.push(head);
	        	if(st.size() == k) {
	        		while(!st.isEmpty()) {
	        			ListNode nn = new ListNode(st.pop().val);
	        			dummy.next = nn;
	        			dummy = dummy.next;
	        					
	        		}
	        	}
	        	head = head.next;
	        }
	        if(st.size()>0)
	        	dummy.next = start;
	        return temp.next;
	    }
	}
}
