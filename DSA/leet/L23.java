public class L23 {
	public static ListNode mergeKLists(ListNode[] lists) {
		int l = lists.length;
		if (l == 0) return null;
		if (l == 1) return lists[0];
		
		ListNode p;
		ListNode q;
		
		for(int i = 1; i < l; i++) {
			p = lists[i - 1]; q = lists[i];
			lists[i] = merge(p, q);
		}
		return lists[l - 1];
	}
	public static ListNode merge(ListNode p, ListNode q) {
		ListNode dummy = new ListNode();
		ListNode r = dummy;
		while (p != null && q != null) {
			if (p.val < q.val) {
				dummy.next = p;
				dummy = dummy.next;
				p = p.next;
			} else {
				dummy.next = q;
				dummy = dummy.next;
				q = q.next;
			}
		}
		if (p != null) {
			dummy.next = p;
		}
		if (q != null) {
			dummy.next = q;
		} 
		return r.next;
	}
	public static void main(String[] args) {
		
	}

}
