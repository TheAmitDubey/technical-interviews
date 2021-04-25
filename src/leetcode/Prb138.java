package leetcode;

import common.ds.AdvanceListNode;

public class Prb138 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public AdvanceListNode copyList(AdvanceListNode head) {
		AdvanceListNode copy = null;
		
		AdvanceListNode cur = null;
		
		cur = head;
		
		//Copy node with next pointer
		
		while(cur != null) {
			AdvanceListNode tmp = cur.next;
			
			cur.next = new AdvanceListNode(cur.val, tmp, null);
			
			cur = tmp;
		}
		
		//Correct the random pointer
		cur = head;
		
		while(cur!=null) {
			if(cur.random != null) {
				cur.next.random = cur.random.next;
			}
			cur = cur.next.next;
		}
		
		// Remove the links
		
		cur = head;
		copy = head.next;
		
		while(cur!=null) {
			AdvanceListNode tmp = cur.next.next;
			copy = cur.next;
			cur.next = tmp;
			if(tmp != null) {
				copy.next = tmp.next;
			}
			cur = tmp;
		}
		
		return copy;
		
	}

}
