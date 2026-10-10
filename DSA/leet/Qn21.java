public class Qn21 {
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if (list1 == null) return list2;
		if (list2 == null) return list1;
		ListNode r = new ListNode();
		ListNode head = r;
		if (list1.val < list2.val || list1.val == list2.val) {
			r.val = list1.val;
			list1 = list1.next;
			
		} else {
			r.val = list2.val;
			list2 = list2.next;
		}
		
		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				r.next = new ListNode(list1.val);
				list1 = list1.next;
				r = r.next;
			} else {
				r.next = new ListNode(list2.val);
				list2 = list2.next;
				r = r.next;
			}
		}
		if (list1 != null) {
			while (list1 != null) {
				r.next = new ListNode(list1.val);
				r = r.next;
				list1 = list1.next;
			}
		} else {
			while (list2 != null) {
				r.next = new ListNode(list2.val);
				r = r.next;
				list2 = list2.next;
			}
		}
		return head;
	}
	public static void main(String[] args) {
		int list1[] = {1, 2, 4};
		int list2[] = {1, 3, 4};
		
		ListNode ln1 = new ListNode();
		ListNode ln2 = new ListNode();
		
		ln1 = ln1.fromArr(list1);
		ln2 = ln2.fromArr(list2);
		
		ln1.disp(ln1);
		ln2.disp(ln2);
		
		ListNode res = mergeTwoLists(ln1, ln2);
		res.disp(res);
	}

}
