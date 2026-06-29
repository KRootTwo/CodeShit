public class Qn21o {
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode dummy = new ListNode();
		ListNode curr = dummy;
		
		while (list1 != null && list2 != null) {
			if (list1.val <= list2.val) {
				curr.next = list1;
				list1 = list1.next;
				curr = curr.next;
			} else {
				curr.next = list2;
				list2 = list2.next;
				curr = curr.next;
			}
		}
		if (list1 != null) {
			curr.next = list1;
		}
		else {
			curr.next = list2;
		}
		return dummy.next;
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
		System.out.println("\nRES\n");
		
		ListNode res = mergeTwoLists(ln1, ln2);
		res.disp(res);
	}

}
