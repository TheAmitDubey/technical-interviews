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
		
		while(cur != null) {
			AdvanceListNode tmp = cur.next;
			
			cur.next = new AdvanceListNode(cur.val, tmp, null);
			
			cur = tmp;
		}
		
		return copy;
		
	}

}
