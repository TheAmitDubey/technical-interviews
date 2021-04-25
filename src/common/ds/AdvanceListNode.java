package common.ds;

public class AdvanceListNode {
	public int val;
	public AdvanceListNode next;
	public AdvanceListNode random;
	
	public AdvanceListNode(int val) {
		this.val = val;
		this.next = null;
		this.random = null;
	}
	
	public AdvanceListNode(int val, AdvanceListNode next, AdvanceListNode random) {
		this.val = val;
		this.next = next;
		this.random = random;
	}
}
