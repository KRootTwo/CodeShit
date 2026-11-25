public class L148 {
	public static ListNode sortList(ListNode head) {
        return divAmerge(head);
    }	
	public static ListNode divAmerge(ListNode head) {
		if(head == null) return head;
		if(head.next == null) return head;

		ListNode fast = head, slow = head, head1 = head;

		while(fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		ListNode head2 = slow.next;
		slow.next = null;

		ListNode p = divAmerge(head1);
		ListNode q = divAmerge(head2);
		return merge(p, q);
	}
	public static ListNode merge (ListNode p, ListNode q) {
		ListNode r = new ListNode();
		ListNode dummy = r;

		while (p != null && q != null) {
			if (p.val < q.val) {
				dummy.next = p;
				dummy = dummy.next; 
				p = p.next; 
			}
			else {
				dummy.next = q;
				dummy = dummy.next; 
				q = q.next;
			}
		}
		if (p != null) dummy.next = p;
		if (q != null) dummy.next = q;
		return r;
	}

}
